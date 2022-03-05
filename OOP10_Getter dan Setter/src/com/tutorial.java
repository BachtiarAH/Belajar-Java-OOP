/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com;

class persegi{
    private double lebar, panjang;
    
    persegi(double lebar,double panjang){
        this.lebar = lebar;
        this.panjang = panjang;
    }
    
    public void displayAll(){
        System.out.println("lebar\t= "+this.lebar);
        System.out.println("panjang\t= "+this.panjang);
        System.out.println("luas\t= "+ (panjang * lebar));
    }
    
    //setter
    public void setLebar(double lebar){
        this.lebar = lebar;
    }
    
    public void setPanjang(double panjang){
        this.panjang = panjang;
    }
    
    //getter
    public double getLebar(){
        return this.lebar;
    }
    
    public double getPanjang(){
        return this.panjang;
    }
    
    public double getLuas(){
        return panjang * lebar;
    }
}

public class tutorial {
    public static void main(String[] args) {
        persegi kotak = new persegi(9,3);
        
        kotak.displayAll();
        
        System.out.println(kotak.getLuas());
    }
    
}
