package day02datatypesmethodcreation;

public class MethodCreation01 {
    public static void main(String[] args) {

        int sonuc = add(3,5);
        System.out.println(sonuc);
        long carpmaSonucu= multiply(3,6);
        System.out.println(carpmaSonucu);
        int ucluSonuc= firstTwoMultiplyThirdAdd(2,5,8);
        System.out.println(ucluSonuc);

        double kup= getCube(5);
        System.out.println(kup);
    }

    public static int add(int a, int b) {

        return a+b;
    }
    protected static long multiply (int a, int b){

        return a*b;
    }
    private static int firstTwoMultiplyThirdAdd (int a, int b, int c) {

        return a*b+c;
    }
    static double getCube (double a){
        return a*a*a;


    }


}
