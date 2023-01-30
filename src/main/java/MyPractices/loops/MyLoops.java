package MyPractices.loops;

import java.util.Scanner;

public class MyLoops {
    public static void main(String[] args) {
        //Ex1:ekrana 10 kez "Java guzeldir" yazdirin.
        String str = "Java guzeldir";

        for (int i = 1; i < 11; i++) {
            System.out.println(str);

        }
        //Ex2: 10 ile 30 arasindaki sayilari aralarina virgul koyarak ayni satirda yazdirin.
        for (int i = 10; i <= 30; i++) {
            if (i < 30) {
                System.out.print(i + ",");
            }else

                System.out.println(i);
            }

        System.out.println();
//Ex3: 100'den 50'ye kadar olan sayilari aralarina virgul koyarak ayni satirda yazdirin.

        for (int i = 100; i >=50; i--) {
            if (i > 50) {
                System.out.print(i + ",");
            }else
                    System.out.println(i);
                }


        //Ex4: Kullanicidan 100'den kucuk bir tamsayi isteyin.
        // 1'den baslayarak girilen sayiya kadar 3'un kati olan sayilari yazdirin.

        Scanner input = new Scanner (System.in);
        System.out.println("Lutfen 100'den kucuk bir tamsayi giriniz");
        int num1= input.nextInt();
        num1=Math.abs(num1);
        for (int i = 1; i < num1+1 ; i++) {
            if(i%3==0){
                System.out.print(i+" ");
            }

        }
        System.out.println();
        //Ex5:Kullanicidan 100den kucuk bir tamsayi isteyin.
        // 1'den baslayarak girilen sayiya kadar 3'un veya 5'in kati olan sayilari yazdirin.
        Scanner scan = new Scanner (System.in);
        System.out.println("Lutfen 100'den kucuk bir tamsayi giriniz");
        int num2= input.nextInt();

        for (int i = 1; i < num2+1 ; i++) {
            if(i%3==0 && i%5==0){
                System.out.print(i+" ");
            }

        }



        }

    }





