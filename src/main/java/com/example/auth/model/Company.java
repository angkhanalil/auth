package com.example.auth.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

@Data
@Entity
@Table(name = "WW_MAS_COMPANY")
public class Company {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "COMPANY_ID")
    private int companyId;

    @Column(name = "COMPANY_CODE")
    private String companyCode;

    @Column(name = "COMPANY_NAME")
    private String companyName;

    @Column(name = "COMPANY_ADDR")
    private String companyAddr;

    @Column(name = "COMPANY_TEL")
    private String companyTel;

    @Column(name = "COMPANY_EMAIL")
    private String companyEmail;

    @Column(name = "QRCODE")
    private String qrCode;

    @Column(name = "COMP_BUS_STATUS")
    private String compBusStatus;

    @Column(name = "FLAG_DEL")
    private String flagDel;

    @Column(name = " COMPANY_DESC")
    private String companyDesc;

    @Column(name = "IMG_COMPANY")
    private String imageCompany;

    @Column(name = "IMAGE_FULLPATH")
    private String imageFullpath;

    @Column(name = "IMAGE_FILENAME")
    private String imageFilename;

}
