package practiceAdvanced02;

import java.util.Scanner;

public class Q02_If_Diskriminant {
    /* katsayilari verilen ikinci dereceden 1 bilinmeyenli denklemin koklerini bulunuz
    ax^2+bx+c;
    cozum adimlari
    kullanicidan a,b,c yi alin
    diskriminant formulu: -b + /-karakok(delta)) / (2a)
    Delta = b^2-4ac
    Delta > 0==>2 tane kok vardir. x1= (-b+kok(d)) / (2*a), x2 = (-b-kok(d) / (2*a)
    Delta = 0==>1 tane kok vardir. x = -b / (2*a)
    Delta < 0==> kok yoktur.
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Denklemin a,b,c katsayilarini sirasiyla giriniz");

        double a = input.nextDouble();
        double b = input.nextDouble();
        double c = input.nextDouble();

        double delta = b*b-4*a*c;
        if(delta>0){
            double x1 = (-b + Math.sqrt(delta))/(2*a);
            double x2 = (-b - Math.sqrt(delta))/(2*a);
            System.out.println("Denklemin iki koku vardir: x1="+x1+", x2=" +x2 );

        }else if (delta==0){
            double x = -b/(2*a);
            System.out.println("Denklemin 1 koku vardir: x="+x);

        }else
            System.out.println("Denklemin koku yoktur");

    }
}
