package day28exceptions;

public class C05_Exceptions {

    //5) ArithmeticExceptions:

    public static void main(String[] args) {
        //divide (6,2);//3
        divide (6,0);//ArithmeticExceptions
        divide2(12,0);//ArithmeticExceptions

    }
    public static void divide2(int a, int b) {
        try {
            System.out.println(a/b);
            System.out.println("Try kismi calisti");
        } catch (ArithmeticException yunus) {
          yunus.printStackTrace();
            System.out.println("Bir sayi sifira bolunemez==>"+ yunus.getMessage());
            System.err.println("Bolmede hata olustu");//serr
        }

    }
//////////////////********************

    public static void divide(int a, int b) {
        if(b==0){
            System.out.println("Bir sayi sifir ile bolunemz");//boyle de olur ama tercih edilmez.try catch yapilmali.
        }else
        System.out.println(a/b);
    }

}
