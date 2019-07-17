package com.tw.apistackbase.controller;

import com.tw.apistackbase.model.CriminalCase;
import com.tw.apistackbase.repo.CriminalCaseRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/criminalcases")
public class CriminalCaseController {

    @Autowired
    private CriminalCaseRepo caseRepo;

    @GetMapping("{id}")
    public CriminalCase find(@PathVariable String id) {
        return caseRepo.findById(id).orElse(null);
    }

}
