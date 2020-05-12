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

    /**
     * @param u_type 角色
     * @param b_name 姓名
     * @param s_no   学好或者宿舍号
     * @return
     */
    @CrossOrigin
    @GetMapping("/dormitorymbr")
    @ResponseBody
    public List<DormitoryMbr> getAllD(@RequestParam(required = false) String u_type,
                                      @RequestParam(required = false) String ssh,
                                      @RequestParam(required = false) String b_name,
                                      @RequestParam(required = false) String s_no) {

        if (u_type.equals("班主任")) {
            return dormitoryService.findAllDM(null, b_name, s_no);
        } else if (u_type.equals("舍长")) {
            return dormitoryService.findAllDM(ssh, null, s_no);
        } else if (u_type.equals("管理员")) {
            return dormitoryService.findAllDM(ssh, null, s_no);
        }
        return null;
    }

    @CrossOrigin
    @PostMapping("/dormitorymbr")
    @ResponseBody
    public Result addD(@RequestBody DormitoryMbr requestD) {

        DormitoryMbr dormitoryMbr = dormitoryService.selectDMBySno(requestD.getS_no());
        if(dormitoryMbr != null){
            return ResultFactory.bulidFailResult("当前学生已经分配宿舍了");
        }
        boolean flag = dormitoryService.addDM(requestD);
        if (flag) {
            return ResultFactory.bulidSuccessResult(requestD);
        } else {
            return ResultFactory.bulidFailResult("添加失败");
        }

    }

    @CrossOrigin
    @PutMapping("/dormitorymbr")
    @ResponseBody
    public Result updateD(@RequestBody DormitoryMbr requestD) {
        boolean flag = dormitoryService.updateDM(requestD);
        if (flag) {
            return ResultFactory.bulidSuccessResult(requestD);
        } else {
            return ResultFactory.bulidFailResult("添加失败");
        }
    }

    //get和delete方式不支持@RequestBody！！！
    @CrossOrigin
    @DeleteMapping("/dormitorymbr")
    @ResponseBody
    public Result deleteD(@RequestBody DormitoryMbr d) {
        System.out.println(d.getD_no());
        boolean flag = dormitoryService.deleteDM(String.valueOf(d.getId()));

        if (flag) {
            return ResultFactory.bulidSuccessResult("success");
        } else {
            return ResultFactory.bulidFailResult("添加失败");
        }
    }

}
