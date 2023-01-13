package day22staticblocksconstructors;

public class Car {//default constructor var burda gorunmuyor.
    /*
    Constructor nedir? Class'tan obje uretmemize yarayan code block'laridir.
    Class olusturdugumuzda Java bize otomatik olarak bir constructor verir.
    Ama bu constructor gozle gorulmez.
    gozle gorulmeyen otomatik olarak Java tarafindan verilen bu constructor'lara default constructor denir.
    "default constructor"lar "Car(){ } seklindedir.class ismi+()+{ }
    !!! siz kendi constructor'inizi olusturdugunuzda Java default constructor'i siler.
    Bir class'ta farkli parametreler kullanarak istediginiz kadar constructor olusturabilirsiniz.
    Farkli constructor'lar sayesinde bir class'tan farkli farkli objeler olusturabiliriz.
    Interview sorusu : Method ile constructor'in farki varmidir?
    varsa nedir?
    Cevap: Method ile constructor farkli yapilardir.
    1) methodlarda return type vardir, constructorlarda yoktur.
    2) methodlarin ismi yaptiklari ise gore developer'lar tarafindan belirlenir.
    constructor'larin ismi ise herzaman class ismi ile ayni olmalidir

     */

    String make = "Honda";
    String model = "Accord";
    int year = 2023;
    boolean hybrid = true;

    public Car(String make, String model, int year, boolean hybrid){
        this.make = make; //bu class'taki markayi benim yaptigim marka yap demek
        this.model = model;
        this.year = year;
        this.hybrid = hybrid;
    }
    public Car(String make, String model){
        this.make = make;
        this.model = model;
        if(year==2023){
            this.year=0;
        }
        if (hybrid ==true){
            this.hybrid = false;
        }

        }

    public Car(String make, int year) {
        this.make = make;
        this.year = year;
    }

    @Override
    public String toString() {
        return "Car{" +
                "make='" + make + '\'' +
                ", model='" + model + '\'' +
                ", year=" + year +
                ", hybrid=" + hybrid +
                '}';
    }
}






