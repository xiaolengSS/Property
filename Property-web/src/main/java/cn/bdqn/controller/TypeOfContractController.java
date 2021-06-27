package cn.bdqn.controller;

import cn.bdqn.domain.InformationOfCaringPersonnel;
import cn.bdqn.domain.TypeOfContract;
import cn.bdqn.service.TypeOfContractService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

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

    @RequestMapping("/inner")
    @ResponseBody
    @ApiOperation(value = "添加合同类型信息", notes = "添加合同类型信息",response = String.class)
    public String inner(TypeOfContract typeOfContract){
        typeOfContractService.inner(typeOfContract);
        return "保存成功！";
    }
}
