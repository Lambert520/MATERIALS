package com.example.mapper;

import com.example.entity.peopleManager.NotReturn;

import org.apache.ibatis.annotations.*;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

import java.util.List;

@Mapper
@Repository
public interface NotReturnMapper {

    //根据学号查找晚归信息
    @Select("SELECT * FROM not_return WHERE s_no = #{s_no}")
    NotReturn findLRBySNo(@Param("s_no") String s_no);

    //获取所有用户
    @Select("SELECT * FROM not_return")
    List<NotReturn> findAllLR();

    //新增用户
    @Insert("INSERT INTO not_return(s_no,d_no,s_name,not_return_time,not_return_reason) VALUES (#{s_no},#{d_no},#{s_name},#{not_return_time},#{not_return_reason})")
    void addLR(NotReturn  lr);

    //修改一个用户
    @Update("UPDATE not_return SET s_no=#{s_no}, d_no=#{d_no}, s_name=#{s_name}, not_return_time=#{not_return_time}, not_return_reason=#{not_return_reason} WHERE s_no = #{s_no} ")
    void updateLR(NotReturn  lr);

    //删除一个用户
    @Delete("DELETE FROM not_return WHERE s_no = #{s_no}")
    void deleteLR(@Param("s_no") String s_no);
    
    //修改用户姓名
//    @Update("UPDATE student SET s_name = #{s_name} WHERE s_no = #{s_no}")
//    void updateName(LateReturn s);
    
    //通过工号查找晚归信息
    @Select("SELECT * FROM not_return WHERE s_no = #{s_no}")
    NotReturn selectLRBySNo(String s_no);

    //通过姓名查询用户信息
//    @Select("SELECT * FROM student WHERE s_name = #{s_name}")
//    LateReturn selectSBySName (String s_name);
    
}

