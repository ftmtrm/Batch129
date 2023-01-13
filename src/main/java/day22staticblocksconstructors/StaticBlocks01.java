package day22staticblocksconstructors;

public class StaticBlocks01 {
    //Bir variable olusturdugunuzda deger atamazsaniz o varible'i "initialize" etmediniz demektir.
    //static block static varible'larin main method olusturulmadan calismadan once hazir olmasini saglar.
    //static variabla'lar static block'lar icinde initialize edilirse herseyden once hazir hale getirilmis olur.
    //Bazen main method calistirilmadan once variable'larin hazir hale getirilmesi gerekir.
    // bu yuzden static block'lar kullanilir.
    //Note 1 : Static blocklar static variable'lari initialize etmek icin kullanilir.
    //Note 2 : Static blocklar class icinde "herseyden once" calistirilirlar.
    static double pi;
    static String shape;

    static{
        pi = 3.14;
        System.out.println("Static block 1");//terminalde mainden once calistigi gorulur.static block 2'den de once calisir.
        //static method'larin calismada onceligi vardir.mainden de once calisir mainin altta ya da ustte olmasi farketmez.
    }
    static{
        shape="circle";
        System.out.println("Static block 2");
    }
    public static void main(String[] args) {
        System.out.println("main method");

    }




}
