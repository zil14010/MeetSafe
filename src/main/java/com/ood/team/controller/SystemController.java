package com.ood.team.controller;

import com.wf.captcha.utils.CaptchaUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

/**
 * @author c1515
 */
@Controller
@RequestMapping("/system")
public class SystemController {


    @RequestMapping("/getCaptcha")
    public void getCaptcha(HttpServletRequest request, HttpServletResponse response) throws Exception {
        CaptchaUtil.out(request, response);
    }

    @RequestMapping("/goInformation")
    public String goInformation(){
        return "system/information";
    }
    @RequestMapping("/myprofile")
    public String myprofile(){
        return "profile";
    }

    @RequestMapping("/login")
    @ResponseBody
    public Map<String, Object> login(String id, String password, String verCode, String userType, HttpSession session, HttpServletRequest request){
        System.out.println(id + " " + password + " " + userType);
        Map<String, Object> map = new HashMap<String, Object>();
//
//        if (!CaptchaUtil.ver(verCode, request)) {
//            CaptchaUtil.clear(request);
//            map.put("success", false);
//            map.put("msg", "验证码错误");
//            return map;
//        }

        Object object = null;

//        switch (userType) {
//            case "1":
//                object = adminService.login(id, password);
//                break;
//            case "2":
//                object = teacherService.login(id, password);
//                break;
//
//        }
        map.put("success", true);
        map.put("msg", "登录成功");
        session.setAttribute("userInfo", object);
        session.setAttribute("userType", Integer.parseInt(userType));
//        if(object != null) {
//            session.setAttribute("userInfo", object);
//            session.setAttribute("userType", Integer.parseInt(userType));
//            map.put("success", true);
//            map.put("msg", "登录成功");
//        } else{
//            map.put("success", false);
//            map.put("msg", "用户名或密码错误");
//        }

        return map;
    }

    @RequestMapping("/myactivity")
    private String goactivity(){
        return "myActivity";
    }
    @RequestMapping("/goMain")
    private String goMain(){
        return "activitySquare";
    }

    @RequestMapping("/goWelcome")
    private String goWelcome(){
        return "system/welcome";
    }

    @RequestMapping("/goLogout")
    private void goLogout(HttpSession session, HttpServletRequest request, HttpServletResponse response) throws IOException {
        session.removeAttribute("userInfo");
        session.removeAttribute("userType");
        response.sendRedirect(request.getContextPath());
    }


    @RequestMapping("/getUserInfo")
    @ResponseBody
    private Map<String, Object> getUserInfo(HttpSession session){
        Map<String, Object> map = new HashMap<String, Object>();
        map.put("userInfo", session.getAttribute("userInfo"));
        return map;
    }

}
