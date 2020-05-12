package com.example.service;

import com.example.entity.peopleManager.NotReturn;

import java.util.List;

public interface NotReturnService {

    public List<NotReturn> findAllLR(String ssh,String s_no,String sz,String bzr);

    public boolean addLR(NotReturn lr);

    public boolean updateLR(NotReturn lr);

    public boolean deleteLR(String s_no);

    public NotReturn selectLRBySNo(String s_no);
    
}
