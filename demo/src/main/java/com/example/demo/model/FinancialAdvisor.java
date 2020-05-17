package com.example.demo.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.sql.Date;

@Entity
public class FinancialAdvisor{
    private String name;
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer advisorId;
    private Date birthDate;
    private String mobile;
    private String address;
    private String fieldArea;
    private Date startDate;
}

//Default Constructor

public FinancialAdvisor(){
}

public FinancialAdvisor(String name, Integer advisordId, Date birthdDate, String mobile, String address, String fieldArea, Date startDate){
    this.name = name;
    this.advisorId = advisordId;
    this.birthDate = birthdDate;
    this.mobile = mobile;
    this.address = address;
    this.fieldArea = fieldArea;
    this.startDate = startDate;
}

//Getter Methods
public String getName(){
    return name;
}

public Date getBirthdate(){
    return birthdate;
}

public String getmobile(){
    return mobile;
}

public String getAddress(){
    return address;
}

public String getFieldarea(){
    return fieldArea;
}

public Date getStartdate(){
    return startDate;
}

//Setter Method

public void setName(String name){
    this.name = name;
}

public void setBirthdate(Date birthdate){
    this.birthdate = birthdate;
}

public void setMobile(String mobile){
    this.mobile = mobile;
}

public void setAddress(String address){
    this.address = address;
}

public void setFieldarea(String fieldArea){
    this.fieldArea = fieldArea;
}

public void setStartdate(Date startDate){
    this.startDate = startDate;
}