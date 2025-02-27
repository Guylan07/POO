package com.gestionetudiants.models;//fait partie du modèle de données

public abstract class Person { //classe abstraite person
    protected String name; //Champs protégés name
    protected int age; //Champ protégés age

    public Person(String name, int age) { //initialise ces champs
        this.name = name; 
        this.age = age; 
    }

    public String getName() { return name; } //getter pour accèder à name
    public int getAge() { return age; } //getter pour accèder à age

    public abstract String getDetails(); //Toutes classe qui hérite de Person doit
    //implémenter cette méthode
}
