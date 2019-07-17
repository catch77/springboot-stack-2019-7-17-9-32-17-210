package com.tw.apistackbase.controller;

import com.tw.apistackbase.repo.CriminalCaseRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CriminalCaseController {

    @Autowired
    private CriminalCaseRepo caseRepo;


}
