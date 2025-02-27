package com.gestionetudiants; //Cette classe appartient au package com.gestionetudiants

import com.gestionetudiants.api.StudentController; //accès à la classes StudentController
import com.gestionetudiants.utils.Database; //accès à la classe Database

public class Main {
    public static void main(String[] args) {
        Database.connect(); //Pour se connecter à la base de donnée

        StudentController studentController = new StudentController(); //Crée une nouvelle instance de la classe StudentController
        studentController.createStudent("Alice", 20, "S001"); //appelle la méthode createStudent pour ajouter un nouvel étudiant
        studentController.createStudent("Bob", 22, "S002");
    }
}
