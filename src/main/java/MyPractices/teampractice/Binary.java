package MyPractices.teampractice;

import java.util.Scanner;

public class Binary {
           /*Kullanıcının gireceği iki binary sayıyı toplayan  Java kodunu yazınız.
        birinci binary number: 100010
        ikinci  binary number: 110010
         */
        static Scanner input = new Scanner(System.in);
        static int binaryTotal;
        static int idx = 0;

        public static void main(String[] args) {

            System.out.println("Please enter first binary number...: ");
            String binaryFirst = input.next();

            System.out.println("Please enter second binary number...: ");
            String binarySecond = input.next();

            int binaryFirstNew = Integer.parseInt(binaryFirst, 2);
            int binarySecondNew = Integer.parseInt(binarySecond, 2);

            binaryTotal = binaryFirstNew + binarySecondNew;

            int[] binary = new int[20];// Sayı limiti 20 karakter isteğe bağlı artırılabilir

            while (binaryTotal != 0) {
                binary[idx] = binaryTotal % 2;
                binaryTotal = binaryTotal / 2;
                idx++;
            }
            System.out.print("Binary Total:   "); //Döngüden etkilenmemesi için

            for (int j = idx ; j >= 0; j--) {       // Bölme işleminde  1-0 ları tersten yazdırmak için...
                System.out.print(" " + binary[j]);
            }
        }
}
