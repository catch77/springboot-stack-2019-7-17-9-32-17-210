package com.tw.apistackbase.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.validation.constraints.NotNull;

@Entity
public class Procuratorate {

    @Id
    private String id;

    @Id
    @Column(length = 50)
    @NotNull
    private String name;


}
