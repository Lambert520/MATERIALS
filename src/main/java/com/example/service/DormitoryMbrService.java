package com.example.service;

import com.example.entity.peopleManager.DormitoryMbr;

import java.util.List;

public interface DormitoryMbrService {

    public List<DormitoryMbr> findAllDM(String ssh,String bzr,String d_no);

    public boolean addDM(DormitoryMbr dm);

    public boolean updateDM(DormitoryMbr dm);

    public boolean deleteDM(String d_no);

    DormitoryMbr selectDMBySno(String s_no);
    
    public DormitoryMbr selectDMByDNo(String d_no);

}
