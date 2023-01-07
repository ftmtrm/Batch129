package day03scanner;

public class Runner {
    public static void main(String[] args) {
        //object nasıl oluşturulur?
        //hangi classın kullanılacağını javaya söylemek gerek
        //classın ismi (Car) yazılır sonra objeye isim verilir (myCar), atama operatörü koyulur.
        //new keywordu yazılır. bu keyword sıfırdan obje yaratır.insan yoktan varetmez, sadece dönüştürür
        //javadada iki tür yaratma var yoktan yaratma new ile olur.ikinci tür yaratma ise dönüştürmedir sonra ögrenilcek
        // son olarak constructor konur. constructor da Car () bölümüdür keki yapan kişi denebilir

        Carx myCar = new Carx();
        System.out.println(myCar.fiyat);
        System.out.println(myCar.model);


        myCar.hareket();
        myCar.dur();
        Student tomHanks = new Student ();
        System.out.println(tomHanks.name);
        System.out.println(tomHanks.grade);
        System.out.println(tomHanks.address);

        tomHanks.study();
        tomHanks.feed();


    }
}
