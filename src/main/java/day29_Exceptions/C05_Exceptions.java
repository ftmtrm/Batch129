package day29_Exceptions;

import java.util.Scanner;

public class C05_Exceptions {
    //9) IllegalArgumentException: Kuraldisi sayi vs. hatasi
    // yasi ekrana yazdiran bir kod yaziniz.

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int yas = input.nextInt();
        System.out.println(yas);
        if(yas<0){
            throw new IllegalArgumentException("Yas negatif olamaz");
            //application durdurduk.negatif yasla devam edersek farkli sonuclara yol acabilir.
            //belli sartlar altinda siz kendiniz exception atabilirsiniz.
            //ornek:okul application'inda ogrenci notu girme bolumu var not 0 ile 100 arasinda olmalidir.
            //eger bunun disinda sayi girilirse apllication'i throw ile durdurmak gerekir.'
            //getMessage burda yok.bizim verdigimiz msji yazdi catch'in icine e.getMessage() yazinca
        }else
            System.out.println("throw hersey yolunda: "+yas);

    }
}
