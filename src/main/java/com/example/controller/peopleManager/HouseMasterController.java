package com.example.controller.peopleManager;

import com.example.entity.peopleManager.HouseMaster;
import com.example.result.Result;
import com.example.result.ResultFactory;
import com.example.service.serviceImpl.HouseMasterServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpSession;
import java.util.List;

/**
 * @program: materils_v2.0
 * @description:
 * @author: aYuan
 * @create: 2019-08-17 12:37
 */
@RestController
public class HouseMasterController {

    @Autowired
    private HouseMasterServiceImpl housemasterService;

    @CrossOrigin
    @GetMapping("/housemasterInfo")
    @ResponseBody
    public List<HouseMaster> getAllHM(HttpSession httpSession){

//        return userService.findAllUser();
        return housemasterService.findAllHM();
    }

    @CrossOrigin
    @PostMapping("/housemasterInfo")
    @ResponseBody
    public Result addHM(@RequestBody HouseMaster requestHM){
        boolean flag = housemasterService.addHM(requestHM);
        if(flag){
            return ResultFactory.bulidSuccessResult(requestHM);
        }else {
            return ResultFactory.bulidFailResult("添加失败");
        }

    }

    @CrossOrigin
    @PutMapping("/housemasterInfo")
    @ResponseBody
    public Result updateHM(@RequestBody HouseMaster requestHM){
        boolean flag = housemasterService.updateHM(requestHM);
        if(flag){
            return ResultFactory.bulidSuccessResult(requestHM);
        }else {
            return ResultFactory.bulidFailResult("添加失败");
        }
    }

    //get和delete方式不支持@RequestBody！！！
    @CrossOrigin
    @DeleteMapping("/housemasterInfo")
    @ResponseBody
    public Result deleteHM(@RequestBody HouseMaster hm){
        System.out.println(hm.getH_no());
        boolean flag = housemasterService.deleteHM(hm.getH_no());

        if(flag){
            return ResultFactory.bulidSuccessResult("success");
        }else {
            return ResultFactory.bulidFailResult("添加失败");
        }
    }

}
