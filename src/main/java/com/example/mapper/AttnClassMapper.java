package com.example.mapper;

import com.example.entity.peopleManager.AttnClass;

import org.apache.ibatis.annotations.*;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

import java.util.List;

@Mapper
@Repository
public interface AttnClassMapper {

    //根据学号查找晚归信息
    @Select("SELECT * FROM attn_class WHERE s_no = #{s_no}")
    AttnClass findACBySNo(@Param("s_no") String s_no);

    //获取所有用户
    @Select("SELECT * FROM attn_class")
    List<AttnClass> findAllAC();

    //新增用户
    @Insert("INSERT INTO attn_class(s_no,d_no,s_name,unattn_c_rsn,unattn_c_t) VALUES (#{s_no},#{d_no},#{s_name},#{unattn_c_rsn},#{unattn_c_t})")
    void addAC(AttnClass  ac);

    //修改一个用户
    @Update("UPDATE attn_class SET d_no=#{d_no},s_no=#{s_no},s_name=#{s_name},unattn_c_rsn=#{unattn_c_rsn},unattn_c_t=#{unattn_c_t} WHERE s_no=#{s_no} ")
    void updateAC(AttnClass  ac);

    //删除一个用户
    @Delete("DELETE FROM attn_class WHERE s_no = #{s_no}")
    void deleteAC(@Param("s_no") String s_no);
    
    //修改用户姓名
//    @Update("UPDATE student SET s_name = #{s_name} WHERE s_no = #{s_no}")
//    void updateName(LateReturn s);
    
    //通过工号查找晚归信息
    @Select("SELECT * FROM attn_class WHERE s_no = #{s_no}")
    AttnClass selectACBySNo(String s_no);

    //通过姓名查询用户信息
//    @Select("SELECT * FROM student WHERE s_name = #{s_name}")
//    LateReturn selectSBySName (String s_name);
    
}
