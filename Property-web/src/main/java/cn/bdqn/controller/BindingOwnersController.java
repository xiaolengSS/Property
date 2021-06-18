package cn.bdqn.controller;

import cn.bdqn.domain.BindingOwners;
import com.github.pagehelper.PageInfo;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;

/**
 * @author zhangcong
 * 业主绑定
 */

@Api(tags = "业主绑定模块")
@RestController
@RequestMapping("/bdOwners")
public class BindingOwnersController {

    @Autowired
    private cn.bdqn.service.BindingOwnersService BindingOwnersService;


    @ApiOperation(value = "查询业主绑定信息", notes = "业主绑定",response = String.class)
    @RequestMapping("/queryOwnerInfo")
    @ResponseBody
    public PageInfo<BindingOwners> queryOwnerInfo(@RequestParam(name="currentPage",required = true,defaultValue = "1")Integer currentPage, BindingOwners bindingOwners, HttpServletRequest request){
        PageInfo<BindingOwners> bindingOwnersPageInfo =BindingOwnersService.queryBinDingOwners(bindingOwners,currentPage,5);
        return  bindingOwnersPageInfo;
    }
}
