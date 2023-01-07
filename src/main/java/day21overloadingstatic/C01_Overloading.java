package day21overloadingstatic;

public class C01_Overloading {
    public static void main(String[] args) {

        toplama(3,5);
        toplama(3.6,5);
        toplama((float) 3.69,5);
        cikarma(40,10);
        cikarma(40,10,5);
        carpma(5,2.8);
        carpma(5.9,2);

    }//main

    // Overloading Yapma Yontemleri
    //1) Data typelarin yerini degistirerek Overloading

    private static void carpma(int a, double b) {
        System.out.println("Int ile Double carpma : "+(a*b));
    }

    private static void carpma(double a, int b) {
        System.out.println("Double ile Int carpma : "+(a*b));
    }

    //2) Parametrelerin sayisini degistirerek overloading
    private static void cikarma(int a, int b) {

        System.out.println("Iki Int ile cikarma : "+(a-b));
    }
    private static void cikarma(int a, int b,int c) {

        System.out.println("uc Int ile cikarma : "+(a-b-c));
    }

    // 3) parametrelerin DataType'larini degistirerek
    private static void toplama(int a, int b) {

        System.out.println("Iki int ile toplama : "+(a+b));
    }//method
    private static void toplama(double a, int b) {

        System.out.println("double ile int toplama : "+(a+b));
    }//method
    private static void toplama(float a, int b) {

        System.out.println("float ile int toplama : "+(a+b));
    }//method


}
