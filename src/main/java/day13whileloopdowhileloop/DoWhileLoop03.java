package day13whileloopdowhileloop;

import java.util.Scanner;

public class DoWhileLoop03 {
    public static void main(String[] args) {
        /*
        Username = "admin" ve Password="pwd123"dur
        kullanicidan username ve password'u alin
        username veya password dogru ise "hesabiniza hosgeldiniz" msji versin
        username veya password yanlissa 4 kere "username ve passwordunuzu giriniz"msji versin
        username ve password 4.kez yanlis girilirse hesabiniz bloke olmustur msji vererek islemi tamamlayiniz
         */

        Scanner input = new Scanner(System.in);
        int counter = 0;
        do{
            if(counter==4){
                System.out.println("Hesabiniz bloke olmustur!");
                break;
            }
            System.out.println("Username'i giriniz...");
            String username = input.next();
            System.out.println("password'u giriniz...");
            String password = input.next();

            if(username.equals("admin") && password.equals("pwd123")){
                System.out.println("Hesabiniza hosgeldiniz");
                break;
            }
            counter++;
        }while(true);//sonsuz loop olusturmus oluyoruz loop'u icerde sonra break'le kiriyoruz.
        // kendimiz kirmis oluyoruz yani ondan while'a loop'u kirdirmaya gerek yoktur.

    }
}
