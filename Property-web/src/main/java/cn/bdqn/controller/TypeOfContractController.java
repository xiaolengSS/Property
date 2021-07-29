package cn.bdqn.controller;

import cn.bdqn.domain.InformationOfCaringPersonnel;
import cn.bdqn.domain.TypeOfContract;
import cn.bdqn.service.TypeOfContractService;
import com.github.pagehelper.PageInfo;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.models.auth.In;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

@CrossOrigin
@Api(tags = "合同类型")
@RequestMapping("/Contract")
@RestController
public class TypeOfContractController {

    @Autowired
    private TypeOfContractService typeOfContractService;

    @RequestMapping("/queryBy")
    @ResponseBody
    @ApiOperation(value = "合同类型信息", notes = "合同类型信息",response = String.class)
    public List<TypeOfContract> selectAll(){
        return typeOfContractService.selectAll();
    }

    @RequestMapping("/selectAll1")
    @ResponseBody
    @ApiOperation(value = "分页", notes = "合同类型信息",response = String.class)
    public PageInfo<TypeOfContract> selectAll1(@RequestParam(name = "currentPage",required = true,defaultValue = "1")Integer currentPage){
        return typeOfContractService.selectAll1(currentPage,5);
    }

    @RequestMapping("/selectAllif")
    @ResponseBody
    @ApiOperation(value = "条件分页", notes = "合同类型信息",response = String.class)
    public PageInfo<TypeOfContract> selectAll2(@RequestParam(name = "currentPage",required = true,defaultValue = "1")Integer currentPage,TypeOfContract typeOfContract){
        return typeOfContractService.selevtAll2(currentPage,5,typeOfContract);
    }

    @RequestMapping("/inner")
    @ResponseBody
    @ApiOperation(value = "添加合同类型信息", notes = "添加合同类型信息",response = String.class)
    public String inner(TypeOfContract typeOfContract){
        typeOfContractService.inner(typeOfContract);
        return "保存成功！";
    }

    @RequestMapping("/delete")
    @ResponseBody
    @ApiOperation(value = "删除合同类型信息", notes = "删除合同类型信息",response = String.class)
    public String delete(Integer id){
        typeOfContractService.delete(id);
        return "删除成功！";
    }
}
