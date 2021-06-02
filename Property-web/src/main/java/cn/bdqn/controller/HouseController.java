package cn.bdqn.controller;

import cn.bdqn.domain.Floor;
import cn.bdqn.domain.House;
import cn.bdqn.domain.Unit;
import cn.bdqn.mapper.FloorMapper;
import cn.bdqn.service.FloorService;
import cn.bdqn.service.HouseService;
import cn.bdqn.service.UnitService;
import com.github.pagehelper.PageInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.util.List;

@RestController
@RequestMapping("/house")
@CrossOrigin
public class HouseController {

    @Autowired
    public HouseService houseService;

    //根据房屋id查询房屋信息的方法
    @RequestMapping("/queryByIDHouse")
    @ResponseBody
    public House queryByIDHouse(Integer id){

        House house = houseService.houseQueryById(id);

        return house;

    }

    //根据房屋信息模糊查询带分页的房屋信息
    @RequestMapping("/queryByHouse")
    @ResponseBody
    public PageInfo<House> queryByHouse(@RequestParam(name = "currentPage",required = true,defaultValue = "1") Integer currentPage,
                                        House house){

        PageInfo<House> housePageInfo = houseService.queryAllByPageAndHouse(currentPage,10,house);

        return  housePageInfo;

    }

    //根据房屋编号删除房屋信息
    @RequestMapping("/deleteHouse")
    @ResponseBody
    public String deleteHouse(String numberId){
        houseService.houseDelete(numberId);
        return "删除成功！";
    }

    //根据房屋编号修改房屋信息
    @RequestMapping("/updateHouse")
    @ResponseBody
    public String updateHouse(House house){

        houseService.houseUpdate(house);

        return "修改成功！";
    }

    private FloorService floorService;
    private UnitService unitService;

    //添加房屋的时候，是最后的添加操作
    @RequestMapping("/saveHouse")
    @ResponseBody
    public String savetHouse(House house, HttpServletResponse response, HttpServletRequest request){

        HttpSession session = request.getSession();
        Floor floor = (Floor) session.getAttribute("floor");
        Unit unit = (Unit) session.getAttribute("unit");


        floorService.saveFloor(floor);
        unitService.saveUnit(unit);

        if(house != null){
            houseService.houseSave(house);
        }

        //在点击添加之后，会进行一次queryAll的操作，在前台的ajax回调函数内部，需要进行页面跳转

        return "添加成功！";
    }

}
