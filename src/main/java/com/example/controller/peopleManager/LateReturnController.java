package com.example.controller.peopleManager;

import com.example.entity.peopleManager.LateReturn;
import com.example.result.Result;
import com.example.result.ResultFactory;
import com.example.service.serviceImpl.LateReturnServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpSession;
import java.util.List;

@RestController
public class LateReturnController {

    @Autowired
    private LateReturnServiceImpl latereturnService;

    @CrossOrigin
    @GetMapping("/latereturn")
    @ResponseBody
    public List<LateReturn> getAllLR(HttpSession httpSession){

        return latereturnService.findAllLR();
    }

    @CrossOrigin
    @PostMapping("/latereturn")
    @ResponseBody
    public Result addLR(@RequestBody LateReturn requestLR){
        boolean flag = latereturnService.addLR(requestLR);
        if(flag){
            return ResultFactory.bulidSuccessResult(requestLR);
        }else {
            return ResultFactory.bulidFailResult("添加失败");
        }

    }

    @CrossOrigin
    @PutMapping("/latereturn")
    @ResponseBody
    public Result updateLR(@RequestBody LateReturn requestLR){
        boolean flag = latereturnService.updateLR(requestLR);
        if(flag){
            return ResultFactory.bulidSuccessResult(requestLR);
        }else {
            return ResultFactory.bulidFailResult("添加失败");
        }
    }

    //get和delete方式不支持@RequestBody！！！
    @CrossOrigin
    @DeleteMapping("/latereturn")
    @ResponseBody
    public Result deleteLR(@RequestBody LateReturn s){
        System.out.println(s.getS_no());
        boolean flag = latereturnService.deleteLR(s.getS_no());

        if(flag){
            return ResultFactory.bulidSuccessResult("success");
        }else {
            return ResultFactory.bulidFailResult("添加失败");
        }
    }

}

