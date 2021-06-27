package cn.bdqn.controller;

import cn.bdqn.domain.EmployeeInformation;
import cn.bdqn.service.EmployeeInformationService;
import com.github.pagehelper.PageInfo;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@Api(tags = "员工信息模块")
@RequestMapping("/employeeInformation")
@CrossOrigin
public class EmployeeInformationController {

    @Autowired
    private EmployeeInformationService employeeInformationService;

    //查询全部员工信息&模糊查询
    @RequestMapping("/employeeInformationQueryVague")
    @ResponseBody
    @ApiOperation(value = "查询全部员工信息", notes = "模糊查询",response = String.class)
    public PageInfo<EmployeeInformation> employeeInformationQueryVague(@RequestParam(name="",required = true,defaultValue = "1")Integer currentPage,
                                                                       EmployeeInformation employeeInformation){

        PageInfo<EmployeeInformation> employeeInformationPageInfo = employeeInformationService.employeeInformationQueryVague(currentPage,10,employeeInformation);

        return employeeInformationPageInfo;
    }


    //根据员工id修改员工信息
    @RequestMapping("/employeeInformationUpdateById")
    @ResponseBody
    @ApiOperation(value = "根据id修改员工信息", notes = "修改",response = String.class)
    public String employeeInformationUpdateById(EmployeeInformation employeeInformation){

        employeeInformationService.employeeInformationUpdateById(employeeInformation);

        return "修改成功！";
    }

    //根据id删除员工信息
    @RequestMapping("/employeeInformationDeleteById")
    @ResponseBody
    @ApiOperation(value = "根据id删除员工信息", notes = "删除",response = String.class)
    public String employeeInformationDeleteById(Integer id){
        employeeInformationService.employeeInformationDeleteById(id);
        return "删除成功！";
    }


    //添加员工信息
    @RequestMapping("/employeeInformationSave")
    @ResponseBody
    @ApiOperation(value = "保存员工信息", notes = "保存",response = String.class)
    public String employeeInformationSave(EmployeeInformation employeeInformation){

        employeeInformationService.employeeInformationSave(employeeInformation);
        return "保存成功！";
    }


}
