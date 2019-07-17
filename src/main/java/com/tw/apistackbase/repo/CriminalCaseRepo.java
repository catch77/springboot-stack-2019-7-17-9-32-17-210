package com.tw.apistackbase.repo;

import com.tw.apistackbase.model.CriminalCase;
import org.hibernate.annotations.OrderBy;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;
import java.util.Set;

public interface CriminalCaseRepo extends JpaRepository<CriminalCase, String> {

    List<CriminalCase> findAllByOrderByTimeDesc();

    List<CriminalCase> findByName();
}
