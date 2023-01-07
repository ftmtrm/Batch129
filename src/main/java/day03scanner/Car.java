package day03scanner;

public class Car {
    public String model = "Corolla";       //pasif ozellikler variables
    public int fiyat= 200000;

    public static void main(String[] args) {

     //class ismini yazın, objeye isim verin, = koyun, new kullanın, class ismini () ile kullanın
     Car      myCorolla   = new Car ();
        System.out.println(myCorolla.fiyat);
        System.out.println(myCorolla.model);
        myCorolla.hareket();
        myCorolla.dur();

    }//mainin suslu parantezi

    public void hareket ()
    { //aktif ozellikler methodlar
        System.out.println("Toyota hizli hareket eder....");

    }
    public void dur () { //aktif ozellikler methodlar
        System.out.println("Toyota guvenle durur....");


    }

}//classın suslu parantezi
