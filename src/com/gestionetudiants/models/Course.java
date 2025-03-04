package com.gestionetudiants.models;

import java.util.ArrayList;
import java.util.List;

public class Course {
    // Nom du cours
    private String courseName;
    // Code du cours (identifiant unique)
    private String courseCode;
     // Nombre d'heures de crédit du cours
    private int creditHours;
     // Liste des étudiants inscrits à ce cours
    private List<Student> students;

    // Constructeur pour initialiser un cours
    public Course(String courseName, String courseCode, int creditHours) {
        this.courseName = courseName;
        this.courseCode = courseCode;
        this.creditHours = creditHours;
        // Initialise la liste des étudiants comme une ArrayList vide
        this.students = new ArrayList<>();
    }

   // Getter pour récupérer le nom du cours
    public String getCourseName() {
        return courseName;
    }

    // Getter pour récupérer le code du cours
    public String getCourseCode() {
        return courseCode;
    }

     // Getter pour récupérer le nombre d'heures de crédit du cours
    public int getCreditHours() {
        return creditHours;
    }

    // Getter pour récupérer la liste des étudiants inscrits au cours
    public List<Student> getEnrolledStudents() {
        return students;
    }
    
    // Méthode pour inscrire un étudiant au cours
    public void enrollStudent(Student student) {
        // Ajoute l'étudiant à la liste des étudiants inscrits
        students.add(student);
    }
}
