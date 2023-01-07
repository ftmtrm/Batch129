package practiceAdvanced01;

import java.util.Scanner;

public class Q02_Variable_Hipotenus {
    public static void main(String[] args) {
        //hipotenus hesaplayan kodu yaziniz
        Scanner input = new Scanner(System.in);
        System.out.println("Birinci dik kenar uzunlugunu giriniz");
        int a = input.nextInt();
        System.out.println("ikinci dik kenar uzunlugunu giriniz");
        int b = input.nextInt();
        double hipotenus = Math.sqrt(a*a+b*b);//karakoku alcaz//hipotenusu yani c yi bulcaz
        System.out.println("Hipotenus = " + hipotenus);




    }
}
