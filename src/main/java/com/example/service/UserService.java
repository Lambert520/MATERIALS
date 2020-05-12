package com.example.service;

import com.example.entity.peopleManager.User;

import java.util.List;

public interface UserService {

    public User selectUserByUNo(String u_no);

    User findUserByNoAndPassword(String u_no,String password);


    public List<User> findAllUser(String u_type,String u_no);

    public boolean addUser(User user);

    public boolean updateUser(User user);

    public boolean deleteUser(String u_no);


}
