package com.example.controller.peopleManager;

import com.example.entity.peopleManager.AttnClass;
import com.example.result.Result;
import com.example.result.ResultFactory;
import com.example.service.serviceImpl.AttnClassServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpSession;
import java.util.List;

@RestController
public class AttnClassController {

    @Autowired
    private AttnClassServiceImpl attnclassService;

    @CrossOrigin
    @GetMapping("/dormmbrcs")
    @ResponseBody
    public List<AttnClass> getAllAC(HttpSession httpSession){

        return attnclassService.findAllAC();
    }

    @CrossOrigin
    @PostMapping("/dormmbrcs")
    @ResponseBody
    public Result addAC(@RequestBody AttnClass requestAC){
        boolean flag = attnclassService.addAC(requestAC);
        if(flag){
            return ResultFactory.bulidSuccessResult(requestAC);
        }else {
            return ResultFactory.bulidFailResult("添加失败");
        }

    }

    @CrossOrigin
    @PutMapping("/dormmbrcs")
    @ResponseBody
    public Result updateAC(@RequestBody AttnClass requestAC){
        boolean flag = attnclassService.updateAC(requestAC);
        if(flag){
            return ResultFactory.bulidSuccessResult(requestAC);
        }else {
            return ResultFactory.bulidFailResult("添加失败");
        }
    }

    //get和delete方式不支持@RequestBody！！！
    @CrossOrigin
    @DeleteMapping("/dormmbrcs")
    @ResponseBody
    public Result deleteAC(@RequestBody AttnClass ac){
        System.out.println(ac.getS_no());
        boolean flag = attnclassService.deleteAC(ac.getS_no());

        if(flag){
            return ResultFactory.bulidSuccessResult("success");
        }else {
            return ResultFactory.bulidFailResult("添加失败");
        }
    }

}


