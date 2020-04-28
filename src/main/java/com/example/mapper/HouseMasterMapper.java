package com.example.mapper;

import com.example.entity.peopleManager.HouseMaster;

import org.apache.ibatis.annotations.*;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

import java.util.List;

@Mapper
@Repository
public interface HouseMasterMapper {

    //登录，根据工号查找user
    @Select("SELECT * FROM housemaster WHERE h_no = #{h_no}")
    HouseMaster findHMByHNo(@Param("h_no") String h_no);

    //获取所有用户
    @Select("SELECT * FROM housemaster")
    List<HouseMaster> findAllHM();

    //新增用户
    @Insert("INSERT INTO housemaster(h_no,h_name,h_sex,h_tel,h_dorm_build_no) VALUES (#{h_no},#{h_name},#{h_sex},#{h_tel},#{h_dorm_build_no})")
    void addHM(HouseMaster hm);

    //修改一个用户
    @Update("UPDATE housemaster SET h_name=#{h_name}, h_tel=#{h_tel}, h_sex=#{h_sex}, h_dorm_build_no =#{h_dorm_build_no} WHERE h_no = #{h_no} ")
    void updateHM(HouseMaster hm);

    //删除一个用户
    @Delete("DELETE FROM housemaster WHERE h_no = #{h_no}")
    void deleteHM(@Param("h_no") String h_no);
    
//    //修改用户姓名
//    @Update("UPDATE housemaster SET h_name =#{h_name} WHERE h_no =#{h_no}")
//    void updateName(HouseMaster hm);
    
    //通过工号查找用户信息
    @Select("SELECT * FROM housemaster WHERE h_no = #{h_no}")
    HouseMaster selectHMByHNo(String h_no);

    //通过宿舍楼号查询用户信息
    @Select("SELECT * FROM housemaster WHERE h_dorm_build_no = #{h_dorm_build_no}")
    HouseMaster selectHMByBuildNo (String h_dorm_build_no);
    
}
