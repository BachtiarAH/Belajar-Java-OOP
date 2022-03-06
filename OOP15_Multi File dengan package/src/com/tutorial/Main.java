/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.tutorial;

import com.console.console;

public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Hero hero1 = new Hero("saitam");
        Hero hero2 = new Hero("genos");
        
        console.log("nama nama hero");
        
        hero1.Show();
        hero2.Show();
        
        
    }
    
}
