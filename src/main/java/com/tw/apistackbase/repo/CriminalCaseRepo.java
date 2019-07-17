package com.tw.apistackbase.repo;

import com.tw.apistackbase.model.CriminalCase;
import org.hibernate.annotations.OrderBy;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface CriminalCaseRepo extends JpaRepository<CriminalCase, String> {

    @OrderBy(clause = "happenTime DESC")
    List<CriminalCase> findAll();

}
