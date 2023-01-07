package day21overloadingstatic;

public class C04_Static {
    public static void main(String[] args) {
        System.out.println(C03_StatikDepo.okulIsmi);

        C03_StatikDepo obj1 = new C03_StatikDepo();

        System.out.println(obj1.ogrenciGul);//Gul Gecer
        //obje olusturarak getirebiliriz yoksa alamayiz static degil cunku

        C03_StatikDepo.okulIsmi = "Mine Okullari";//baska class'taki ismi degistiriyoruz
        System.out.println("C03_StatikDepo.okulIsmi = " + C03_StatikDepo.okulIsmi);//Mine Okullari oldu

        C03_StatikDepo obj2 = new C03_StatikDepo();
        obj2.ogrenciGul = "Zeynep Karagol";
        System.out.println("obj2'den ogrenci " + obj2.ogrenciGul);//Zeynep Karagol
        System.out.println("obj1'den ogrenci " + obj1.ogrenciGul);//Gul Gecer

    }
}