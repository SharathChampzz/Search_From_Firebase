package com.example.search;

public class Helper {
    private String disease, medication;

    public Helper() {
    }

    public Helper(String disease, String medication) {
        this.disease = disease;
        this.medication = medication;
    }

    public String getDisease() {
        return disease;
    }

    public void setDisease(String disease) {
        this.disease = disease;
    }

    public String getMedication() {
        return medication;
    }

    public void setMedication(String medication) {
        this.medication = medication;
    }
}
