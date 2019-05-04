package org.ashina.mycontact.service;

import org.ashina.mycontact.entity.sinhvien;
import org.ashina.mycontact.repository.sinhvienRespository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class SinhVienServiceImpl implements sinhVienService {
    @Autowired
    sinhvienRespository sinhvienRespository;

    public List<sinhvien> findByIdlop(long idlop) {
        List<sinhvien> list = new ArrayList<>();
        list=sinhvienRespository.findByIdlop(idlop);
        System.out.println("++++++");
        System.out.println(list.get(0).getName());
        System.out.println("++++++");
        return sinhvienRespository.findByIdlop(idlop);
    }
}
