package MyPractices;

import java.util.Scanner;

public class MyLoops06 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Lutfen 10'dan kucuk bir sayi giriniz");
        int num = scan.nextInt();
        int fak = 1;
        for (int i = 1; i <=num; i++) {
            fak = fak*i;
        }
        System.out.println(fak);
        System.out.println();

        Scanner input = new Scanner(System.in);
        System.out.println("Lutfen pozitif bir tamsayi giriniz");
        int number = input.nextInt();
        for (int i = 1; i <=number ; i++) {
            for (int j = 1; j <=i ; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
        Scanner input1 = new Scanner(System.in);
        System.out.println("Lutfen bir rakam giriniz");
        int number1 = input.nextInt();
        for(int i=1; i<=number1; i++){
            for (int j = 1; j <=number1 ; j++) {
                System.out.print("(" + i + "," + j + ")");


            }
            System.out.println();
        }
    }
}
