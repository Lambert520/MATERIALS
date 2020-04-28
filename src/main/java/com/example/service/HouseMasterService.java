package com.example.service;

import com.example.entity.peopleManager.HouseMaster;

import java.util.List;

public interface HouseMasterService {

    public List<HouseMaster> findAllHM();

    public boolean addHM(HouseMaster hm);

    public boolean updateHM(HouseMaster hm);

    public boolean deleteHM(String h_no);

//    public void updateJob(HouseMaster user);

    public HouseMaster selectHMByHNo(String h_no);

    public HouseMaster selectHMByBuildNo(String build_no);

}
