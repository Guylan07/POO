package com.gestionetudiants.models;

public class GraduateStudent extends Student {
    // Champ supplémentaire pour stocker le titre de la thèse de l'étudiant diplômé
    private String thesisTitle;

       // Constructeur pour initialiser un étudiant diplômé
    public GraduateStudent(String name, int age, String studentID, String thesisTitle) {
         // Appelle le constructeur de la classe parente (Student) pour initialiser les champs hérités
        super(name, age, studentID);
        // Initialise le champ spécifique à GraduateStudent (thesisTitle)
        this.thesisTitle = thesisTitle;
    }

    // Redéfinition de la méthode getDetails() pour inclure le titre de la thèse
    @Override
    public String getDetails() {
        // Appelle la méthode getDetails() de la classe parente (Student) et ajoute le titre de la thèse
        return super.getDetails() + ", Thesis: " + thesisTitle;
    }
}
