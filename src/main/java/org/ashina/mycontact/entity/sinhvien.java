package org.ashina.mycontact.entity;

import javax.persistence.*;

@Entity
@Table(name = "sinhvien")
public class sinhvien {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "idsinhvien", nullable = false)
    private long idsinhvien;

    private long idlop;

    private String name;

    private int age;

    public long getIdsinhvien() {
        return idsinhvien;
    }

    public void setIdsinhvien(long idsinhvien) {
        this.idsinhvien = idsinhvien;
    }

    public long getIdlop() {
        return idlop;
    }

    public void setIdlop(long idlop) {
        this.idlop = idlop;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
