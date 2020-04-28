package com.example.service.serviceImpl;

import com.example.entity.peopleManager.LateReturn;
import com.example.mapper.LateReturnMapper;
import com.example.service.LateReturnService;
import com.example.service.redisService.RedisService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.ListOperations;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class LateReturnServiceImpl implements LateReturnService {

    @Autowired
    private LateReturnMapper latereturnMapper;

    @Autowired
    private RedisTemplate redisTemplate;

    @Autowired
    private ListOperations<String,Object> listOperations;

    @Autowired
    private RedisService redisService;

	@Override
	public List<LateReturn> findAllLR() {
		// TODO Auto-generated method stub
		return latereturnMapper.findAllLR();
	}

	@Override
	public boolean addLR(LateReturn lr) {
		// TODO Auto-generated method stub
		try {
			latereturnMapper.addLR(lr);
      }catch (Exception e){
          return false;
      }
      return true;
	}

	@Override
	public boolean updateLR(LateReturn lr) {
		// TODO Auto-generated method stub
		try {
			latereturnMapper.updateLR(lr);
      }catch (Exception e){
          return false;
      }
      return true;
	}

	@Override
	public boolean deleteLR(String s_no) {
		// TODO Auto-generated method stub
		try {
			latereturnMapper.deleteLR(s_no);
      }catch (Exception e){
          return false;
      }
      return true;
	}

	@Override
	public LateReturn selectLRBySNo(String s_no) {
		// TODO Auto-generated method stub
		return latereturnMapper.selectLRBySNo(s_no);
	}

//	@Override
//	public Student selectSBySN(String s_name) {
//		// TODO Auto-generated method stub
//		return studentMapper.selectSBySName(s_name);
//	}

	

}

