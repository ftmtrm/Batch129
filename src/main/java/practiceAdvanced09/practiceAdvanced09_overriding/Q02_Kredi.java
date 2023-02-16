package practiceAdvanced09.practiceAdvanced09_overriding;

public class Q02_Kredi {
    //Bir bankadan kredi alan müşterileri kredi türlerine göre objeler oluşturarak kaydeden bir kod yazınız.
     //Emekli: %12 standart faiz, İşçi: %15 , Memur: %10

    public static void main(String[] args) {

        Emekli emekliHasanAmca = new Emekli();
        System.out.println(emekliHasanAmca.faizHesapla(100));

        Memur memur1 =new Memur();
        System.out.println(memur1.faizHesapla(200));

        Isci isci1 = new Isci();
        System.out.println(isci1.faizHesapla(125));
    }
}
