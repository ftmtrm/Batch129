package day25inheritance_SuleymanHoca;
public class Car extends Vehicle {//baba

    public int price = 11000;
    public void engine() {
        System.out.println("Car engine");
    }

    public Car(){

        System.out.println("Car 1");
    }
    public Car(String make){


        System.out.println("Car 2 :"+ make);

    }
}

