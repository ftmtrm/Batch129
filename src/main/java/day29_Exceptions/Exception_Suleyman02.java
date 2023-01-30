package day29_Exceptions;

public class Exception_Suleyman02 {
    public static void main(String[] args) {//throws IlllegalArgumentException seklinde yazarsak bu sekilde applocation'
        //durdururuz.

        try {
            printAge(-18);
        }catch(IllegalArgumentException e){
            System.out.println(e.getMessage());
        }
        try {
            getMark(-90);
        }catch(IllegalArgumentException e){
            System.out.println(e.getMessage());
        }

    }
    //"throw" keyword bir method'un body'si icinde istedigimiz yerde, istedigimiz kosullar, istedigimiz kadar icin Exception atmamizi saglar.
    //"throw" keyword yazildiktan sonra bir Exception Class object'i olusturulur.
    //Exception Class constructor'inin parantezi icine istediginiz Exception Mesaj'ini yazabilirsiniz
    public static void printAge(int age){
        if(age<0) {
            throw new IllegalArgumentException("Age cannot be negative");
        }else{
            System.out.println(age);
        }
    }

    //Ogrenci notlari girisi yapan ve notu console'a yazdiran bir method olusturunuz
    public static void getMark(double d){

        if(d<0){
            throw new IllegalArgumentException("Marks cannot be less than zero");
        }else if(d>100){
            throw new IllegalArgumentException("Marks cannot be greater than hundred");
        }else {
            System.out.println(d);
        }

    }

}
