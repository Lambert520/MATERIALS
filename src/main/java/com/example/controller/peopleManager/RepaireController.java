package com.example.controller.peopleManager;

import com.example.entity.peopleManager.Repaire;
import com.example.result.Result;
import com.example.result.ResultFactory;
import com.example.service.serviceImpl.RepaireServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpSession;
import java.util.List;

@RestController
public class RepaireController {

    @Autowired
    private RepaireServiceImpl repaireService;

    @CrossOrigin
    @GetMapping("/repaire")
    @ResponseBody
    public List<Repaire> getAllR(HttpSession httpSession){

        return repaireService.findAllR();
    }

    @CrossOrigin
    @PostMapping("/repaire")
    @ResponseBody
    public Result addR(@RequestBody Repaire requestR){
        boolean flag = repaireService.addR(requestR);
        if(flag){
            return ResultFactory.bulidSuccessResult(requestR);
        }else {
            return ResultFactory.bulidFailResult("添加失败");
        }

    }

    @CrossOrigin
    @PutMapping("/repaire")
    @ResponseBody
    public Result updateR(@RequestBody Repaire requestR){
        boolean flag = repaireService.updateR(requestR);
        if(flag){
            return ResultFactory.bulidSuccessResult(requestR);
        }else {
            return ResultFactory.bulidFailResult("添加失败");
        }
    }

    //get和delete方式不支持@RequestBody！！！
    @CrossOrigin
    @DeleteMapping("/repaire")
    @ResponseBody
    public Result deleteS(@RequestBody Repaire r){
        System.out.println(r.getD_no());
        boolean flag = repaireService.deleteR(r.getD_no());

        if(flag){
            return ResultFactory.bulidSuccessResult("success");
        }else {
            return ResultFactory.bulidFailResult("添加失败");
        }
    }

}
