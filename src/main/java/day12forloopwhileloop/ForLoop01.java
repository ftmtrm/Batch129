package day12forloopwhileloop;

import java.util.Scanner;

public class ForLoop01 {
    public static void main(String[] args) {
        /* Ex1: Asagidaki sekli konsola yazdiracak kodu olusturunuz.
    1)X X X X X
    2)X X X X X
    3)X X X X X
     */
        Scanner input = new Scanner(System.in);
        System.out.println("Lutfen satir sayisini giriniz");
        int row = input.nextInt();
        System.out.println("Lutfen sutun sayisini giriniz");
        int column = input.nextInt();

        for (int i = 1; i <= row; i++) {//satirlari sayiyoruz 1den basliyor o yuzden

            for (int j = 1; j <= column; j++) {
                System.out.print("X ");

            }
            System.out.println();
        }

    }
}
