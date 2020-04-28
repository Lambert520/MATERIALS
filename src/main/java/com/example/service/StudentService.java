package com.example.service;

import com.example.entity.peopleManager.Student;

import java.util.List;

public interface StudentService {

    public List<Student> findAllS();

    public boolean addS(Student s);

    public boolean updateS(Student s);

    public boolean deleteS(String s_no);

    public Student selectSBySN(String s_name);
    
    public Student selectSBySNo(String S_no);

}
