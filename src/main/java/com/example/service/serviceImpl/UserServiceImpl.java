package com.example.service.serviceImpl;

import com.example.entity.peopleManager.User;
import com.example.mapper.UserMapper;
import com.example.service.UserService;
import com.example.service.redisService.RedisService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.ListOperations;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserMapper userMapper;

    @Autowired
    private RedisTemplate redisTemplate;

    @Autowired
    private ListOperations<String,Object> listOperations;

    @Autowired
    private RedisService redisService;

	@Override
	public User selectUserByUNo(String u_no) {
		// TODO Auto-generated method stub
		return userMapper.findUserByUNo(u_no);
	}
	public User findUserByNoAndPassword(String u_no,String password){
		return userMapper.findUserByNoAndPassword(u_no,password);
	}
	@Override
	public List<User> findAllUser(String u_type,String u_no) {
		// TODO Auto-generated method stub
		return userMapper.findAllUser(u_type,u_no);
	}

	@Override
	public boolean addUser(User user) {
		// TODO Auto-generated method stub
      try {
    	  	userMapper.addUser(user);
      }catch (Exception e){
      	e.printStackTrace();
      		return false;
      		}
      	return true;
	}

	@Override
	public boolean updateUser(User user) {
		// TODO Auto-generated method stub
		try {
          userMapper.updateUser(user);
      }catch (Exception e){
          return false;
      }
      return true;
	}

	@Override
	public boolean deleteUser(String u_no) {
		// TODO Auto-generated method stub
		try {
          userMapper.deleteUser(u_no);
      }catch (Exception e){
          return false;
      }
      return true;
	}
//
//    @Override
//    public List<User> findAllUser() {
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
}
