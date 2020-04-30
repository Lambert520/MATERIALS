package com.example.service.serviceImpl;

import com.example.entity.peopleManager.AttnClass;
import com.example.mapper.AttnClassMapper;
import com.example.service.AttnClassService;
import com.example.service.redisService.RedisService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.ListOperations;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AttnClassServiceImpl implements AttnClassService {

    @Autowired
    private AttnClassMapper attnclassMapper;

    @Autowired
    private RedisTemplate redisTemplate;

    @Autowired
    private ListOperations<String,Object> listOperations;

    @Autowired
    private RedisService redisService;

	@Override
	public List<AttnClass> findAllAC() {
		// TODO Auto-generated method stub
		return attnclassMapper.findAllAC();
	}

	@Override
	public boolean addAC(AttnClass ac) {
		// TODO Auto-generated method stub
		try {
			attnclassMapper.addAC(ac);
      }catch (Exception e){
          return false;
      }
      return true;
	}

	@Override
	public boolean updateAC(AttnClass ac) {
		// TODO Auto-generated method stub
		try {
			attnclassMapper.updateAC(ac);
      }catch (Exception e){
          return false;
      }
      return true;
	}

	@Override
	public boolean deleteAC(String s_no) {
		// TODO Auto-generated method stub
		try {
			attnclassMapper.deleteAC(s_no);
      }catch (Exception e){
          return false;
      }
      return true;
	}

	@Override
	public AttnClass selectACBySNo(String s_no) {
		// TODO Auto-generated method stub
		return attnclassMapper.selectACBySNo(s_no);
	}

//	@Override
//	public Student selectSBySN(String s_name) {
//		// TODO Auto-generated method stub
//		return studentMapper.selectSBySName(s_name);
//	}

	

}
