package day26overriding;

public class AnimalRunner {
    public static void main(String[] args) {
        Cat myCat = new Cat();
        myCat.eat();//Animals eat yazdirdi biz "cat eats" yapmak istiyoruz.override yaptik bu nedenle
        myCat.drink();//Animals drink yazdirmasin diye override yapip "cats drink"e cevirdik
    }
}
