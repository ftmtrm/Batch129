package day16multidimentionalarrays;

public class C04_MultidimensionalArrays {
    public static void main(String[] args) {
        //Bir multidimensional arraydeki en buyuk ve en kucuk elemanin toplamini veren kodu yaziniz
        int arr[][] = {{2, 5, 1}, {83, 75}};
        int maxElement =arr[0][0];
        int minElement = arr [0][0];
        for (int[] w : arr) {
            for (int k : w) {
                maxElement= Math.max(maxElement,k);
                minElement = Math.min(minElement,k);
            }
        }
        System.out.println("MaxElement = " + maxElement);
        System.out.println("MinElement = " + minElement);
        System.out.println("Toplam: "+(maxElement+minElement));

    }

}
