package com.gestionetudiants.models;

public class Enrollment {
    // Référence à un étudiant
    private Student student;
       // Référence à un cours
    private Course course;

  // Constructeur pour initialiser une inscription (association entre un étudiant et un cours)
    public Enrollment(Student student, Course course) {
        this.student = student;
        this.course = course;
    }
    // Méthode pour enregistrer l'étudiant dans le cours
    public void register() {
           // Appelle la méthode enrollStudent() de la classe Course pour inscrire l'étudiant
        course.enrollStudent(student);
    }
}
