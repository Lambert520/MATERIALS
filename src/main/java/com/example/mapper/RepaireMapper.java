package com.example.mapper;

import com.example.entity.peopleManager.Repaire;

import org.apache.ibatis.annotations.*;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

import java.util.List;

@Mapper
@Repository
public interface RepaireMapper {

    //根据工号查找用户
    @Select("SELECT * FROM repaired WHERE d_no = #{d_no}")
    Repaire findRByDNo(@Param("d_no") String d_no);

    @Select({"<script>",
            "SELECT * FROM repaired where 1=1",
            "<if test='ssh != null and ssh !=\"\"'>",
            "and d_no = #{ssh}",
            "</if>",
            "</script>"})
    List<Repaire> findAllR(String ssh);

    //新增用户
    @Insert("INSERT INTO repaired(d_no,repaired_item,commit_time,solve_time,repaired_reason) VALUES (#{d_no},#{repaired_item},#{commit_time},#{solve_time},#{repaired_reason})")
    void addR(Repaire  R);

    //修改一个用户
    @Update("UPDATE repaired SET repaired_item=#{repaired_item},commit_time=#{commit_time},solve_time =#{solve_time},repaired_reason =#{repaired_reason} WHERE repaired_id = #{repaired_id} ")
    void updateR(Repaire  R);

    //删除一个用户
    @Delete("DELETE FROM repaired WHERE repaired_id = #{repaired_id}")
    void deleteR(@Param("repaired_id") String repaired_id);
    
    
    //通过宿舍号查找报修信息
    @Select("SELECT * FROM repaired WHERE repaired_id = #{d_no}")
    Repaire selectRByDNo(String d_no);

    
}
