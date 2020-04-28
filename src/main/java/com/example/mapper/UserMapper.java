package com.example.mapper;

import com.example.entity.peopleManager.User;
import org.apache.ibatis.annotations.*;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

import java.util.List;

@Mapper
@Repository
public interface UserMapper {
	
	 //登录，根据工号查找user
    @Select("SELECT * FROM user_info WHERE u_no = #{u_no}")
    User findUserByUNo(@Param("u_no") String u_no);

    //获取所有用户
    @Select("SELECT * FROM user_info")
    List<User> findAllUser();

    //新增用户
    @Insert("INSERT INTO user_info(u_no,u_name,u_password) VALUES (#{u_no},#{u_name},#{u_password})")
    void addUser(User user);

    //修改一个用户
    @Update("UPDATE user_info SET u_password =#{u_password}, u_name=#{u_name} WHERE u_no =#{u_no} ")
    void updateUser(User user);

    //删除一个用户
    @Delete("DELETE FROM user_info WHERE u_no = #{u_no}")
    void deleteUser(@Param("u_no") String u_no);

//    @Update("UPDATE user_info SET job = #{job} WHERE jobNum = #{jobNum}")
//    void updateJob(User user);

//    @Select("SELECT * FROM tbl_user WHERE job = '2' AND deptNum = #{deptNum}")
//    User selectUserByDept(String deptNum);
//
//    @Select("SELECT * FROM tbl_user WHERE userName = #{userName}")
//    User selectUserByName(String userName);
//
//    @Select("Select * from tbl_user where job = '3' and deptName = '采购部'")
//    List<User> getAllPruchase();

//    //登录，根据工号查找user
//    @Select("SELECT * FROM tbl_user WHERE jobNum = #{jobNum}")
//    User findUserByJobNum(@Param("jobNum") String jobNum);
//
//    //获取所有用户
//    @Select("SELECT * FROM tbl_user")
//    List<User> findAllUser();
//
//    //新增用户
//    @Insert("INSERT INTO tbl_user(id,jobNum,passWord,userName,userTel,userSex,deptNum,deptName,job) VALUES (#{id},#{jobNum},#{passWord},#{userName},#{userTel},#{userSex},#{deptNum},#{deptName},#{job})")
//    void addUser(User user);
//
//    //修改一个用户
//    @Update("UPDATE tbl_user SET passWord = #{passWord}, userName=#{userName}, userTel=#{userTel}, userSex=#{userSex}, deptName =#{deptName} WHERE jobNum = #{jobNum} ")
//    void updateUser(User user);
//
//    //删除一个用户
//    @Delete("DELETE FROM tbl_user WHERE jobNum = #{jobNum}")
//    void deleteUser(@Param("jobNum") String jobNum);
//
//    @Update("UPDATE tbl_user SET job = #{job} WHERE jobNum = #{jobNum}")
//    void updateJob(User user);
//
//    @Select("SELECT * FROM tbl_user WHERE job = '2' AND deptNum = #{deptNum}")
//    User selectUserByDept(String deptNum);
//
//    @Select("SELECT * FROM tbl_user WHERE userName = #{userName}")
//    User selectUserByName(String userName);
//
//    @Select("Select * from tbl_user where job = '3' and deptName = '采购部'")
//    List<User> getAllPruchase();

}
