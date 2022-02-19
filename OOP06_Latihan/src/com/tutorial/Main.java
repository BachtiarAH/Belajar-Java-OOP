package com.tutorial;

class player{
    String nama;
    double health;
    int level;

    //object 
    weapon senjata;
    armor Armor;

    //set propertyse
    player(String nama, double health, int level){
        this.nama = nama;
        this.health = health;
        this.level = level;
    }

    //equip weapon
    void equipWeapon(weapon senjata){
        this.senjata = senjata;
    }

    //equip armor
    void equipArmor(armor Armor){
        this.Armor = Armor;
    }

    //equip both Equipment

    void equipWeaponAndArmor(weapon senjata, armor Armor){
        this.senjata = senjata;
        this.Armor = Armor;
    }

    //display all property
    void Display(){
        System.out.println("nama   : "+nama);
        System.out.println("health : "+health);
        System.out.println("level  : "+level);
        System.out.println("Senjata : "+senjata.nama+" , "+senjata.attackDamage);
        System.out.println("Armor : "+Armor.nama+" , "+Armor.deffensePoint);
        System.out.println();
    }

    //serang musuh
    void Attack(player opponen){
        double power = this.senjata.attackDamage;
        System.out.println(this.nama +" attacked "+opponen.nama+" with power " +power);
    }

    //bertahan dari serangan
    void attack(player opponen){
        double deffense = opponen.Armor.deffensePoint;
        double power = this.senjata.attackDamage;
        double damage;

        if(deffense < power){
            damage = power - deffense;
        }else{
            damage = 0;
        }

        opponen.health -= damage;
        System.out.println(this.nama +" attacked "+opponen.nama+" with power " +power);
        System.out.println(this.nama +" take damage "+damage);
    }
}

class weapon{
    double attackDamage;
    String nama;

    //set propertyse
    weapon(String nama, double attackDamage){
        this.nama = nama;
        this.attackDamage = attackDamage;
    }
}


class armor{
    String nama;
    double deffensePoint;

    //set propertyse
    armor(String nama,double deffensePoint){
        this.nama = nama;
        this.deffensePoint = deffensePoint;
    }
}
public class Main {
    public static void main(String[] args) {
        //player
        player Pemain1 = new player("N Y M P H", 100, 10);
        player Pemain2 = new player("LEMON",100, 11);

        //equipment
        weapon pedangBesi = new weapon("Pedang Besi", 10);
        armor zirahBesi = new armor("Zirah Besi", 11);
        weapon busur = new weapon("busur", 15);
        armor zirahRantai = new armor("Zirah Rantai", 5);

        //equip Equipment into player
        Pemain1.equipWeaponAndArmor(pedangBesi, zirahBesi);
        Pemain2.equipWeaponAndArmor(busur, zirahRantai);

        //tampil stat sebelum pertarungan 
        Pemain1.Display();
        Pemain2.Display();

        //pertarungan
        System.out.println("\nPERTARUNGAN");
        Pemain1.attack(Pemain2);

        //tampil stat setelah Pertarungan
        Pemain1.Display();
        Pemain2.Display();
    }
}
