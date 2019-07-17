package com.tw.apistackbase.repo;

import com.tw.apistackbase.model.CriminalCase;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CriminalCaseRepo extends JpaRepository<CriminalCase, String> {


}
