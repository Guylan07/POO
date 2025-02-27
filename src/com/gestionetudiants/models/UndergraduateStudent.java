package com.gestionetudiants.models;

public class UndergraduateStudent extends Student {
    private String major; //UndergraduateStudent étend Student, et hérite des attributs et méthodes d'un student

    public UndergraduateStudent(String name, int age, String studentID, String major) {
        super(name, age, studentID);
        this.major = major;
    }

    @Override
    public String getDetails() {
        return super.getDetails() + ", Major: " + major;
    }
}

