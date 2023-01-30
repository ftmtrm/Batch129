package day19listsvarargs_suleyman;

public class Varargs01 {
    /*
    Varargs'lar method olustururken parametre sayisi konusunda bize esneklik verir.
    Method cagirirken kullanilan sayilara "arguments" denir. 4,5,6,7,8,9
    int a int b'ye ise "parametre" denir.
    Note: Bir method icinde birden fazla "varargs parametre" kullanirsaniz
    ikincisi "unused code" ya da "unreachable code" olur. o nedenle kullanilamaz
   Note: siradan bir parametre ile varargs parametre birlikte ayni method icinde kullanilabilir.
   Ancak vararags her zaman son parametre olmalidir.
     */

    public static void main(String[] args) {
        addTwoNumbers(3, 5);
        addThreeNumbers(4, 7, 2);
        add(4, 5, 6, 7, 8, 9);
    }

    //Iki sayiyi toplayan method olusturunuz.
    public static void addTwoNumbers(int a, int b) {
        System.out.println(a + b);
    }

    //Uc sayiyi toplayan method olusturunuz.
    public static void addThreeNumbers(int a, int b, int c) {
        System.out.println(a + b + c);
    }

    //Istediginiz sayida sayiyi toplamak icin bir method olusturunuz.
    //varargs arkada array gibi calisir.ama array ya da list degil farkli bir yapidir.
    public static void add(int... a) {//3 nokta data type'in sonrasina ya da ismin onune konulabilir.
        int sum = 0;
        for (int w : a) {
            sum += w;
        }
        System.out.println(sum);

    }
}

