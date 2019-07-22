package com.tw.apistackbase.repo;

import com.tw.apistackbase.model.Prosecutor;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProsecutorRepo extends JpaRepository<Prosecutor, String> {
}
