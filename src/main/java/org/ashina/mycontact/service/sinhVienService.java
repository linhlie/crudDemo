package org.ashina.mycontact.service;

import org.ashina.mycontact.entity.sinhvien;

import java.util.List;


public interface sinhVienService {
    List<sinhvien> findByIdlop(long idlop);

}
