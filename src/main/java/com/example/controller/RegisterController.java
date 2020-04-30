package com.example.controller;

import com.example.entity.peopleManager.User;
import com.example.result.Result;
import com.example.result.ResultFactory;
import com.example.service.serviceImpl.UserServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.util.HtmlUtils;

import javax.servlet.http.HttpSession;

@RestController
public class RegisterController {

    @Autowired
    private UserServiceImpl userService;

    @CrossOrigin//支持跨域
    @PostMapping("/register")
    @ResponseBody
    public Result register(@RequestBody User requestUser,HttpSession session){
//    	String uno = requestUser.getU_no();
//        String jobNum = requestUser.getJobNum();
//    	uno = HtmlUtils.htmlEscape(uno);//将数据转义
//        User user = userService.selectUserByJobNum(jobNum);
//        User user = userService.selectUserByUNo(uno);
    	
	    	boolean flag = userService.addUser(requestUser);
	    	if(flag){
	            return ResultFactory.bulidSuccessResult(requestUser);
	        }else {
	            return ResultFactory.bulidFailResult("添加失败");
	        }
    }

//    @CrossOrigin
//    @PostMapping("/")
//    @ResponseBody
//    public Result logout(HttpSession httpSession){
//        httpSession.removeAttribute("user");
//        return ResultFactory.bulidSuccessResult("请重新登录");
//    }

}
