package cn.bdqn.controller;

import cn.bdqn.domain.RepairSettings;
import cn.bdqn.service.RepairSettingsService;
import com.github.pagehelper.PageInfo;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/repairSettings")
@CrossOrigin
@Api(tags="报修设置模块")
public class RepairSettingsController {

    @Autowired
    private RepairSettingsService repairSettingsService;

    //查询全部报修设置表的信息&模糊查询
    @RequestMapping("/queryByRepairSettings")
    @ResponseBody
    @ApiOperation(value = "根据提供的报修设置进行模糊查询", notes = "模糊查询",response = String.class)
    public PageInfo<RepairSettings> queryByRepairSettings(@RequestParam(name="",required = true,defaultValue = "1")Integer currentPage,
                                                          RepairSettings repairSettings){
        PageInfo<RepairSettings> repairSettingsPageInfo = repairSettingsService.repairSettingsQueryVague(currentPage,10,repairSettings);
        return repairSettingsPageInfo;
    }

    //根据id修改报修设置的信息
    @RequestMapping("/updateByRepairSettings")
    @ResponseBody
    @ApiOperation(value = "根据报修设置id进行修改", notes = "修改",response = String.class)
    public String updateByRepairSettings(RepairSettings repairSettings){
        repairSettingsService.repairSettingsUpdateById(repairSettings);
        return "修改成功！";
    }

    //根据id实现删除报修设置的信息
    @RequestMapping("/repairSettingsDeleteById")
    @ResponseBody
    @ApiOperation(value = "根据报修设置id进行删除", notes = "删除",response = String.class)
    public String repairSettingsDeleteById(Integer id){
        repairSettingsService.repairSettingsDeleteById(id);
        return "删除成功！";
    }


    //添加保修设置的信息
    @RequestMapping("/saveRepairSettings")
    @ResponseBody
    @ApiOperation(value = "添加报修设置信息", notes = "添加",response = String.class)
    public String saveRepairSettings(RepairSettings repairSettings){
        repairSettingsService.repairSettingsSave(repairSettings);
        return "添加成功！";
    }


}
