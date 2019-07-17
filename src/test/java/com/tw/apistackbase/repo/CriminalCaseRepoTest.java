package com.tw.apistackbase.repo;

import com.tw.apistackbase.model.CriminalCase;
import org.junit.Test;
import org.junit.jupiter.api.Assertions;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.jdbc.AutoConfigureTestDatabase;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.util.ArrayList;
import java.util.Collection;

import static org.junit.jupiter.api.Assertions.assertSame;
import static org.junit.jupiter.api.Assertions.assertThrows;

@RunWith(SpringJUnit4ClassRunner.class)
@DataJpaTest
@AutoConfigureTestDatabase(replace = AutoConfigureTestDatabase.Replace.NONE)
public class CriminalCaseRepoTest {

    @Autowired
    private CriminalCaseRepo caseRepo;

    @Test
    public void should_return_fail_when_save_case() {
        CriminalCase criminalCase = new CriminalCase();
        assertThrows(Exception.class, () ->
                caseRepo.saveAndFlush(criminalCase));
    }

    @Test
    public void should_return_criminalcase_when_save_case() {
        CriminalCase criminalCase = new CriminalCase();
        criminalCase.setHappenTime((long)52222);
        criminalCase.setName("fight");
        CriminalCase criminalCase1 = new CriminalCase();
        criminalCase1.setHappenTime((long)52222);
        criminalCase1.setName("fight");
        caseRepo.save(criminalCase);
        caseRepo.save(criminalCase1);
        assertSame(2, new ArrayList<CriminalCase>((Collection<? extends CriminalCase>) caseRepo.findAll()).size());
    }

}