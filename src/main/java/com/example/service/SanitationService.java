package com.example.service;

import com.example.entity.peopleManager.Sanitation;

import java.util.List;

public interface SanitationService {

    public List<Sanitation> findAllSA();

    public boolean addSA(Sanitation s);

    public boolean updateSA(Sanitation s);

    public boolean deleteSA(String d_no);
    
    public Sanitation selectSAByDNo(String d_no);

}
