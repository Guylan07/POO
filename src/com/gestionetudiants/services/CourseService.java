package com.gestionetudiants.services; //fait partie du package com.gestionetudiants.services

import com.gestionetudiants.models.Course; //utilise Course
import java.util.HashMap; //Utilise HashMap
import java.util.Map; //Utilise Map

public class CourseService {
    private Map<String, Course> courses = new HashMap<>();
    // stocke les cours sous forme de paires : la clé est le 
    // code du cours (de type String), et la valeur est un objet Course

    public void addCourse(Course course) { //ajoute un nouveau cours dans la collection
        courses.put(course.getCourseCode(), course); //associe le code du cours à l'objet Course correspondant
    }

    public Course getCourse(String courseCode) { //récupère un cours en se basant sur le code du cours
        return courses.get(courseCode); //Renvoie l'objet Course ayant pour clé Course.code
    }
}
