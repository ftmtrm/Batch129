package day08nestedifandternary;

import java.util.Scanner;

public class NestedIf03 {
    public static void main(String[] args) {
        //Passwordun ilk harfi buyuk harf ise 'A' oldugunda gecerli password yazdirin
        // degilse gecersiz password yazdirin
        //Passwordun ilk harfi kucuk harf ise 'z' olursa gecerli password yazdirin
        // degilse gecersiz password yazdirin
        Scanner input = new Scanner(System.in);
        System.out.println("Passwordunuzu giriniz...");
        String pwd = input.nextLine();
        //char firstChar = pwd.charAt(0);//asagidaki pwd.charAt(0) yerine artik sadece firstChar yazabiliriz

        if (pwd.charAt(0) >= 'A' && pwd.charAt(0) <= 'Z') {
            if (pwd.charAt(0) == 'A') {
                System.out.println("Gecerli Password");
            } else {
                System.out.println("Gecersiz Password cunku buyuk harf ama 'A' degil");
            }
        } else if (pwd.charAt(0) >= 'a' && pwd.charAt(0) <= 'z') {
            if (pwd.charAt(0) == 'z') {
                System.out.println("gecerli password");
            } else {
                System.out.println("gecerli password cunku kucuk harf ama 'z' degil");
            }
        } else {
            System.out.println("Ilk karakter harf olmali");
        }
    }
}
