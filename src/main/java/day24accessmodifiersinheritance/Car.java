package day24accessmodifiersinheritance;

public class Car extends Vehicle {//baba

    public String renk;
    int km;

    public Car(){
    //javanin verdigi default silindigi icin bu bos constructori olusturuyoruz.

    }

    public Car(String renk, int km){
        super("Car");
    //benim bir ustumdeki classsin methodunu al demek
        this.renk = renk;
        this.km = km;
        System.out.println("Car Constructor");
    }

}
