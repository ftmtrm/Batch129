package MyPractices.slaytlar01;

import java.util.Scanner;

public class WhileLoopSlaytlar02 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Carpim tablosunu gormek icin bir sayi giriniz ");
        double num =input.nextDouble();
        int i = 1;
        while (i <11) {
            System.out.println(num + "x" + i + "=" + (num * i));
            i++;
        }
        System.out.println();

        Scanner scan = new Scanner(System.in);
        System.out.println("Lutfen bir sayi giriniz ");
        int sayi = scan.nextInt();

        int k = 1;
        int counter = 0;
        while(k<sayi+1) {
        if (sayi % k == 0) {
            System.out.println(k+" ");
            counter++;
        }
            k++;

        }
        System.out.print(counter);
        System.out.println();

        Scanner scan1 = new Scanner(System.in);
        System.out.println("Lutfen bir sayi giriniz ");
        int number = scan1.nextInt();
        int sum = 0;
        while (number>0){
            sum=sum+number%10;
            number/=10;
        }
        System.out.println(sum);



        }

    }



