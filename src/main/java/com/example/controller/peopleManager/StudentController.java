package com.example.controller.peopleManager;

import com.example.entity.peopleManager.Student;
import com.example.result.Result;
import com.example.result.ResultFactory;
import com.example.service.serviceImpl.StudentServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpSession;
import java.util.List;

@RestController
public class StudentController {

    @Autowired
    private StudentServiceImpl studentService;

    @CrossOrigin
    @GetMapping("/student")
    @ResponseBody
    public List<Student> getAllS(HttpSession httpSession){

        return studentService.findAllS();
    }

    @CrossOrigin
    @PostMapping("/student")
    @ResponseBody
    public Result addS(@RequestBody Student requestS){
        boolean flag = studentService.addS(requestS);
        if(flag){
            return ResultFactory.bulidSuccessResult(requestS);
        }else {
            return ResultFactory.bulidFailResult("添加失败");
        }

    }

    @CrossOrigin
    @PutMapping("/student")
    @ResponseBody
    public Result updateS(@RequestBody Student requestS){
        boolean flag = studentService.updateS(requestS);
        if(flag){
            return ResultFactory.bulidSuccessResult(requestS);
        }else {
            return ResultFactory.bulidFailResult("添加失败");
        }
    }

    //get和delete方式不支持@RequestBody！！！
    @CrossOrigin
    @DeleteMapping("/student")
    @ResponseBody
    public Result deleteS(@RequestBody Student s){
        System.out.println(s.getS_no());
        boolean flag = studentService.deleteS(s.getS_no());

        if(flag){
            return ResultFactory.bulidSuccessResult("success");
        }else {
            return ResultFactory.bulidFailResult("添加失败");
        }
    }

}
