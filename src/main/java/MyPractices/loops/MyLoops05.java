package MyPractices.loops;

import java.util.Scanner;

public class MyLoops05 {
    public static void main(String[] args) {
       /* Scanner scan = new Scanner (System.in);
        System.out.println("Lutfen bir sehir ismi giriniz");
        String s = scan.nextLine();
        int k = s.lenght()-1;
        String t = s.substring(k, s.charAt(0));
            System.out.print(t); */
        Scanner scan = new Scanner(System.in);
        System.out.println("Lutfen bir isim giriniz");
        String duz = scan.nextLine();
        String ters = "";
        for (int i = duz.length() - 1; i >= 0; i--) {
            ters += duz.charAt(i);
        }
        if (duz.equals(ters)) {
            System.out.print(duz + " Palindrome'dur");
        } else {
            System.out.println(duz + " Palindrome degildir");

        }
        Scanner scan1 = new Scanner(System.in);
        System.out.println("Lutfen birinci sayiyi giriniz");
        int firstnum = scan1.nextInt();
        System.out.println("Lutfen ikinci sayiyi giriniz");
        int secondnum = scan1.nextInt();
        int sum = 0;
        for (int i = firstnum; i <=secondnum ; i++) {
            sum=sum+i;


        }System.out.println(sum);
    }
}
