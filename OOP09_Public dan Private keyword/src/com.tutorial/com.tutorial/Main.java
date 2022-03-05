package com;

class Player{
    String name; // bisa read dan write disemua class
    public int exp; //bisa read dan write disemua class
    private int health; // cuma bisa read dan write di class ini
    
    Player(String name, int exp,int health){
        this.name = name;
        this.exp = exp;
        this.health = health;
    }
    
    //default
    void DisplayAll(){
        System.out.println("\n" + this.name);
        System.out.println(this.exp);
        System.out.println(this.health);
    }
    
    //public
    public void setHealth(int health){
        this.health = health;
    }
    
    //private
    private void setExp (int exp){
        this.exp = exp;
    }
}

class Main{
    public static void main(String[] args) {
        Player player1 = new Player("Bakti", 30, 20);
        
        //default
        System.out.println(player1.name);
        player1.name = "bilqis";
        System.out.println(player1.name);
        
        //publis
        System.out.println(player1.exp);
        player1.exp = 60;
        System.out.println(player1.exp);
        
        //private
        //tidak bisa
        //System.out.println(player1.health);
        
        //method
        
        //default
        player1.DisplayAll();
        
        //public
        player1.setHealth(15);
        player1.DisplayAll();
        
        //private
        //ndakbisa
        //player1.setExp(50);
    }
}