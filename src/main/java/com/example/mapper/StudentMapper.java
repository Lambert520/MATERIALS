package com.example.mapper;

import com.example.entity.peopleManager.Student;

import org.apache.ibatis.annotations.*;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

import java.util.List;

@Mapper
@Repository
public interface StudentMapper {

    //根据工号查找用户
    @Select("SELECT * FROM student WHERE s_no = #{s_no}")
    Student findSBySNo(@Param("s_no") String s_no);

    //获取所有用户
    @Select("SELECT * FROM student")
    List<Student> findAllS();

    //新增用户
    @Insert("INSERT INTO student(s_no,s_name,s_sex,s_tel,s_major,t_name) VALUES (#{s_no},#{s_name},#{s_sex},#{s_tel},#{s_major},#{t_name})")
    void addS(Student  s);

    //修改一个用户
    @Update("UPDATE student SET s_name=#{s_name}, s_tel=#{s_tel}, s_sex=#{s_sex}, s_major =#{s_major}, t_name =#{t_name} WHERE s_no = #{s_no} ")
    void updateS(Student  s);

    //删除一个用户
    @Delete("DELETE FROM student WHERE s_no = #{s_no}")
    void deleteS(@Param("s_no") String s_no);
    
    //修改用户姓名
    @Update("UPDATE student SET s_name = #{s_name} WHERE s_no = #{s_no}")
    void updateName(Student s);
    
    //通过工号查找用户信息
    @Select("SELECT * FROM student WHERE s_no = #{s_no}")
    Student selectSBySNo(String s_no);

    //通过姓名查询用户信息
    @Select("SELECT * FROM student WHERE s_name = #{s_name}")
    Student selectSBySName (String s_name);
    
}
