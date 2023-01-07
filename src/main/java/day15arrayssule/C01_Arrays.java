package day15arrayssule;

import java.util.Arrays;
import java.util.Scanner;

public class C01_Arrays {
    public static void main(String[] args) {
        //Bir ogretmenin okulundaki ogrencilerin isimlerini applicationa yuklemesini saglayan kodu yaziniz.
        Scanner input = new Scanner(System.in);
        System.out.println("Kac ogrenci ismi gireceksiniz");
        int numofstd = input.nextInt();
        String names[] = new String[numofstd];
        System.out.println("Sonlandirmak istiyorsaniz lutfen Q harfine basiniz");
        for (int i = 1; i <= numofstd; i++) {
            System.out.println("Lutfen " + i + ". ogrencinin ismini giriniz");
            String stdName = input.next();
            if(stdName.equalsIgnoreCase("Q")){
                break;
            }
            names[i - 1] = stdName;
        }
        System.out.println(Arrays.toString(names));

    }
}