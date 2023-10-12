package com.example.auth.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.auth.exception.ResourceNotFoundException;
import com.example.auth.model.Company;
import com.example.auth.service.CompanyService;

@RestController
@CrossOrigin
@RequestMapping("")
public class CompanyController {

    @Autowired
    private CompanyService companyService;

    // Get All Company
    @GetMapping("/companys")
    public ResponseEntity<List<Company>> getCompanys() throws ResourceNotFoundException {

        List<Company> company = companyService.getCompanys();

        if (!company.equals(null)) {
            return new ResponseEntity<List<Company>>(company, HttpStatus.OK);
        }
        throw new ResourceNotFoundException("Company Not Found");
    }
}
