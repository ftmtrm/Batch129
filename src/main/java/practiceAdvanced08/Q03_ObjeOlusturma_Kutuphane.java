package practiceAdvanced08;

public class Q03_ObjeOlusturma_Kutuphane {
    //Kütüphaneye eklemek istediğiniz kitapları, adı, yazar adı, sayfa sayısı, seri numarası
    // ile yazdıran bir kod yazınız.
    public static void main(String[] args) {

        Kutuphane obj1 = new Kutuphane("Magaradakiler","Cemil Meric",285);
        //System.out.println(obj1.seriNumarasi);//MaCe1
        System.out.println(obj1);// tostringle yaparsak sadece obj1'i yazdiririz
        obj1.kitapBilgileri();
        Kutuphane obj2 = new Kutuphane("Kirlangic Cigligi","Ahmet Umit",400);
        obj2.sayfaSayisi=405;
//        System.out.println(obj2);
        obj2.kitapBilgileri();
    }
}