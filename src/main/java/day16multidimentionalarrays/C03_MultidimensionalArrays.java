package day16multidimentionalarrays;

public class C03_MultidimensionalArrays {
    public static void main(String[] args) {
        //Asagidaki multidimensional arrayin tum elemanlarinin carpimini ekrana yazdiran bir method yaziniz.
        int arr [][] = { {1,2,3},{4,5,6}};
        carpimYazdir(arr);
    }

    private static void carpimYazdir(int[][] arr) {
        int carpim = 1;

        for (int i = 0; i < arr.length ; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                carpim*=arr[i][j];
            }


        }
        System.out.println(carpim);//720

    }//carpimyazdir methodunun curly braces'i


}
