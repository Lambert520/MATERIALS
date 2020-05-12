package com.example.service;

import com.example.entity.peopleManager.UseElec;

import java.util.List;

public interface UseElecService {

    public List<UseElec> findAllUE(String ssh,String s_no,String sz,String bzr);

    public boolean addUE(UseElec ue);

    public boolean updateUE(UseElec ue);

    public boolean deleteUE(String s_no);

    public UseElec selectUEBySNo(String s_no);
    
}
