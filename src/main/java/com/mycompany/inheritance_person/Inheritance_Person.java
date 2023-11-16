/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.inheritance_person;

/**
 *
 * @author Administrator
 */
public class Inheritance_Person {

    public static void main(String[] args) {
        Person person = new Person();
        
        person.name = "Papu";
        person.arrive();
        person.play();
        
        Person student = new Student();
        
        System.out.println("El estudiante " + student.getName() + " " + student.getLastname() 
        + " tiene " + student.getAge() + " pesa " + student.getWeight()+"kg y mide " 
        + student.getHeight() + " y tiene el pelo " + student.getHairColour());
        
        student.arrive();
        
        Student stud = new Student();
        stud.study();
       
        
        Professor professor = new Professor();
        
        System.out.println("El profesor " + professor.getName() + " " + professor.getLastname() 
        + " tiene " + professor.getAge() + " pesa " + professor.getWeight()+"kg y mide " 
        + professor.getHeight() + " y tiene el pelo " + professor.getHairColour());
        
        professor.arrive();
        professor.teach();
    }
}
