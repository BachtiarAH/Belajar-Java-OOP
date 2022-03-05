package com.tutorial;

import java.util.ArrayList;
import java.util.Arrays;

class hero{
    String name;
    static int numberOfHero=0;
    static ArrayList<String> listNama = new ArrayList<String>();
    
    hero(String name){
        this.name = name;
        hero.numberOfHero++;
        listNama.add(name);
    }
    
    public void showNumberOfHero(){
        System.out.println("jumlah hero yang terdaftar = "+hero.numberOfHero);
    }
    
    public void showListHero(){
        System.out.println("nama nama hero = "+ listNama);
    }
}

public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        hero hero1 = new hero("Super Man");
        hero hero2 = new hero("Bat Man");
        hero hero3 = new hero("Wonder Woman");
        hero hero4 = new hero("Flash");
        
        hero1.showNumberOfHero();
        hero1.showListHero();
    }
    
}
