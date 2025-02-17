package com.tw.apistackbase.model;


import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;
import javax.validation.constraints.NotNull;

@Entity
public class CriminalCase {

    @Id
    @GeneratedValue(generator = "uuid")
    @GenericGenerator(name = "uuid", strategy = "uuid")
    private String id;

    @NotNull
    private Long time;

    @NotNull
    private String name;

    @NotNull
    @ManyToOne
//    @JoinColumn()
    private Procuratorate procuratorate;

    @OneToOne
    private CriminalDescription criminalDescription;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public Long getTime() {
        return time;
    }

    public void setTime(Long time) {
        this.time = time;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public CriminalDescription getCriminalDescription() {
        return criminalDescription;
    }

    public void setCriminalDescription(CriminalDescription criminalDescription) {
        this.criminalDescription = criminalDescription;
    }

    public Procuratorate getProcuratorate() {
        return procuratorate;
    }

    public void setProcuratorate(Procuratorate procuratorate) {
        this.procuratorate = procuratorate;
    }
}
