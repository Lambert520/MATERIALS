package com.example.service.serviceImpl;

import com.example.entity.peopleManager.DormitoryMbr;
import com.example.entity.peopleManager.User;
import com.example.mapper.DormitoryMbrMapper;
import com.example.service.DormitoryMbrService;
import com.example.service.UserService;
import com.example.service.redisService.RedisService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.ListOperations;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class DormitoryMbrServiceImpl implements DormitoryMbrService {

    @Autowired
    private DormitoryMbrMapper dormitorymMapper;

    @Autowired
    private RedisTemplate redisTemplate;

    @Autowired
    private ListOperations<String,Object> listOperations;

    @Autowired
    private RedisService redisService;
    @Autowired
    private UserService userService;

	@Override
	public List<DormitoryMbr> findAllDM(String ssh,String bzr,String d_no) {
		// TODO Auto-generated method stub
		return dormitorymMapper.findAllDM(ssh,bzr,d_no);
	}

	@Transactional(rollbackFor = Exception.class)
	@Override
	public boolean addDM(DormitoryMbr dm) {
		// TODO Auto-generated method stub
		try {
			dormitorymMapper.addDM(dm);
			User user = new User();
			user.setU_name(dm.getS_name());
			user.setU_no(dm.getS_no());
			user.setU_password("123456");
			if(dm.getIs_dorm_header().equals("是")){
				user.setU_type("舍长");
			} else {
				user.setU_type("学生");
			}

			userService.addUser(user);
      }catch (Exception e){
          return false;
      }
      return true;
	}

	@Override
	public boolean updateDM(DormitoryMbr dm) {
		// TODO Auto-generated method stub
		try {
			dormitorymMapper.updateDM(dm);
      }catch (Exception e){
			e.printStackTrace();
          return false;
      }
      return true;
	}

	@Override
	public boolean deleteDM(String d_no) {
		// TODO Auto-generated method stub
		try {
			dormitorymMapper.deleteDM(d_no);
      }catch (Exception e){
          return false;
      }
      return true;
	}
	@Override
	public DormitoryMbr selectDMBySno(String s_no){
		return dormitorymMapper.selectDMBySno(s_no);
	}
	@Override
	public DormitoryMbr selectDMByDNo(String d_no) {
		// TODO Auto-generated method stub
		return dormitorymMapper.selectDMByDNo(d_no);
	}
	
}
