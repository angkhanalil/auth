package com.example.auth.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.auth.model.Company;

public interface CompanyRepository extends JpaRepository<Company, Integer> {

    List<Company> findAll();

}
