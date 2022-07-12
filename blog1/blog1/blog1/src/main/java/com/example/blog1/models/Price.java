package com.example.blog1.models;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Price {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    private String name, email;
    private float population, routers, rad_routers, anten, station, atc, kbc, num_employ, aver_salary;
    double sum1, sum2;

    public Price(String name1, String email1, float population, float routers, float rad_routers, float anten, float station, float atc, float kbc, float num_employ, float aver_salary) {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public float getPopulation() {
        return population;
    }

    public void setPopulation(float population) {
        this.population = population;
    }

    public float getRouters() {
        return routers;
    }

    public void setRouters(float routers) {
        this.routers = routers;
    }

    public float getRad_routers() {
        return rad_routers;
    }

    public void setRad_routers(float rad_routers) {
        this.rad_routers = rad_routers;
    }

    public float getAnten() {
        return anten;
    }

    public void setAnten(float anten) {
        this.anten = anten;
    }

    public float getStation() {
        return station;
    }

    public void setStation(float station) {
        this.station = station;
    }

    public float getAtc() {
        return atc;
    }

    public void setAtc(float atc) {
        this.atc = atc;
    }

    public float getKbc() {
        return kbc;
    }

    public void setKbc(float kbc) {
        this.kbc = kbc;
    }

    public float getNum_employ() {
        return num_employ;
    }

    public void setNum_employ(float num_employ) {
        this.num_employ = num_employ;
    }

    public float getAver_salary() {
        return aver_salary;
    }

    public void setAver_salary(float aver_salary) {
        this.aver_salary = aver_salary;
    }

    public double getSum1() {
        return sum1;
    }

    public void setSum1(double sum1) {
        this.sum1 = sum1;
    }

    public double getSum2() {
        return sum2;
    }

    public void setSum2(double sum2) {
        this.sum2 = sum2;
    }
}
