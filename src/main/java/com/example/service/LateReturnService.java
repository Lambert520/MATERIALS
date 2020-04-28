package com.example.service;

import com.example.entity.peopleManager.LateReturn;

import java.util.List;

public interface LateReturnService {

    public List<LateReturn> findAllLR();

    public boolean addLR(LateReturn lr);

    public boolean updateLR(LateReturn lr);

    public boolean deleteLR(String s_no);

    public LateReturn selectLRBySNo(String s_no);
    
}
