package com.example.mapper;

import com.example.entity.peopleManager.UseElec;

import org.apache.ibatis.annotations.*;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

import java.util.List;

@Mapper
@Repository
public interface UseElecMapper {

    //根据学号查找晚归信息
    @Select("SELECT * FROM use_elec WHERE s_no = #{s_no}")
    UseElec findUEBySNo(@Param("s_no") String s_no);

    //获取所有用户
    @Select("SELECT * FROM use_elec")
    List<UseElec> findAllUE();

    //新增用户
    @Insert("INSERT INTO use_elec(s_no,d_no,s_name,illegal_elec_rsn,illegal_elec_t) VALUES (#{s_no},#{d_no},#{s_name},#{illegal_elec_rsn},#{illegal_elec_t})")
    void addUE(UseElec ue);

    //修改一个用户
    @Update("UPDATE use_elec SET s_no=#{s_no}, d_no=#{d_no}, s_name=#{s_name} , illegal_elec_rsn=#{illegal_elec_rsn}, illegal_elec_t=#{illegal_elec_t} WHERE s_no = #{s_no} ")
    void updateUE(UseElec ue);

    //删除一个用户
    @Delete("DELETE FROM use_elec WHERE s_no = #{s_no}")
    void deleteUE(@Param("s_no") String s_no);
    
    //修改用户姓名
//    @Update("UPDATE student SET s_name = #{s_name} WHERE s_no = #{s_no}")
//    void updateName(LateReturn s);
    
    //通过工号查找晚归信息
    @Select("SELECT * FROM use_elec WHERE s_no = #{s_no}")
    UseElec selectUEBySNo(String s_no);

    //通过姓名查询用户信息
//    @Select("SELECT * FROM student WHERE s_name = #{s_name}")
//    LateReturn selectSBySName (String s_name);
    
}

