package practice02;

import java.util.Scanner;

public class C01_NestedLoop {
    public static void main(String[] args) {



    /*Asagidaki sekli cizdiren kodu yaziniz.govde sabit sayi 5 olsun
    ^
    ^^
    ^^^
    ^^^^
    ^^^^^
    | | |
    | | |
    | | |
    | | |
    | | |
     */
    Scanner input = new Scanner(System.in);
        System.out.println("Lutfen agacin tac uzunlugunu giriniz");
        int tac = input.nextInt();

        String yaprak = "";
        for (int i = 0; i <tac ; i++) {
            yaprak+="^";
            System.out.println(yaprak);
        }
        for (int i=0; i<5;i++ ){
            System.out.println("|||");
        }

    }
    }


