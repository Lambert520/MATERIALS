package com.example.controller.peopleManager;

import com.example.entity.peopleManager.User;
import com.example.mapper.UserMapper;
import com.example.result.Result;
import com.example.result.ResultFactory;
import com.example.service.serviceImpl.UserServiceImpl;
import org.apache.ibatis.annotations.Param;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpSession;
import java.util.ArrayList;
import java.util.List;

@RestController
public class UserController {

    @Autowired
    private UserServiceImpl userService;

    @Autowired
    private HttpSession httpSession;
    @Autowired
    private UserMapper userMapper;

    @CrossOrigin
    @GetMapping("/user")
    @ResponseBody
    public List<User> getAllUser(@RequestParam(required = false) String u_type, @RequestParam(required = false) String u_no,@Param("u_name") String u_name) {
        if ("学生".equals(u_type) || "班主任".equals(u_type) || "舍长".equals(u_type)) {
            List<User> list = new ArrayList<>();
            User user1 = userService.selectUserByUNo(u_no);
            list.add(user1);
            return list;
        } else {
            return userService.findAllUser(null,u_name);
        }
    }

    @CrossOrigin
    @GetMapping("/getUser")
    @ResponseBody
    public Result getUser(String u_type) {
        return ResultFactory.bulidSuccessResult(userService.findAllUser(u_type,null));
    }

    @CrossOrigin
    @PostMapping("/user")
    @ResponseBody
    public Result addUser(@RequestBody User requestUser) {
        User user = userService.selectUserByUNo(requestUser.getU_no());
        if(user != null){
            return ResultFactory.bulidFailResult("当前学号已经存在了");
        }
        boolean flag = userService.addUser(requestUser);
        if (flag) {
            return ResultFactory.bulidSuccessResult(requestUser);
        } else {
            return ResultFactory.bulidFailResult("添加失败");
        }

    }

    @CrossOrigin
    @PutMapping("/user")
    @ResponseBody
    public Result updateUser(@RequestBody User requestUser) {
        boolean flag = userService.updateUser(requestUser);
        if (flag) {
            return ResultFactory.bulidSuccessResult(requestUser);
        } else {
            return ResultFactory.bulidFailResult("添加失败");
        }
    }

    //get和delete方式不支持@RequestBody！！！
    @CrossOrigin
    @DeleteMapping("/user")
    @ResponseBody
    public Result deleteUser(@RequestBody User user) {
        System.out.println(user.getU_no());
        boolean flag = userService.deleteUser(String.valueOf(user.getId()));

        if (flag) {
            return ResultFactory.bulidSuccessResult("success");
        } else {
            return ResultFactory.bulidFailResult("添加失败");
        }
    }

}
