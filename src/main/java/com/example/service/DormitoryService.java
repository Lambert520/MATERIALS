package com.example.service;

import com.example.entity.peopleManager.Dormitory;

import java.util.List;

public interface DormitoryService {

    public List<Dormitory> findAllD();

    public boolean addD(Dormitory d);

    public boolean updateD(Dormitory d);

    public boolean deleteD(String d_no);
    
    public Dormitory selectDByDNo(String d_no);

}
