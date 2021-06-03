package cn.bdqn.controller;

import cn.bdqn.domain.Floor;
import cn.bdqn.domain.House;
import cn.bdqn.domain.Unit;
import cn.bdqn.service.FloorService;
import cn.bdqn.service.HouseService;
import cn.bdqn.service.UnitService;
import com.github.pagehelper.PageInfo;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiImplicitParams;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@RestController
@RequestMapping("/house")
@CrossOrigin
@Api(tags = "房屋管理模块")
public class HouseController {

    @Autowired
    public HouseService houseService;

    //根据房屋id查询房屋信息的方法
    @RequestMapping("/queryByIDHouse")
    @ResponseBody
    @ApiOperation(value = "根据id查询房屋信息模块", notes = "根据id查询房屋信息模块",response = String.class)
    public House queryByIDHouse(Integer id){

        House house = houseService.houseQueryById(id);

        return house;

    }

    //根据房屋信息模糊查询带分页的房屋信息
    @RequestMapping("/queryByHouse")
    @ResponseBody
    @ApiOperation(value = "根据房屋信息模糊查询带分页的房屋信息", notes = "根据房屋信息模糊查询带分页的房屋信息",response = String.class)
    public PageInfo<House> queryByHouse(@RequestParam(name = "currentPage",required = true,defaultValue = "1") Integer currentPage,
                                        House house){

        PageInfo<House> housePageInfo = houseService.queryAllByPageAndHouse(currentPage,10,house);

        return  housePageInfo;

    }

    //根据房屋编号删除房屋信息
    @RequestMapping("/deleteHouse")
    @ResponseBody
    @ApiOperation(value = "根据房屋编号删除房屋信息", notes = "根据房屋编号删除房屋信息",response = String.class)
    public String deleteHouse(String numberId){
        houseService.houseDelete(numberId);
        return "删除成功！";
    }

    //根据房屋编号修改房屋信息
    @RequestMapping("/updateHouse")
    @ResponseBody
    @ApiOperation(value = "根据房屋编号修改房屋信息", notes = "根据房屋编号修改房屋信息",response = String.class)
    public String updateHouse(House house){

        houseService.houseUpdate(house);

        return "修改成功！";
    }

    private FloorService floorService;
    private UnitService unitService;

    //添加房屋的时候，是最后的添加操作
    @RequestMapping("/saveHouse")
    @ResponseBody
    @ApiOperation(value = "添加房屋", notes = "添加房屋",response = String.class)
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

    //房屋解绑
    @RequestMapping("/changeByHouseholdUnbundle")
    @ApiOperation(value = "业主房屋解绑", notes = "业主房屋解绑",response = Integer.class)
    @ApiImplicitParams({
            @ApiImplicitParam(name="id", value="业主id", dataTypeClass = Integer.class)
    })
    public Integer changeByHouseholdUnbundle(Integer id){
        return houseService.changeByHouseholdUnbundle(id);
    }

    //房屋绑定 id:业主id houseId：房屋ID
    @RequestMapping("/changeByHouseholdBinding")
    @ApiOperation(value = "业主房屋解绑", notes = "业主房屋解绑",response = Integer.class)
    @ApiImplicitParams({
            @ApiImplicitParam(name="id", value="业主id", dataTypeClass = Integer.class),
            @ApiImplicitParam(name="houseId", value="房屋ID",dataTypeClass = Integer.class)
    })
    public Integer changeByHouseholdBinding(Integer id,Integer houseId){
        return houseService.changeByHouseholdBinding(id,houseId);
    }
}
