package practiceAdvanced10;

import java.util.Scanner;

public class Q03_Exception_NotOrtalama {
    /* vize ve final notlarini kullanicidan alarak ortalama hesaplayan bir kod giriniz.
    Eğer  vize 100 den büyük, veya final 100'den büyük, veya vize 0'dan küçük, veya final 0'dan küçük ise,
    Sistem ArithmeticException hatası versin ve "Notlar 0-100 arasında olmalı" mesajını döndürsün.
    Diğer durumlarda ise, vizenin yüzde 40 ını, finalin yüzde 60 ını alsın ve toplasın.ortalama 70'in uzerinde ise
    basarili, altinda ise basarisiz yazdirsin*/

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int vizeNotu;
        int finalNotu;

        while (true) {
            try {
                System.out.println("Vize notunu giriniz");
                vizeNotu = scanner.nextInt();
                if (vizeNotu < 0 || vizeNotu > 100) {
                    throw new ArithmeticException();//CUSTOM EXCEPTION
                } else {
                    break;
                }
            } catch (ArithmeticException e) {
                System.out.println("Not 0 ile 100 arasinda olmalidir");
            }
        }
        while (true) {
            try {
                System.out.println("Final notunu giriniz");
                finalNotu = scanner.nextInt();
                if (finalNotu < 0 || finalNotu > 100) {
                    throw new ArithmeticException();//CUSTOM EXCEPTION
                } else {
                    break;
                }
            } catch (ArithmeticException e) {
                System.out.println("Not 0 ile 100 arasinda olmalidir");
            } catch (Exception e) {
                System.out.println("Gecersiz bir giris yaptiniz");
                scanner.next();//dummy scanner
            }
        }
                double ortalama = vizeNotu * 0.4 + finalNotu * 0.6;

                if (ortalama >= 70) {
                    System.out.println(ortalama + ": Basarili");
                } else {
                    System.out.println(ortalama + ": Basarisiz");
                }

            }
        }

