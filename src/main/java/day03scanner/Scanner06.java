package day03scanner;

import java.util.Scanner;

public class Scanner06 {
    public static void main(String[] args) {
        // kullanıcıdan aldığınız 5 basamaklı sayının
        // ilk iki ve son iki basamağındaki rakamları toplamını yazdıran kodu yazdırınız

        Scanner input = new Scanner(System.in);
        System.out.println("5 basamakli bir sayi giriniz...");//38671
        int number = input.nextInt();
        //bir sayının son rakamını almak için 10a bölün kalana bakın
        //bir tam sayıyı bir tamsayıya bölersek Java sonucu kesinlikle tamsayı yapar.
        //java sonucu nasıl tamsayı yapar?ondalık kısmı iptal eder.yuvarlama yapmaz.

        //son rakamı al

        int lastDigit = number%10;//1`i verir
        number = number/10;

        int lastSecondDigit = number%10;
        number = number/10;

        int lastThirdDigit = number%10;
        number = number/10;

        int lastFourthDigit = number%10;
        number = number/10;

        int lastFifthDigit = number%10;

        System.out.println(lastDigit+lastSecondDigit+lastFourthDigit+lastFifthDigit);






    }
}
