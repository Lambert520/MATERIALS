package com.example.service.serviceImpl;

import com.example.entity.peopleManager.NotReturn;
import com.example.mapper.NotReturnMapper;
import com.example.service.NotReturnService;
import com.example.service.redisService.RedisService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.ListOperations;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class NotReturnServiceImpl implements NotReturnService {

    @Autowired
    private NotReturnMapper latereturnMapper;

    @Autowired
    private RedisTemplate redisTemplate;

    @Autowired
    private ListOperations<String,Object> listOperations;

    @Autowired
    private RedisService redisService;

	@Override
	public List<NotReturn> findAllLR(String ssh,String s_no,String sz,String bzr) {
		// TODO Auto-generated method stub
		return latereturnMapper.findAllLR(ssh,s_no,sz,bzr);
	}

	@Override
	public boolean addLR(NotReturn lr) {
		// TODO Auto-generated method stub
		try {
			latereturnMapper.addLR(lr);
      }catch (Exception e){
          return false;
      }
      return true;
	}

	@Override
	public boolean updateLR(NotReturn lr) {
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
			e.printStackTrace();
          return false;
      }
      return true;
	}

	@Override
	public NotReturn selectLRBySNo(String s_no) {
		// TODO Auto-generated method stub
		return latereturnMapper.selectLRBySNo(s_no);
	}

//	@Override
//	public Student selectSBySN(String s_name) {
//		// TODO Auto-generated method stub
//		return studentMapper.selectSBySName(s_name);
//	}

	

}

