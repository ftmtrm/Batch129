package day07ifStatement;

import java.util.Scanner;

public class C04_IfStatement {
    //Ex: kullanicidan yas degerini alan ve yasin hangi evrede oldugunu asagidaki tabloya gore yazdiran kodu olusturunuz.
    // 0-4 ==> bebek
    //5-12 ==> cocuk
    //13-20==> genc
    //21-30==> yetiskin
    //digeri ==> tanimlanmamis evre
    //hata mesaji olarak "gecerli bir yas giriniz" yazdiriniz
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Lutfen yasinizi giriniz");
        int yas = input.nextInt();
        if (yas < 0) {
            System.out.println("Lutfen gecerli bir yas giriniz");
        } else if (yas < 5) {
            System.out.println("bebek");
        } else if (yas < 13) {
            System.out.println("cocuk");
        } else if (yas < 21) {
            System.out.println("genc");
        } else if (yas < 31) {
            System.out.println("yetiskin");
        } else {
            System.out.println("tanimlanmamis evre");
        }
    }

}
