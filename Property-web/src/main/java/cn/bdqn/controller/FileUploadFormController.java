package cn.bdqn.controller;

import cn.bdqn.domain.HouseholdMember;
import cn.bdqn.service.HouseholdMemberService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RequestPart;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartFile;

import javax.servlet.http.HttpServletRequest;
import java.io.File;

@Controller
public class FileUploadFormController {

    @Autowired
    private HouseholdMemberService householdMemberService;

    @RequestMapping(value = "/upload")
    @ResponseBody
    public String upload(HttpServletRequest request,
                         @RequestParam("urlImg") MultipartFile urlImg) throws Exception{

        // 1、得到文件上传的路径
        String path = request.getServletContext().getRealPath("/public/");
        File destPath = new File(path);
        if(!destPath.exists()){
            destPath.mkdirs();
        }

        // 获得原始名称
        String originalFilename = urlImg.getOriginalFilename();

        // 文件上传
        urlImg.transferTo(new File(destPath,originalFilename));

        System.out.println(originalFilename);

        return "public/"+originalFilename;
    }
}
