package com.example.demo.Entities;


import org.springframework.format.annotation.DateTimeFormat;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name ="estudiantes")
public class Estudiante{
    @Id
    @Column(name = "id", nullable = false)
    private Long id;

    @Column(name = "nombres")
    private String names;

    @Column(name="email")
    private String email;

    @Column(name="carnet")
    private String carnet;

    @Column(name = "promedio")
    private double average;

    @Column(name = "fecha")
    @Temporal(TemporalType.DATE)
    private Date date;


    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNames() {
        return names;
    }

    public void setNames(String names) {
        this.names = names;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getCarnet() {
        return carnet;
    }

    public void setCarnet(String carnet) {
        this.carnet = carnet;
    }

    public double getAverage() {
        return average;
    }

    public void setAverage(double average) {
        this.average = average;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }
}
