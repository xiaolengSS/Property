package cn.bdqn.controller;


import cn.bdqn.domain.Household;
import cn.bdqn.service.HouseholdService;
import com.github.pagehelper.PageInfo;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiImplicitParams;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import org.springframework.web.bind.annotation.CrossOrigin;

/**
 * @author jinsuisheng
 * @date 2021年05月24日 14:56
 */
@CrossOrigin
@Api(tags = "业主模块")
@RequestMapping("/household")
@RestController
public class HouseholdController {

    @Autowired
    private HouseholdService householdService;

    //分页显示全部，或根据条件查询全部。
    //注：如果前端传送房屋编号，需以房屋（类）对象点房屋中的房屋编号；house.houseNumberId
    @ApiOperation(value = "业主分页查询", notes = "业主分页查询", response = String.class)
    @ApiImplicitParams(
            {@ApiImplicitParam(name = "currentPage", value = "分页页码", dataTypeClass = String.class),
                    @ApiImplicitParam(name = "household", value = "查询条件", dataTypeClass = String.class)
            })
    @RequestMapping("/queryAllByHouseholdPage")
    @ResponseBody
    public PageInfo<Household> queryAllByHouseholdPage(@RequestParam(name = "currentPage", required = true, defaultValue = "1") Integer currentPage, Household household) {


        PageInfo<Household> pageInfo = householdService.queryAllByHouseholdPage(currentPage, 10, household);


        return pageInfo;
    }

    //返回单条业主信息
    @ApiOperation(value = "业主单条查询", notes = "业主单条查询，修改回显", response = String.class)
    @ApiImplicitParams(
            {@ApiImplicitParam(name = "household", value = "查询条件", dataTypeClass = String.class)})
    @RequestMapping("/queryHouseholdById")
    @ResponseBody
    public Household queryHouseholdById(Household household) {
        return householdService.queryHousehold(household);
    }

    //添加业主
    @ApiOperation(value = "添加业主", notes = "添加业主", response = String.class)
    @ApiImplicitParams(
            {@ApiImplicitParam(name = "request", value = "获取Session", dataTypeClass = String.class),
                    @ApiImplicitParam(name = "household", value = "添加内容", dataTypeClass = String.class)
            })
    @RequestMapping("/saveHousehold")
    @ResponseBody
    public String saveHousehold(HttpServletRequest request, Household household) {

        //HttpSession session = request.getSession();
       // String username = (String) session.getAttribute("username");

        household.setCreator("猜猜");

        int i = householdService.saveHousehold(household);

        String data = null;
        if (i > 0) {
            data = "插入成功";
        }

        return data;
    }

    //修改业主
    @ApiOperation(value = "修改业主", notes = "修改业主", response = String.class)
    @ApiImplicitParams(
            {@ApiImplicitParam(name = "household", value = "修改内容及修改业主", dataTypeClass = String.class)
            })
    @RequestMapping("/updateHousehold")
    @ResponseBody
    public String updateHousehold(Household household) {

        householdService.updateHousehold(household);

        return "修改成功！";
    }

    //删除业主
    @ApiOperation(value = "删除业主", notes = "删除业主", response = String.class)
    @ApiImplicitParams(
            {@ApiImplicitParam(name = "id", value = "业主id", dataTypeClass = String.class)
            })
    @RequestMapping("/deleteHousehold")
    @ResponseBody
    public String deleteHousehold(Integer id) {

        householdService.deleteHousehold(id);

        return "删除成功！";
    }
}