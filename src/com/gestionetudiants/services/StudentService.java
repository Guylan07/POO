package com.gestionetudiants.services; //La classe StudentService est placée dans le package com.gestionetudiants.service

import com.gestionetudiants.models.Student; //Utilise la classe Student
import java.util.HashMap; //Utilise la class HashMap
import java.util.Map; //Utilise la classe Map

public class StudentService {
    private Map<String, Student> students = new HashMap<>();

    //Utilise l'ID de l'étudiant (string) comme clé et l'objet Student comme valeur
    //sa permet de stocker et récupérer rapidement les objets Student

    public void addStudent(Student student) { //ajoute un nouvel étudiant dans Students
        students.put(student.getStudentID(), student); //Stocke l'étudiant dans la map, ou la clé est l'ID de l'étudiant
    }

    public Student getStudent(String studentID) { //récupère l'objet Student correspondant à l'ID donné
        return students.get(studentID); //retourne l'obket Student qui a pour clé studentID
    }
}

//La classe StudentService utilise une map pour gérer en mémoire les étudients stcokès via leur identifiant unique