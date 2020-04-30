package com.example.service.serviceImpl;

import com.example.entity.peopleManager.UseElec;
import com.example.mapper.UseElecMapper;
import com.example.service.UseElecService;
import com.example.service.redisService.RedisService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.ListOperations;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UseElecServiceImpl implements UseElecService {

    @Autowired
    private UseElecMapper useelecMapper;

    @Autowired
    private RedisTemplate redisTemplate;

    @Autowired
    private ListOperations<String,Object> listOperations;

    @Autowired
    private RedisService redisService;

	@Override
	public List<UseElec> findAllUE() {
		// TODO Auto-generated method stub
		return useelecMapper.findAllUE();
	}

	@Override
	public boolean addUE(UseElec ue) {
		// TODO Auto-generated method stub
		try {
			useelecMapper.addUE(ue);
      }catch (Exception e){
          return false;
      }
      return true;
	}

	@Override
	public boolean updateUE(UseElec ue) {
		// TODO Auto-generated method stub
		try {
			useelecMapper.updateUE(ue);
      }catch (Exception e){
          return false;
      }
      return true;
	}

	@Override
	public boolean deleteUE(String s_no) {
		// TODO Auto-generated method stub
		try {
			useelecMapper.deleteUE(s_no);
      }catch (Exception e){
          return false;
      }
      return true;
	}

	@Override
	public UseElec selectUEBySNo(String s_no) {
		// TODO Auto-generated method stub
		return useelecMapper.selectUEBySNo(s_no);
	}

//	@Override
//	public Student selectSBySN(String s_name) {
//		// TODO Auto-generated method stub
//		return studentMapper.selectSBySName(s_name);
//	}

	

}

