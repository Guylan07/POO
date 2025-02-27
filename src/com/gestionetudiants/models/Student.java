package com.gestionetudiants.models;

import java.util.ArrayList;
import java.util.List;

public class Student extends Person {
    private String studentID; //identifiant de l'étudiant
    private List<Double> grades; //Liste de notes de l'étudiant

    public Student(String name, int age, String studentID) {
        super(name, age); //initialise name et age
        this.studentID = studentID; //initialise le studentID
        this.grades = new ArrayList<>(); //crée une liste vide
    }

    public void addGrade(double grade) {
        grades.add(grade); //ajoute une note à la liste grades
    }

    public double getAverageGrade() { //calcule la moyenne des notes stcokées dans grades, si y a pas de note, la moyenne est 0.0
        return grades.stream().mapToDouble(Double::doubleValue).average().orElse(0.0);
        //renvoie l'ID de l'étudiant
    }

    public String getStudentID() { return studentID; }

    @Override
    public String getDetails() { //implémente la méthode abstraite de la classe Person
        return "Student: " + name + ", Age: " + age + ", ID: " + studentID;
    }
}

//représente un étudiant de manière générale dans l'application avec la possibilité de stocker des notes
// et de calculer leur moyenne