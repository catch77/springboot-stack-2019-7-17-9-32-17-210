package com.tw.apistackbase.repo;

import com.tw.apistackbase.model.CriminalDescription;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

public interface CriminalDescriptionRepo extends JpaRepository<CriminalDescription, String> {

//    @Query

}
