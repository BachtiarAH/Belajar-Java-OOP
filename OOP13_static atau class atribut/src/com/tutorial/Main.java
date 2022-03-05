/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.tutorial;

class Display{
    String name;
    static String type = "monitor";
    
    Display(String name){
        this.name = name;
    }
    
    void setType(String type){
        Display.type = type;
    }
    
    void show(){
        System.out.println("\ndisplay name\t= "+this.name);
        System.out.println("display tyoe\t= "+this.type);
    }
    
    
}
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Display display1 = new Display("acer");
        Display display2 = new Display("xiaomi");
        
        display1.show();
        display2.show();
        
        display1.setType("laptop");
        
        display1.show();
        display2.show();
        
    }
    
}
