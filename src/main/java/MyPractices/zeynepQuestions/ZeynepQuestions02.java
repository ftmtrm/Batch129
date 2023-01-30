package MyPractices.zeynepQuestions;

import java.util.Scanner;

public class ZeynepQuestions02 {
    public static void main(String[] args) {
        	/* Kullanicidan email girmesini isteyin
       @ isareti icermiyorsa "gecerli bir email girin" yazdirin
       @ isaretinden sonra sadece "gmail.com" yaziyorsa "email onaylandi" yazdirin
       @ isaretinden sonra "gmail.com" disinda birsey yaziyorsa "Lutfen gmail hesabinizi girin" yazdirin
       */

        Scanner input = new Scanner(System.in);
        System.out.println("Lutfen e-mail adresinizi giriniz");
        String eMail = input.next();
        boolean iceriyor = eMail.contains("@");
        int idx = eMail.indexOf("@");

        if (!iceriyor) {
            System.out.println("Gecerli bir e-mail adresi giriniz");
        }else if(eMail.substring(idx+1).equals("gmail.com")) {
            System.out.println("E-mail onaylandi");
        }else
            System.out.println("Lutfen gmail hesabinizi giriniz");

        }
    }

