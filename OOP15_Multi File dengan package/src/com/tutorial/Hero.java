/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.tutorial;

/**
 *
 * @author user
 */
public class Hero {
    String name;
    
    Hero(String name){
        this.name = name;
    }
    
    public void setName(String name){
        this.name = name;
    }
    
    public void Show(){
        System.out.println("nama Hero\t= "+this.name);
    }
}
