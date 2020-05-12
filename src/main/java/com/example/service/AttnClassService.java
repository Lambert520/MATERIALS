package com.example.service;

import com.example.entity.peopleManager.AttnClass;

import java.util.List;

public interface AttnClassService {

    public List<AttnClass> findAllAC(String ssh,String s_no,String sz,String bzr);

    public boolean addAC(AttnClass ac);

    public boolean updateAC(AttnClass ac);

    public boolean deleteAC(String s_no);

    public AttnClass selectACBySNo(String s_no);
    
}
