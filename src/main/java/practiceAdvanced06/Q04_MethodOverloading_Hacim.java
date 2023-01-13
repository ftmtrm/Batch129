package practiceAdvanced06;

public class Q04_MethodOverloading_Hacim {
    //Küp, kare prizma ve dikdörtgen prizmanın hacmini hesaplayan bir kod yaziniz.
    // (Method overloading kullanınız)
//Method overloading ayni isimdeki methodlari farkli parametrelerle olusturmaktir.

    public static void main(String[] args) {

        Hacim obje = new Hacim();
        int kupunHacmi = obje.hacimHesapla(5);
        System.out.println("Kupun hacmi=" + kupunHacmi);

        int karePrizmaHacmi = obje.hacimHesapla(5,4);
        System.out.println("karePrizmaHacmi = " + karePrizmaHacmi);

        int dikdortgenPrizmaHacmi = obje.hacimHesapla(2,3,4);
        System.out.println("dikdortgenPrizmaHacmi = " + dikdortgenPrizmaHacmi);
    }
}
