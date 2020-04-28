package com.example.service.serviceImpl;

import com.example.entity.peopleManager.HouseMaster;
import com.example.mapper.HouseMasterMapper;
import com.example.service.HouseMasterService;
import com.example.service.redisService.RedisService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.ListOperations;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class HouseMasterServiceImpl implements HouseMasterService {

    @Autowired
    private HouseMasterMapper housemasterMapper;

    @Autowired
    private RedisTemplate redisTemplate;

    @Autowired
    private ListOperations<String,Object> listOperations;

    @Autowired
    private RedisService redisService;

	@Override
	public List<HouseMaster> findAllHM() {
		// TODO Auto-generated method stub
		return housemasterMapper.findAllHM();
	}

	@Override
	public boolean addHM(HouseMaster hm) {
		// TODO Auto-generated method stub
		try {
          housemasterMapper.addHM(hm);
      }catch (Exception e){
          return false;
      }
      return true;
	}

	@Override
	public boolean updateHM(HouseMaster hm) {
		// TODO Auto-generated method stub
		try {
          housemasterMapper.updateHM(hm);
      }catch (Exception e){
          return false;
      }
      return true;
	}

	@Override
	public boolean deleteHM(String h_no) {
		// TODO Auto-generated method stub
		try {
          housemasterMapper.deleteHM(h_no);
      }catch (Exception e){
          return false;
      }
      return true;
	}

	@Override
	public HouseMaster selectHMByHNo(String h_no) {
		// TODO Auto-generated method stub
		return housemasterMapper.selectHMByHNo(h_no);
	}

	@Override
	public HouseMaster selectHMByBuildNo(String build_no) {
		// TODO Auto-generated method stub
		return housemasterMapper.selectHMByBuildNo(build_no);
	}

//    @Override
//    public HouseMaster selectHMByHNo(String h_no) {
////        return userMapper.findUserByJobNum(jobNum);
//    	return housemasterMapper.findHMByHNo(h_no);
//    }
//
//    @Override
//    public List<HouseMaster> findAllUser() {
//
//        return userMapper.findAllUser();
//    }
//
//    @Override
//    public boolean addUser(User user){
//        try {
//            userMapper.addUser(user);
//        }catch (Exception e){
//            return false;
//        }
//        return true;
//    }
//
//    @Override
//    public boolean updateUser(User user) {
//        try {
//            userMapper.updateUser(user);
//        }catch (Exception e){
//            return false;
//        }
//        return true;
//    }
//
//    @Override
//    public boolean deleteUser(String jobNum) {
//        try {
//            userMapper.deleteUser(jobNum);
//        }catch (Exception e){
//            return false;
//        }
//        return true;
//    }
//
//    @Override
//    public void updateJob(User user) {
//        userMapper.updateJob(user);
//    }
//
//    @Override
//    public User selectUserByDept(String deptNum) {
//        return userMapper.selectUserByDept(deptNum);
//    }
//
//    @Override
//    public User selectUserByName(String userName) {
//        return userMapper.selectUserByName(userName);
//    }


}
