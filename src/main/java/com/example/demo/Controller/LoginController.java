package com.example.demo.Controller;

import com.example.demo.service.UserService;
import com.sun.tools.corba.se.idl.constExpr.BooleanAnd;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import com.example.demo.model.User;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;
import java.util.Map;

@Controller
public class LoginController {
    private static Logger log = LoggerFactory.getLogger(LoginController.class);
    @Autowired
    private UserService userService;
    @RequestMapping("/login")
    public String login(){
        System.out.println("login 执行");
        return "/login/login";
    }
    @RequestMapping("/register")
    public String register(){
        log.info("register start");
        return "/login/register";
    }
    @RequestMapping("/userlogin")
    @ResponseBody
    public Boolean loginTest(HttpServletRequest request){
        User user = new User();
        user.setUserName(request.getParameter("userName"));
        user.setPassWord(request.getParameter("passWord"));
        Boolean loginFlag = false;
        System.out.println(request.getParameter("userName"));

        User usera = userService.getUser(user);



        return  usera != null;
    }
}
