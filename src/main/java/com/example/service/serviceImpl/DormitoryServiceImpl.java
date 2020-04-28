package com.example.service.serviceImpl;

import com.example.entity.peopleManager.Dormitory;
import com.example.mapper.DormitoryMapper;
import com.example.service.DormitoryService;
import com.example.service.redisService.RedisService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.ListOperations;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DormitoryServiceImpl implements DormitoryService {

    @Autowired
    private DormitoryMapper dormitoryMapper;

    @Autowired
    private RedisTemplate redisTemplate;

    @Autowired
    private ListOperations<String,Object> listOperations;

    @Autowired
    private RedisService redisService;

	@Override
	public List<Dormitory> findAllD() {
		// TODO Auto-generated method stub
		return dormitoryMapper.findAllD();
	}

	@Override
	public boolean addD(Dormitory d) {
		// TODO Auto-generated method stub
		try {
          dormitoryMapper.addD(d);
      }catch (Exception e){
          return false;
      }
      return true;
	}

	@Override
	public boolean updateD(Dormitory d) {
		// TODO Auto-generated method stub
		try {
          dormitoryMapper.updateD(d);
      }catch (Exception e){
          return false;
      }
      return true;
	}

	@Override
	public boolean deleteD(String d_no) {
		// TODO Auto-generated method stub
		try {
          dormitoryMapper.deleteD(d_no);
      }catch (Exception e){
          return false;
      }
      return true;
	}

	@Override
	public Dormitory selectDByDNo(String d_no) {
		// TODO Auto-generated method stub
		return dormitoryMapper.selectDByDNo(d_no);
	}
	
}
