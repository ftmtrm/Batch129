package day16multidimentionalarrays;

import java.util.Arrays;

public class C01_MultiDimensionalArrays {
    public static void main(String[] args) {
        //Bir Arrayin icindeki data yine bir array ise buna multidimensional array denir
        //Multidimensional array nasil olusturulur? icice gecmis arrayler
        //ilk bracet katlari gosteriyor ikinci bracet ise herkatta kac eleman oldugunu gosterir


        int arr [] [] = new int [3][2];//outer array 3, inner array 2 demek bu yontemde inner arrayler sabit olmak zorundadir.
        System.out.println(Arrays.toString(arr));//icindeki data non-prpmitive oldugu icin adresleri gorurum
        System.out.println(Arrays.toString(arr[1]));//[0,0]
        System.out.println(Arrays.deepToString(arr)); // [0,0] [0,0] [0,0] arrayler bu sekilde yazdirilir

        //Arraylere eleman eklemenin 2.yontemi ile hem declare edip hem de deger atama yontemi
        int arr2 [][] = { {2,3} ,{9} ,{78,6,4,5} };
        System.out.println("Hem declare hem de deger atamasi ile "+Arrays.deepToString(arr2));
        //deepstring methodu ile mesela [2] yazilamiyor.o nedenle asagidaki gibi yazdiriliyor
        System.out.println(Arrays.toString(arr2[2]));// [78,6,4,5]
        System.out.println(Arrays.toString(arr2[0])); // [2,3]
        System.out.println(Arrays.toString(arr2[1]));//[9]

        //Multimensional arraye eleman nasil eklenir?
        arr [1][0]= 6;
        arr [0][0]= 3;
        arr [0][1]= -4;
        arr [1][1]= 18;
        arr [2][0]= -7;
        arr [2][1]= 0;
        System.out.println(Arrays.deepToString(arr));//[[3, -4], [6, 18], [-7, 0]]
        System.out.println(Arrays.toString(arr[1]));//[6,18]
        System.out.println(arr[1][0]);//6yi verir.

        //Ex: String bir multidimensional array olusturun icerisine datalari ekleyin
        //toplam eleman sayisini ekrana yazdirin
        String brr [][] = new String [3][2];
        brr [0][0] = "a";
        brr [0][1] = "b";
        brr [1][0] = "c";
        brr [1][1] = "d";
        brr [2][0] = "e";
        brr [2][1] = "f";
        System.out.println(Arrays.deepToString(brr));
        int sum = 0;
        for (String[] w : brr) {// w yerine each de kullaniliyor herbir elemani getir demek
            sum+= w.length;

        }
        System.out.println(sum);//6







    }
}
