package com.example.controller.peopleManager;

import com.example.entity.peopleManager.UseElec;
import com.example.result.Result;
import com.example.result.ResultFactory;
import com.example.service.serviceImpl.UseElecServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpSession;
import java.util.List;

@RestController
public class UseElecController {

    @Autowired
    private UseElecServiceImpl latereturnService;

    @CrossOrigin
    @GetMapping("/dormmbrelec")
    @ResponseBody
    public List<UseElec> getAllUE(String ssh,String s_no,String sz,String bzr){

        return latereturnService.findAllUE(ssh,s_no,sz,bzr);
    }

    @CrossOrigin
    @PostMapping("/dormmbrelec")
    @ResponseBody
    public Result addUE(@RequestBody UseElec requestUE){
        boolean flag = latereturnService.addUE(requestUE);
        if(flag){
            return ResultFactory.bulidSuccessResult(requestUE);
        }else {
            return ResultFactory.bulidFailResult("添加失败");
        }

    }

    @CrossOrigin
    @PutMapping("/dormmbrelec")
    @ResponseBody
    public Result updateUE(@RequestBody UseElec requestUE){
        boolean flag = latereturnService.updateUE(requestUE);
        if(flag){
            return ResultFactory.bulidSuccessResult(requestUE);
        }else {
            return ResultFactory.bulidFailResult("添加失败");
        }
    }

    //get和delete方式不支持@RequestBody！！！
    @CrossOrigin
    @DeleteMapping("/dormmbrelec")
    @ResponseBody
    public Result deleteUE(@RequestBody UseElec ue){
        System.out.println(ue.getS_no());
        boolean flag = latereturnService.deleteUE(String.valueOf(ue.getId()));

        if(flag){
            return ResultFactory.bulidSuccessResult("success");
        }else {
            return ResultFactory.bulidFailResult("添加失败");
        }
    }

}

