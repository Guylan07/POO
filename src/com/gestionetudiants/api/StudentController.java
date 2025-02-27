package com.gestionetudiants.api;

import com.gestionetudiants.models.Student;
import com.gestionetudiants.services.StudentService;

public class StudentController {
    private StudentService studentService = new StudentService();

    public void createStudent(String name, int age, String studentID) {
        Student student = new Student(name, age, studentID);
        studentService.addStudent(student);
        System.out.println("Student added: " + student.getDetails());
    }
}
