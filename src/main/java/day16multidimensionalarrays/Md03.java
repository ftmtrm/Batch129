package day16multidimensionalarrays;

public class Md03 {
    public static void main(String[] args) {
        //Bir MD Arraydeki en buyuk ve en kucuk sayinin toplamini ekrana yazdiriniz
        int a[][] = {{21, 5}, {14, 70, 11}};
        int small = a[0][0];
        int big = a[0][0];
        for (int[] w : a) {
            for (int k : w) {
                small = Math.min(small, k);
                big = Math.max(big, k);
            }
        }
        System.out.println("Toplam: " + (small+big));
    }
}
