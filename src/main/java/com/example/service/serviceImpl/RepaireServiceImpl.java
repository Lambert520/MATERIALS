package com.example.service.serviceImpl;

import com.example.entity.peopleManager.Repaire;
import com.example.mapper.RepaireMapper;
import com.example.service.RepaireService;
import com.example.service.redisService.RedisService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.ListOperations;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class RepaireServiceImpl implements RepaireService {

    @Autowired
    private RepaireMapper repaireMapper;

    @Autowired
    private RedisTemplate redisTemplate;

    @Autowired
    private ListOperations<String,Object> listOperations;

    @Autowired
    private RedisService redisService;

	@Override
	public List<Repaire> findAllR(String ssh) {
		// TODO Auto-generated method stub
		return repaireMapper.findAllR(ssh);
	}

	@Override
	public boolean addR(Repaire r) {
		// TODO Auto-generated method stub
		try {
			repaireMapper.addR(r);
      }catch (Exception e){
          return false;
      }
      return true;
	}

	@Override
	public boolean updateR(Repaire r) {
		// TODO Auto-generated method stub
		try {
          repaireMapper.updateR(r);
      }catch (Exception e){
          return false;
      }
      return true;
	}

	@Override
	public boolean deleteR(String d_no) {
		// TODO Auto-generated method stub
		try {
          repaireMapper.deleteR(d_no);
      }catch (Exception e){
          return false;
      }
      return true;
	}

	@Override
	public Repaire selectRByDNo(String d_no) {
		// TODO Auto-generated method stub
		return repaireMapper.selectRByDNo(d_no);
		}
}
