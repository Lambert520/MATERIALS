package com.example.mapper;

import com.example.entity.peopleManager.LateReturn;

import org.apache.ibatis.annotations.*;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

import java.util.List;

@Mapper
@Repository
public interface LateReturnMapper {

    //根据学号查找晚归信息
    @Select("SELECT * FROM late_return WHERE s_no = #{s_no}")
    LateReturn findLRBySNo(@Param("s_no") String s_no);

    //获取所有用户
    @Select("SELECT * FROM late_return")
    List<LateReturn> findAllLR();

    //新增用户
    @Insert("INSERT INTO late_return(s_no,d_no,s_name,late_return_time,late_return_reason) VALUES (#{s_no},#{d_no},#{s_name},#{late_return_time},#{late_return_reason})")
    void addLR(LateReturn  lr);

    //修改一个用户
    @Update("UPDATE late_return SET d_no=#{d_no}, late_return_time=#{late_return_time}, late_return_reason=#{late_return_reason} WHERE s_no = #{s_no} ")
    void updateLR(LateReturn  lr);

    //删除一个用户
    @Delete("DELETE FROM late_return WHERE s_no = #{s_no}")
    void deleteLR(@Param("s_no") String s_no);
    
    //修改用户姓名
//    @Update("UPDATE student SET s_name = #{s_name} WHERE s_no = #{s_no}")
//    void updateName(LateReturn s);
    
    //通过工号查找晚归信息
    @Select("SELECT * FROM late_return WHERE s_no = #{s_no}")
    LateReturn selectLRBySNo(String s_no);

    //通过姓名查询用户信息
//    @Select("SELECT * FROM student WHERE s_name = #{s_name}")
//    LateReturn selectSBySName (String s_name);
    
}

