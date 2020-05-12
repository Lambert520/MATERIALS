package com.example.service;

import com.example.entity.peopleManager.Repaire;

import java.util.List;

public interface RepaireService {

    public List<Repaire> findAllR(String ssh);

    public boolean addR(Repaire r);

    public boolean updateR(Repaire r);

    public boolean deleteR(String d_no);

    public Repaire selectRByDNo(String d_no);
    
}