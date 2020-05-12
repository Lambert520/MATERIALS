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

    @Select("SELECT * FROM user_info WHERE u_no = #{u_no} and u_password = #{password}")
    User findUserByNoAndPassword(@Param("u_no") String u_no,@Param("password") String password);

    //获取所有用户
    @Select({"<script>",
            "SELECT * FROM user_info where 1=1",
            "<if test='u_type != null and u_type !=\"\"'>",
            "and u_type = #{u_type}",
            "</if>",
            "<if test='u_no != null and u_no !=\"\"'>",
            "and (u_no = #{u_no} or u_name = '${u_no}')",
            "</if>",
            "</script>"})
    List<User> findAllUser(@Param("u_type") String u_type,@Param("u_no") String u_no);

    //新增用户
    @Insert("INSERT INTO user_info(u_no,u_name,u_password,u_type) VALUES (#{u_no},#{u_name},#{u_password},#{u_type})")
    void addUser(User user);

    //修改一个用户
    @Update("UPDATE user_info SET u_password =#{u_password}, u_name=#{u_name},u_type=#{u_type} WHERE id =#{id} ")
    void updateUser(User user);

    //删除一个用户
    @Delete("DELETE FROM user_info WHERE id = #{id}")
    void deleteUser(@Param("id") String id);


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
