package com.example.service.serviceImpl;

import com.example.entity.peopleManager.Student;
import com.example.mapper.StudentMapper;
import com.example.service.StudentService;
import com.example.service.redisService.RedisService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.ListOperations;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StudentServiceImpl implements StudentService {

    @Autowired
    private StudentMapper studentMapper;

    @Autowired
    private RedisTemplate redisTemplate;

    @Autowired
    private ListOperations<String,Object> listOperations;

    @Autowired
    private RedisService redisService;

	@Override
	public List<Student> findAllS() {
		// TODO Auto-generated method stub
		return studentMapper.findAllS();
	}

	@Override
	public boolean addS(Student s) {
		// TODO Auto-generated method stub
		try {
          studentMapper.addS(s);
      }catch (Exception e){
          return false;
      }
      return true;
	}

	@Override
	public boolean updateS(Student s) {
		// TODO Auto-generated method stub
		try {
          studentMapper.updateS(s);
      }catch (Exception e){
          return false;
      }
      return true;
	}

	@Override
	public boolean deleteS(String s_no) {
		// TODO Auto-generated method stub
		try {
          studentMapper.deleteS(s_no);
      }catch (Exception e){
          return false;
      }
      return true;
	}

	@Override
	public Student selectSBySNo(String s_no) {
		// TODO Auto-generated method stub
		return studentMapper.selectSBySNo(s_no);
	}

	@Override
	public Student selectSBySN(String s_name) {
		// TODO Auto-generated method stub
		return studentMapper.selectSBySName(s_name);
	}

	

}
