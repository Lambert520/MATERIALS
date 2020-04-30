package com.example.service.serviceImpl;

import com.example.entity.peopleManager.DormitoryMbr;
import com.example.mapper.DormitoryMbrMapper;
import com.example.service.DormitoryMbrService;
import com.example.service.redisService.RedisService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.ListOperations;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.stereotype.Service;

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

	@Override
	public List<DormitoryMbr> findAllDM() {
		// TODO Auto-generated method stub
		return dormitorymMapper.findAllDM();
	}

	@Override
	public boolean addDM(DormitoryMbr dm) {
		// TODO Auto-generated method stub
		try {
			dormitorymMapper.addDM(dm);
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
	public DormitoryMbr selectDMByDNo(String d_no) {
		// TODO Auto-generated method stub
		return dormitorymMapper.selectDMByDNo(d_no);
	}
	
}
