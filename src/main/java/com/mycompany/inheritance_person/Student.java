/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.inheritance_person;

/**
 *
 * @author Administrator
 */
public class Student extends Person{
    public Student() {
        this.name= "Brayan";
        this.lastname = "Selva";
        this.age = 16;
        this.height = 175;        
        this.weight = 86;
        this.hairColour = "Negro";
    }
    
    public void study () {
        System.out.println("Selva anda estudiando para civica");
    }
    
    @Override
    public void arrive(){
        System.out.println("Selva llega tardisimo");
    }
}
