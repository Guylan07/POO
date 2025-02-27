package com.gestionetudiants.models;

public class GraduateStudent extends Student {
    private String thesisTitle;

    public GraduateStudent(String name, int age, String studentID, String thesisTitle) {
        super(name, age, studentID);
        this.thesisTitle = thesisTitle;
    }

    @Override
    public String getDetails() {
        return super.getDetails() + ", Thesis: " + thesisTitle;
    }
}
