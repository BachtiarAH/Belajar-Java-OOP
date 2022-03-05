package com.tutorial;

class buku{
    public static final String Display = null;
    String judul;
    String penulis;

    buku (String judul, String penulis){
        this.judul = judul;
        this.penulis = penulis;
    }

    void Display(){
        System.out.println("Judul\t: "+this.judul);
        System.out.println("Penulis\t: "+this.penulis);
    }


}

class Main{
    public static void main(String[] args) {
        buku buku1 = new buku("Hyouka","Yonezawa Honobu");

        buku1.Display();
    }    
}