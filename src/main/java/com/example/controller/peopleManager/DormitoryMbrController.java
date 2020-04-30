package com.example.controller.peopleManager;

import com.example.entity.peopleManager.DormitoryMbr;
import com.example.result.Result;
import com.example.result.ResultFactory;
import com.example.service.serviceImpl.DormitoryMbrServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpSession;
import java.util.List;


@RestController
public class DormitoryMbrController {

    @Autowired
    private DormitoryMbrServiceImpl dormitoryService;

    @CrossOrigin
    @GetMapping("/dormitorymbr")
    @ResponseBody
    public List<DormitoryMbr> getAllD(HttpSession httpSession){

        return dormitoryService.findAllDM();
    }

    @CrossOrigin
    @PostMapping("/dormitorymbr")
    @ResponseBody
    public Result addD(@RequestBody DormitoryMbr requestD){
        boolean flag = dormitoryService.addDM(requestD);
        if(flag){
            return ResultFactory.bulidSuccessResult(requestD);
        }else {
            return ResultFactory.bulidFailResult("添加失败");
        }

    }

    @CrossOrigin
    @PutMapping("/dormitorymbr")
    @ResponseBody
    public Result updateD(@RequestBody DormitoryMbr requestD){
        boolean flag = dormitoryService.updateDM(requestD);
        if(flag){
            return ResultFactory.bulidSuccessResult(requestD);
        }else {
            return ResultFactory.bulidFailResult("添加失败");
        }
    }

    //get和delete方式不支持@RequestBody！！！
    @CrossOrigin
    @DeleteMapping("/dormitorymbr")
    @ResponseBody
    public Result deleteD(@RequestBody DormitoryMbr d){
        System.out.println(d.getD_no());
        boolean flag = dormitoryService.deleteDM(d.getD_no());

        if(flag){
            return ResultFactory.bulidSuccessResult("success");
        }else {
            return ResultFactory.bulidFailResult("添加失败");
        }
    }

}
