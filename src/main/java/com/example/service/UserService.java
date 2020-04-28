package com.example.service;

import com.example.entity.peopleManager.User;

import java.util.List;

public interface UserService {

    public User selectUserByUNo(String u_no);

    public List<User> findAllUser();

    public boolean addUser(User user);

    public boolean updateUser(User user);

    public boolean deleteUser(String u_no);


}
