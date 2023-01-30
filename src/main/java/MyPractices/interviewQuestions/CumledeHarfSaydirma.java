package MyPractices.interviewQuestions;

import java.util.Scanner;

public class CumledeHarfSaydirma {
    /*
         * Kullanicidan bir cumle ve bir harf alin,
         * Cumlede harfin kac kere
         * kullanildigini bulup, yazdirin
         */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Lutfen bir cumle giriniz");
        String str = input.nextLine().toLowerCase();
        System.out.println("Lutfen bir harf giriniz");
        char ch = input.next().toLowerCase().charAt(0);
        int counter = 0;

        for (int i = 0; i < str.length(); i++) {
            if(str.charAt(i)==(ch)){
                counter++;

            }
        }
        System.out.println(ch+" karakteri "+ str+ " String'inde "+counter+ " kez tekrarlanmistir.");
    }
}
