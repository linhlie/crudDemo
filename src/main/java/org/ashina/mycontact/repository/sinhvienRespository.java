package org.ashina.mycontact.repository;

import org.ashina.mycontact.entity.sinhvien;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface sinhvienRespository extends CrudRepository<sinhvien,Long> {

    List<sinhvien> findByIdlop(long idlop);
}
