package cn.bdqn.controller;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.web.bind.annotation.*;

import java.util.Date;

@RestController
@CrossOrigin
@Api(tags = "测试日期格式")
public class HelloController {

    @RequestMapping(method = RequestMethod.GET, path = "/hello")
    @ResponseBody
    @ApiOperation(value = "测试日期", notes = "测试",response = String.class)
    public String hello(Date date) {
        // 测试简单类型
        //date = new Date();
        System.out.println(date);

        return "Hello SpringBoot";
    }

}
