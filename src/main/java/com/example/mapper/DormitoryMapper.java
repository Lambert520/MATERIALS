package com.example.mapper;

import com.example.entity.peopleManager.Dormitory;

import org.apache.ibatis.annotations.*;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

import java.util.List;

@Mapper
@Repository
public interface DormitoryMapper {

//    //登录，根据工号查找user
//    @Select("SELECT * FROM dorm WHERE d_no = #{d_no}")
//    Dormitory findDByDNo(@Param("d_no") String d_no);

    //获取所有宿舍
    @Select("SELECT * FROM dorm")
    List<Dormitory> findAllD();

    //新增宿舍
    @Insert("INSERT INTO dorm(d_no,s_no,s_name,is_dorm_header,floor) VALUES (#{d_no},#{s_no},#{s_name},#{is_dorm_header},#{floor})")
    void addD(Dormitory d);

    //修改一个宿舍
    @Update("UPDATE dorm SET s_name=#{s_name}, s_no=#{s_no}, is_dorm_header=#{is_dorm_header}, floor =#{floor} WHERE d_no = #{d_no} ")
    void updateD(Dormitory d);

    //删除一个宿舍
    @Delete("DELETE FROM dorm WHERE d_no = #{d_no}")
    void deleteD(@Param("d_no") String d_no);
    
//    //修改用户姓名
//    @Update("UPDATE dorm SET s_name = #{s_name} WHERE s_no = #{s_no}")
//    void updateName(Student s);
    
    //通过工号查找用户信息
    @Select("SELECT * FROM dorm WHERE d_no = #{d_no}")
    Dormitory selectDByDNo(String d_no);

//    //通过姓名查询用户信息
//    @Select("SELECT * FROM student WHERE s_name = #{s_name}")
//    Student selectSBySName (String s_name);
    
}