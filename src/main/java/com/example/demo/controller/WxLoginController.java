package com.example.demo.controller;

import cn.hutool.core.util.StrUtil;
import com.example.demo.model.WxUser;
import com.example.demo.service.WxUserService;
import com.example.demo.util.Constant;
import com.example.demo.util.HttpClientUtil;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Controller
public class WxLoginController {
    private static Logger log = LoggerFactory.getLogger(WxLoginController.class);
    String appid ="wx4eebc44eb3450d20";
    String secret = "7f2f75fd7b35ba8e1f2e180c196f07e7";
    @Autowired
    private WxUserService wxuserService;

    @RequestMapping("/wxAuth")
    @ResponseBody
    public String wxAuth(HttpServletRequest request){
        log.info("wexin执行");
        String jsCode = request.getParameter("jsCode");
        if(!StrUtil.isBlank(jsCode)){
            String url = "https://api.weixin.qq.com/sns/jscode2session?appid="+appid+"&secret="+secret+"&js_code="+jsCode+"&grant_type=authorization_code";
            String response =  HttpClientUtil.doGet(url);

            log.info( " response is  : "+ response);

            return response;
        }
        return  "";
    }

    /**
     * 账户注册（用户绑定微信）
     * @return
     */
    @RequestMapping("/registerAccount")
    @ResponseBody
    public Map<String,Object> registerAccount(HttpServletRequest request){
        String openid = request.getParameter("openid");
        String userName = request.getParameter("userName");
        String passWord = request.getParameter("passWord");
        Map<String,Object> result = new HashMap<String,Object>();
        WxUser wxUser = new WxUser();
        wxUser.setOpenid(openid);
        List<WxUser> wxList =  wxuserService.getWxUserList(wxUser);
        if(wxList != null && wxList.size() > 0){
            result.put("code",Constant.faild);
        }
        wxUser.setUserName(userName);
        wxUser.setPassWord(passWord);

        wxuserService.saveWxUser(wxUser,"add");
        result.put("code",Constant.success);
        return result;
    }

}
