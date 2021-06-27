package cn.bdqn.controller;

import cn.bdqn.domain.InformationOfCaringPersonnel;
import cn.bdqn.service.InformationOfCaringPersonnelService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiImplicitParams;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin
@Api(tags = "关怀人员信息模块")
@RequestMapping("/personnel")
@RestController
public class InformationOfCaringPersonnelController {

    @Autowired
    private InformationOfCaringPersonnelService informationOfCaringPersonnelService;

    @RequestMapping("/queryBy")
    @ResponseBody
    @ApiOperation(value = "关怀人员信息模块", notes = "关怀人员信息",response = String.class)
    public List<InformationOfCaringPersonnel> selectAll(){
        return informationOfCaringPersonnelService.selectAll();
    }

    @RequestMapping("/inner")
    @ResponseBody
    @ApiOperation(value = "添加关怀人员信息模块", notes = "添加关怀信息",response = String.class)
    public String inner(InformationOfCaringPersonnel informationOfCaringPersonnel) throws Exception{
        informationOfCaringPersonnelService.inner(informationOfCaringPersonnel);
        return  "保存成功！";
    }

    @RequestMapping("/deleteByid")
    @ResponseBody
    @ApiOperation(value = "删除关怀人员信息模块", notes = "根据id删除信息",response = String.class)
    public String deleteByid(Integer id) throws Exception{
        informationOfCaringPersonnelService.delete(id);
        return  "删除成功！";
    }

    @RequestMapping("/selectByid")
    @ResponseBody
    @ApiOperation(value = "关怀人员信息模块", notes = "根据id查询信息",response = String.class)
    public InformationOfCaringPersonnel selectByid(Integer id) throws Exception{
        return informationOfCaringPersonnelService.selectid(id);
    }

    @RequestMapping("/updataByid")
    @ResponseBody
    @ApiOperation(value = "修改关怀人员信息模块", notes = "根据id修改信息",response = String.class)
    public String updataByid(InformationOfCaringPersonnel informationOfCaringPersonnel) throws Exception{
        informationOfCaringPersonnelService.updata(informationOfCaringPersonnel);
        return  "修改成功！";
    }

    @RequestMapping("/selectBy")
    @ResponseBody
    @ApiOperation(value = "关怀人员信息模块", notes = "根据条件查询信息",response = String.class)
    public List<InformationOfCaringPersonnel> selectBy(InformationOfCaringPersonnel informationOfCaringPersonnel) throws Exception{
        return  informationOfCaringPersonnelService.select(informationOfCaringPersonnel);
    }


}
