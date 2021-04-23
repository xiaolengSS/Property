package cn.bdqn.controller;

import cn.bdqn.domain.Unit;
import cn.bdqn.service.UnitService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpRequest;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import java.util.List;

@RestController
@RequestMapping("/unit")
public class UnitController {

    @Autowired
    private UnitService unitService;

    //条件查询楼栋下的单元信息表
    //根据前端返回的多个条件或没条件，查询单元信息返回字符串
    @RequestMapping("/displayUnit")
    @ResponseBody
    public List<Unit> queryByUnit(Unit unit){
        List<Unit> units = unitService.queryByUnit(unit);
        return units;
    }

    //判断用户是否存在
    @RequestMapping("/judgeUnit")
    public String judgeUnit(Integer unitNumber){
        int judge = unitService.judgeUnit(unitNumber);

        String data = "单元编号不存在";
        if(judge > 0){
            data = "单元编号已存在！";
        }

        return data;
    }

    //根据单元id修改单元信息
    //根据前端返回的信息进行修改单元
    @RequestMapping("/updateUnit")
    public String updateUnit(Unit unit){
        unitService.updateUnit(unit);
        return "修改成功！";
    }
    //根据单元id进行删除单元信息
    //根据前端返回id进行删除单元
    @RequestMapping("/deleteUnit")
    public String deleteUnit(Integer id){

        unitService.deleteUnit(id);

        return "删除成功！";
    }
    //保存单元信息
    //根据前端传送数据进行新增
    @RequestMapping("/saveUnit")
    public String saveUnit(HttpServletRequest request, Unit unit){
        //从session中拿到用户名
        HttpSession session = request.getSession();
        String username=(String) session.getAttribute("username");
        unit.setUnitCreator(username);
        unitService.saveUnit(unit);

        String data = null;

        if(unit.getId() != null){
            data = "插入成功！";
        }

        return data;

    }

    //房屋表要用到的方法
    //添加房屋的时候，需要根据楼栋编号查询单元信息
    @RequestMapping("queryUnitByFloorId")
    public Unit queryUnitByFloorId(Integer floorId){

        Unit unit = unitService.queryUnitByFloorId(floorId);

        return unit;
    }

    //在点击添加房屋的时候，进行的未保存到数据库的谎插入操作
    @RequestMapping("/unitAndHouseSave")
    @ResponseBody
    public String unitSave(Unit unit, HttpServletRequest request){

        //判断传递过来的数据，是否和数据库重复
        HttpSession session;
        String msgUnit = null;
        Unit unit1 = unitService.queryByUnitNumber(unit.getUnitNumber());
        if(unit1==null){
            //如果数据不冲突，就将内容保存在session内
            session = request.getSession();
            session.setAttribute("unit",unit);
            msgUnit = "保存成功！";
        }else {
            msgUnit = "数据冲突,请重新输入！";
        }
        return msgUnit;
    }



}
