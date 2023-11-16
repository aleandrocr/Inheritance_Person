/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.inheritance_person;

/**
 *
 * @author Administrator
 */
public class Professor extends Person {
        public Professor() {
        this.name= "Felix";
        this.lastname = "Cordero";
        this.age = 42;
        this.height = 168;        
        this.weight = 105;
        this.hairColour = "Negro";
    }
    
    public void teach () {
        System.out.println("Profe Felix explica CCNA muy rapido");
    }
    
    @Override
    public void arrive(){
        System.out.println("Profe Felix llega tarde");
    }
}
