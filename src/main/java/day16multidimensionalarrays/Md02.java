package day16multidimensionalarrays;

public class Md02 {
    public static void main(String[] args) {
        //bir md arraydeki tum elemanlarin carpimini konsola yazdiran kodu yaziniz.
        int a[][]= {{2,5}, {4,7,11}};
        int carpim = 1;
        for (int[] w : a) {
            for (int k : w) {
                carpim*=k;
            }
        }
        System.out.println(carpim);
    }
}
