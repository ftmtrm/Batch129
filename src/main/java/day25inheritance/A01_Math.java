package day25inheritance;

public class A01_Math extends A04_Lessons {

   /*3*/ public A01_Math(){
       /*4*/super("str");//babaya gitcek
       /*11*/  System.out.println("Math Constructor");
       /*12*/ }
    /*1*/ public A01_Math(int a){
    /*2*/this();
        //bu classi kullan demek ayni classin icinde diger const.i calistirmak icin kullanilir.
        /*13*/ System.out.println("Parametreli Math Constructor");

    }

}
