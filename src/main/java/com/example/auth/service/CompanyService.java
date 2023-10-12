package com.example.auth.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.auth.model.Company;
import com.example.auth.repository.CompanyRepository;

@Service
public class CompanyService {

    @Autowired
    private CompanyRepository companyRepository;

    // Get All Companys
    public List<Company> getCompanys() {

        return companyRepository.findAll();
    }
}
