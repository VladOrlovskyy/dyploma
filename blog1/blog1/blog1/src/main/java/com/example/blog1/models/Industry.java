
package com.example.blog1.models;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Industry {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    private String i_name, i_email;
    private float iu_email, iu_file, iweb, iphone, ivideo_phone, iaudio_phone, ivideo, ivideo_hd;
    private double IsumN, IsumP;

    public Industry(String i_name, String i_email, float iu_email, float iu_file, float iweb, float iphone, float ivideo_phone, float iaudio_phone, float ivideo, float ivideo_hd) {
    }


    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getI_name() {
        return i_name;
    }

    public void setI_name(String i_name) {
        this.i_name = i_name;
    }

    public String getI_email() {
        return i_email;
    }

    public void setI_email(String i_email) {
        this.i_email = i_email;
    }

    public float getIu_email() {
        return iu_email;
    }

    public void setIu_email(float iu_email) {
        this.iu_email = iu_email;
    }

    public float getIu_file() {
        return iu_file;
    }

    public void setIu_file(float iu_file) {
        this.iu_file = iu_file;
    }

    public float getIweb() {
        return iweb;
    }

    public void setIweb(float iweb) {
        this.iweb = iweb;
    }

    public float getIphone() {
        return iphone;
    }

    public void setIphone(float iphone) {
        this.iphone = iphone;
    }

    public float getIvideo_phone() {
        return ivideo_phone;
    }

    public void setIvideo_phone(float ivideo_phone) {
        this.ivideo_phone = ivideo_phone;
    }

    public float getIaudio_phone() {
        return iaudio_phone;
    }

    public void setIaudio_phone(float iaudio_phone) {
        this.iaudio_phone = iaudio_phone;
    }

    public float getIvideo() {
        return ivideo;
    }

    public void setIvideo(float ivideo) {
        this.ivideo = ivideo;
    }

    public float getIvideo_hd() {
        return ivideo_hd;
    }

    public void setIvideo_hd(float ivideo_hd) {
        this.ivideo_hd = ivideo_hd;
    }

    public double getIsumN() {
        return IsumN;
    }

    public void setIsumN(double isumN) {
        IsumN = isumN;
    }

    public double getIsumP() {
        return IsumP;
    }

    public void setIsumP(double isumP) {
        IsumP = isumP;
    }
}




