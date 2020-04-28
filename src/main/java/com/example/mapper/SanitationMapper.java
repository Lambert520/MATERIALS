package com.example.mapper;

import com.example.entity.peopleManager.Sanitation;

import org.apache.ibatis.annotations.*;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

import java.util.List;

@Mapper
@Repository
public interface SanitationMapper {

    //获取所有卫生情况
    @Select("SELECT * FROM sanitary_condition")
    List<Sanitation> findAllSA();

    //新增卫生情况
    @Insert("INSERT INTO sanitary_condition(d_no,tast_time,tast_result) VALUES (#{d_no},#{tast_time},#{tast_result})")
    void addSA(Sanitation s);

    //修改卫生情况
    @Update("UPDATE sanitary_condition SET tast_time=#{tast_time}, tast_result=#{tast_result} WHERE d_no = #{d_no} ")
    void updateSA(Sanitation s);

    //删除卫生情况
    @Delete("DELETE FROM sanitary_condition WHERE d_no = #{d_no}")
    void deleteSA(@Param("d_no") String d_no);
    
    //通过宿舍号查找卫生信息
    @Select("SELECT * FROM sanitary_condition WHERE d_no = #{d_no}")
    Sanitation selectSAByDNo(String d_no);

//    //通过姓名查询用户信息
//    @Select("SELECT * FROM student WHERE s_name = #{s_name}")
//    Student selectSBySName (String s_name);
    
}
