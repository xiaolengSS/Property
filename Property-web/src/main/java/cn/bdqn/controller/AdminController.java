package cn.bdqn.controller;


import cn.bdqn.domain.Admin;
import cn.bdqn.service.AdminService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Conditional;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import javax.imageio.ImageIO;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.util.Random;

@RestController
@RequestMapping("/admin")
@CrossOrigin
public class AdminController {

    private static final long serialVersionUID = -8030863139248720433L;

    private static int WIDTH = 191;

    private static int HEIGHT = 38;

    @Autowired
    private AdminService adminservice;
    //获取验证码
    @RequestMapping("/captcha")
    @ResponseBody

    public void captcha(HttpServletRequest req, HttpServletResponse resp) throws Exception{
        // 1、首先要有一张画布
        BufferedImage image = new BufferedImage(WIDTH, HEIGHT, BufferedImage.TYPE_INT_RGB);
        // 2、画笔
        Graphics graphics = image.getGraphics();

        // 2.1 背景
        graphics.setColor(Color.WHITE);
        graphics.fillRect(0, 0, WIDTH, HEIGHT);

        // 2.3 验证的数字和字母
        String[] arrs = {"0" , "1" , "2" , "3" , "4" , "5" , "6" , "7" , "8" , "9",
                "A" , "B" , "C" , "D" , "E" , "F" , "G" , "H" , "I" , "J",
                "a" , "b" , "c" , "d" , "e" , "f" , "g" , "h" , "i" , "j"};

        int x = 20;

        // 主要是为了组装验证码
        StringBuffer sb = new StringBuffer();
        for(int i = 0 ; i < 4 ; i++){
            int index = new Random().nextInt(arrs.length);

            String str = arrs[index];

            graphics.setColor(Color.RED);
            graphics.drawString(str, x * (i + 1 ) + 5, 23);

            sb.append(str);
        }

        // 2.4干扰线
        for(int i = 0 ; i < 5 ; i++){

            int x1 = new Random().nextInt(WIDTH);
            int y1 = new Random().nextInt(HEIGHT);

            int x2 = new Random().nextInt(WIDTH);
            int y2 = new Random().nextInt(HEIGHT);

            graphics.setColor(Color.GREEN);
            graphics.drawLine(x1, y1, x2, y2);
        }

        // 3、将生成好的验证码保存到session中
        HttpSession session = req.getSession();
        session.setAttribute("captcha", sb.toString());

        // 4、返回给浏览器
        resp.setContentType("image/jpeg");
        resp.setDateHeader("expires", -1);
        resp.setHeader("Cache-Control", "no-cache");
        resp.setHeader("Pragma", "no-cache");
        ImageIO.write(image,"jpg",resp.getOutputStream());
    }


    //查询管理员是否存在
    @RequestMapping("/queryByadmin")
    @ResponseBody
    public String  queryByadmin(Admin admin,HttpServletRequest request,String captcha){
        Integer count=adminservice.queryByadmin(admin);
        HttpSession session= request.getSession();
        //获取保存在session里面的验证码
        String sessioncaptcha= (String) session.getAttribute("captcha");
        String msg=null;
        if (captcha==sessioncaptcha || captcha.equals(sessioncaptcha)){
            if (count <=0)
            {
                msg= "账号或密码输入错误！";
            }else if(count>0)
            {
                session.setAttribute("username",admin.getUserName());

                msg= "登陆成功！";
                //清除session中保存的验证码
                session.removeAttribute("captcha");
            }
        }else{
            msg="验证码错误！";
        }
        return  msg;
    }

}
