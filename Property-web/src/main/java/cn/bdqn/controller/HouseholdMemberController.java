package cn.bdqn.controller;

import cn.bdqn.domain.HouseholdMember;
import cn.bdqn.domain.TheOwnerType;
import cn.bdqn.service.HouseholdMemberService;
import cn.bdqn.service.TheOwnerTypeService;
import io.swagger.annotations.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import java.io.File;
import java.util.List;

@Api(tags = "业主成员模块")
@Controller
@RequestMapping("/householdmember")
@CrossOrigin
public class HouseholdMemberController {

    @Autowired
    private HouseholdMemberService householdMemberService;

    @Autowired
    private TheOwnerTypeService theOwnerTypeService;


    //查询全部的业主成员类型
    @RequestMapping("/thwOwnerTypeQueryAll")
    @ResponseBody
    @ApiOperation(value = "查询成员类型模块", notes = "查询业主成员类型",response = String.class)
    public List<TheOwnerType> thwOwnerTypeQueryAll(){
        List<TheOwnerType> theOwnerTypes = theOwnerTypeService.theOwnerTypeQueryAll();
        return theOwnerTypes;
    }

    //根据业主id查询业主成员信息
    @RequestMapping("/queryByHouseholdId")
    @ResponseBody
    @ApiOperation(value = "根据业主id查询业主成员模块", notes = "根据id查询业主成员信息",response = String.class)
    @ApiImplicitParams(
            {@ApiImplicitParam(name="houseHoldId", value="业主id", dataTypeClass = Integer.class)})
    public List<HouseholdMember> houseHoldMemberByholdId(Integer houseHoldId){

        List<HouseholdMember> householdMembers = householdMemberService.householdMemberQueryByHouseholdId(houseHoldId);

        return householdMembers;
    }


    //保存成员信息
    @RequestMapping("/save")
    @ResponseBody
    @ApiOperation(value = "保存成员模块", notes = "保存成员信息",response = String.class)
    public String houseHoldMemberSave(HttpServletRequest request,HouseholdMember householdMember)throws Exception{


        HttpSession session = request.getSession();
        String theOwnerName = (String) session.getAttribute("theOwnerName");

        householdMember.setTheOwnerCreate(theOwnerName);

        //实现添加操作
        householdMemberService.householdMemberSave(householdMember);

        return "保存成功！";

    }

    //删除成员信息
    @RequestMapping("/delete")
    @ResponseBody
    @ApiOperation(value = "删除成员模块", notes = "根据成员id删除成员信息",response = String.class)
    public String houseHoldMemberDelete(Integer theOwnerId){
        householdMemberService.householdMemberDeleteByTheOwnerId(theOwnerId);
        return "删除成功！";
    }

    //修改成员信息
    @RequestMapping("/update")
    @ResponseBody
    @ApiOperation(value = "修改成员模块", notes = "根据id修改业主成员信息",response = String.class)
    public String houseHoldMemberUpdate(HttpServletRequest request,HouseholdMember householdMember) throws Exception{

        //实现修改操作
        householdMemberService.householdMemberUpdate(householdMember);

        return "修改成功！";
    }

}
