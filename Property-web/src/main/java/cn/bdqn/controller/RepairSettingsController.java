package cn.bdqn.controller;

import cn.bdqn.domain.Dispatch;
import cn.bdqn.domain.RepairSettings;
import cn.bdqn.service.DispatchService;
import cn.bdqn.service.RepairSettingsService;
import com.github.pagehelper.PageInfo;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.awt.*;
import java.awt.image.BufferedImage;
import java.sql.Timestamp;
import java.util.Date;
import java.util.List;
import java.util.Random;
import java.util.zip.DataFormatException;

@RestController
@RequestMapping("/repairSettings")
@CrossOrigin
@Api(tags="报修设置模块")
public class RepairSettingsController {

    @Autowired
    private RepairSettingsService repairSettingsService;

    @Autowired
    private DispatchService dispatchService;

    //查询全部的派单方式
    @RequestMapping("/dispatchQueryAll")
    @ResponseBody
    @ApiOperation(value = "查询全部派单方式", notes = "查询派单方式",response = String.class)
    public List<Dispatch> dispatchQueryAll(){

        List<Dispatch> dispatches = dispatchService.dispatchQueryAll();

        return dispatches;
    }


    //查询全部报修设置表的信息&模糊查询
    @RequestMapping("/queryByRepairSettings")
    @ResponseBody
    @ApiOperation(value = "查询全部报修设置模糊查询", notes = "查询",response = String.class)
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

    private static final long serialVersionUID = -8030863139248720433L;

    private static int WIDTH = 191;

    private static int HEIGHT = 38;

    //添加保修设置的信息
    @RequestMapping("/saveRepairSettings")
    @ResponseBody
    @ApiOperation(value = "添加报修设置信息", notes = "添加",response = String.class)
    public String saveRepairSettings(RepairSettings repairSettings){

        // 1、首先要有一张画布
        BufferedImage image = new BufferedImage(WIDTH, HEIGHT, BufferedImage.TYPE_INT_RGB);

        // 2、画笔
        Graphics graphics = image.getGraphics();


        // 2.3 验证的数字和字母
        String[] arrs = {"0" , "1" , "2" , "3" , "4" , "5" , "6" , "7" , "8" , "9",
                "A" , "B" , "C" , "D" , "E" , "F" , "G" , "H" , "I" , "J",
                "a" , "b" , "c" , "d" , "e" , "f" , "g" , "h" , "i" , "j"};

        int x = 20;

        // 主要是为了组装验证码
        StringBuffer sb = new StringBuffer();
        for(int i = 0 ; i < 8 ; i++){
            int index = new Random().nextInt(arrs.length);

            String str = arrs[index];

            graphics.setColor(Color.RED);
            graphics.drawString(str, x * (i + 1 ) + 5, 23);

            sb.append(str);
        }

        repairSettings.setCreationTime(new Date());
        repairSettings.setDispatchType(sb.toString());
        repairSettingsService.repairSettingsSave(repairSettings);

        return "添加成功！";
    }


}
