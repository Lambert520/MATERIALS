package com.example.controller;

import com.example.entity.peopleManager.DormitoryMbr;
import com.example.entity.peopleManager.User;
import com.example.result.Result;
import com.example.result.ResultFactory;
import com.example.service.DormitoryMbrService;
import com.example.service.serviceImpl.UserServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.util.HtmlUtils;

import javax.servlet.http.HttpSession;

@RestController
public class LoginController {

    @Autowired
    private UserServiceImpl userService;

    @Autowired
    private DormitoryMbrService dormitoryMbrService;
    @Autowired
    HttpSession httpSession;

    @CrossOrigin//支持跨域
    @PostMapping("/login")
    @ResponseBody
    public Result login(@RequestBody User requestUser){
    	String uno = requestUser.getU_no();
    	uno = HtmlUtils.htmlEscape(uno);//将数据转义
        User user = userService.findUserByNoAndPassword(uno,requestUser.getU_password());
        if(null == user){
            String message = "工号&密码错误！";
            System.out.println(message);
            return ResultFactory.bulidFailResult(message);

        }else {
            httpSession.setAttribute("user",user);
            if(user.getU_type().equals("舍长")){
                DormitoryMbr dormitoryMbr = dormitoryMbrService.selectDMBySno(user.getU_no());
                user.setD_no(dormitoryMbr.getD_no());
            }
            return ResultFactory.bulidSuccessResult(user);
        }

    }

    @CrossOrigin
    @PostMapping("/logout")
    @ResponseBody
    public Result logout(HttpSession httpSession){
        httpSession.removeAttribute("user");
        return ResultFactory.bulidSuccessResult("请重新登录");
    }

}
