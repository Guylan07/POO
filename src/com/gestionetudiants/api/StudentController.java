package com.gestionetudiants.api;

import com.gestionetudiants.models.Student;
// Importe la classe Student du package models
import com.gestionetudiants.services.StudentService;
// Importe la classe StudentService du package services

public class StudentController {
    // Crée une instance de StudentService pour gérer les opérations liées aux étudiants
    private StudentService studentService = new StudentService();

     // Méthode pour créer un nouvel étudiant
    public void createStudent(String name, int age, String studentID) {
         // Crée un nouvel objet Student avec les informations fournies (nom, âge, ID)
        Student student = new Student(name, age, studentID);
             // Utilise le StudentService pour ajouter l'étudiant à la liste des étudiants
        studentService.addStudent(student);
        // Affiche les détails de l'étudiant ajouté dans la console
        System.out.println("Student added: " + student.getDetails());
    }
}
