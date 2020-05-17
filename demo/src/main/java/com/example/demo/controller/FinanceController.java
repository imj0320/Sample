package com.example.demo.controller;

import java.sql.Date;
import java.time.LocalDate;

import com.example.demo.model.FinancialAdvisor;
import com.example.demo.respository.FinanceRespository;
import com.fasterxml.jackson.core.sym.Name;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping("/advisors")
public class FinanceController {
    
    @Autowired
    private FinanceRespository respository;

    @GetMapping
    public List<FinancialAdvisor>getAllFinancialAdvisors(){

        respository.save(new FinancialAdvisor(name "Mj", Date.valueOf(LocalDate.now()), mobile "123456789",address"Somewhere",
        fieldArea "Farm Field", Date.valueOf(LocalDate.now())));
        
        List<FinancialAdvisor> all = respository.findAll();
        return all;
    }
}