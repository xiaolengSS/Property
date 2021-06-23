package cn.bdqn.controller;

import cn.bdqn.domain.EmployeeInformation;
import cn.bdqn.domain.RepairMaster;
import cn.bdqn.domain.RepairState;
import cn.bdqn.service.RepairMasterService;
import cn.bdqn.service.RepairStateService;
import com.github.pagehelper.PageInfo;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/repairMaster")
@CrossOrigin
@Api(tags = "报修师傅模块")
public class RepairMasterController {

    @Autowired
    private RepairMasterService repairMasterService;

    @Autowired
    private RepairStateService repairStateService;

    //查询全部保修师傅状态信息
    @RequestMapping("/repairStateQueryAll")
    @ResponseBody
    @ApiOperation(value = "查询全部报修师傅状态", notes = "查询全部状态",response = String.class)
    public List<RepairState> repairStateQueryAll(){

        return repairStateService.repairStateQueryAll();

    }



    //查询全部报修师傅
    @RequestMapping("/employeeInformationQueryAll")
    @ResponseBody
    @ApiOperation(value = "查询全部报修师傅信息", notes = "查询全部",response = String.class)
    public PageInfo<RepairMaster> employeeInformationQueryAll(@RequestParam(name="",required = true,defaultValue = "1")Integer currentPage,
                                                              RepairMaster repairMaster){

        PageInfo<RepairMaster> repairMasterPageInfo = repairMasterService.repairMasterQueryAll(currentPage,10);

        return repairMasterPageInfo;
    }

    //根据id修改保修师傅信息
    @RequestMapping("/repairMasterUpdate")
    @ResponseBody
    @ApiOperation(value = "根据id修改保修师傅信息", notes = "修改",response = String.class)
    public String repairMasterUpdate(RepairMaster repairMaster){

        repairMasterService.repairMasterUpdate(repairMaster);

        return "修改成功！";
    }

    //根据id删除保修师傅信息
    @RequestMapping("/repairMasterDelete")
    @ResponseBody
    @ApiOperation(value = "根据id删除保修师傅信息", notes = "删除",response = String.class)
    public String repairMasterDelete(Integer id){

        repairMasterService.repairMasterDelete(id);

        return "删除成功！";
    }

    //保存保修师傅信息
    @RequestMapping("/repairMasterSave")
    @ResponseBody
    @ApiOperation(value = "保存报修师傅信息", notes = "添加",response = String.class)
    public String repairMasterSave(RepairMaster repairMaster){

        repairMasterService.repairMasterSave(repairMaster);

        return "保存成功！";
    }



}
