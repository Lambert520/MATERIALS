package com.example.controller.peopleManager;

import com.example.entity.peopleManager.Sanitation;
import com.example.result.Result;
import com.example.result.ResultFactory;
import com.example.service.serviceImpl.SanitationServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpSession;
import java.util.List;

@RestController
public class SanitationController {

    @Autowired
    private SanitationServiceImpl sanitationService;

    @CrossOrigin
    @GetMapping("/sanitation")
    @ResponseBody
    public List<Sanitation> getAllSA(HttpSession httpSession){

        return sanitationService.findAllSA();
    }

    @CrossOrigin
    @PostMapping("/sanitation")
    @ResponseBody
    public Result addSA(@RequestBody Sanitation requestS){
        boolean flag = sanitationService.addSA(requestS);
        if(flag){
            return ResultFactory.bulidSuccessResult(requestS);
        }else {
            return ResultFactory.bulidFailResult("添加失败");
        }

    }

    @CrossOrigin
    @PutMapping("/sanitation")
    @ResponseBody
    public Result updateSA(@RequestBody Sanitation requestS){
        boolean flag = sanitationService.updateSA(requestS);
        if(flag){
            return ResultFactory.bulidSuccessResult(requestS);
        }else {
            return ResultFactory.bulidFailResult("添加失败");
        }
    }

    //get和delete方式不支持@RequestBody！！！
    @CrossOrigin
    @DeleteMapping("/sanitation")
    @ResponseBody
    public Result deleteSA(@RequestBody Sanitation s){
        System.out.println(s.getD_no());
        boolean flag = sanitationService.deleteSA(s.getD_no());

        if(flag){
            return ResultFactory.bulidSuccessResult("success");
        }else {
            return ResultFactory.bulidFailResult("添加失败");
        }
    }

}

