package com.example.service.serviceImpl;

import com.example.entity.peopleManager.Sanitation;
import com.example.mapper.SanitationMapper;
import com.example.service.SanitationService;
import com.example.service.StudentService;
import com.example.service.redisService.RedisService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.ListOperations;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SanitationServiceImpl implements SanitationService {

    @Autowired
    private SanitationMapper sanitationMapper;

    @Autowired
    private RedisTemplate redisTemplate;

    @Autowired
    private ListOperations<String,Object> listOperations;

    @Autowired
    private RedisService redisService;

	@Override
	public List<Sanitation> findAllSA() {
		// TODO Auto-generated method stub
		return sanitationMapper.findAllSA();
	}

	@Override
	public boolean addSA(Sanitation s) {
		// TODO Auto-generated method stub
		try {
			sanitationMapper.addSA(s);
      }catch (Exception e){
          return false;
      }
      return true;
	}

	@Override
	public boolean updateSA(Sanitation s) {
		// TODO Auto-generated method stub
		try {
			sanitationMapper.updateSA(s);
      }catch (Exception e){
          return false;
      }
      return true;
	}

	@Override
	public boolean deleteSA(String d_no) {
		// TODO Auto-generated method stub
		try {
			sanitationMapper.deleteSA(d_no);
      }catch (Exception e){
          return false;
      }
      return true;
	}

	@Override
	public Sanitation selectSAByDNo(String d_no) {
		// TODO Auto-generated method stub
		return sanitationMapper.selectSAByDNo(d_no);
	}
	
}
