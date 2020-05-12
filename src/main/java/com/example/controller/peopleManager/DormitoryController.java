package com.example.controller.peopleManager;

import com.example.entity.peopleManager.Dormitory;
import com.example.result.Result;
import com.example.result.ResultFactory;
import com.example.service.serviceImpl.DormitoryServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpSession;
import java.util.List;

@RestController
public class DormitoryController {

    @Autowired
    private DormitoryServiceImpl dormitoryService;

    @CrossOrigin
    @GetMapping("/dormitory")
    @ResponseBody
    public List<Dormitory> getAllD(String ssh){

        return dormitoryService.findAllD(ssh);
    }

    @CrossOrigin
    @PostMapping("/dormitory")
    @ResponseBody
    public Result addD(@RequestBody Dormitory requestD){

        Dormitory dormitory = dormitoryService.selectDorByDNo(requestD.getD_no());
        if(dormitory != null){
            return ResultFactory.bulidFailResult("当前宿舍号已经存在");
        }
        boolean flag = dormitoryService.addD(requestD);
        if(flag){
            return ResultFactory.bulidSuccessResult(requestD);
        }else {
            return ResultFactory.bulidFailResult("添加失败");
        }

    }

    @CrossOrigin
    @PutMapping("/dormitory")
    @ResponseBody
    public Result updateD(@RequestBody Dormitory requestD){
        boolean flag = dormitoryService.updateD(requestD);
        if(flag){
            return ResultFactory.bulidSuccessResult(requestD);
        }else {
            return ResultFactory.bulidFailResult("添加失败");
        }
    }

    //get和delete方式不支持@RequestBody！！！
    @CrossOrigin
    @DeleteMapping("/dormitory")
    @ResponseBody
    public Result deleteD(@RequestBody Dormitory d){
        System.out.println(d.getD_no());
        boolean flag = dormitoryService.deleteD(d.getId());

        if(flag){
            return ResultFactory.bulidSuccessResult("success");
        }else {
            return ResultFactory.bulidFailResult("添加失败");
        }
    }

}

