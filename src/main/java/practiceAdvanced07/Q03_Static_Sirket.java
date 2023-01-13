package practiceAdvanced07;

public class Q03_Static_Sirket {

    //Basit bir sirket butcesi kodu yaziniz.

    public static void main(String[] args) {
        Sirket dep1 = new Sirket();
        System.out.println("dep1.depButcesi=" + dep1.depButcesi);
        dep1.kasadanParaAl(500);
        System.out.println(Sirket.kasa);
        dep1.paraKazan(2000);
        Sirket.kasadanHarca(1000);
        //dep1.kasadanHarca kabul eder ama yapilmamali
        System.out.println("Sirket.kasa= "+ Sirket.kasa);
        System.out.println("dep1.depKazandigiParaToplami = " + dep1.depKazandigiParaToplami);

        Sirket dep2 = new Sirket();
        dep2.kasadanParaAl(500);
        dep2.departmanHarcamasi(250);
        dep1.departmanHarcamasi(100);//
        System.out.println(Sirket.kasa);
        System.out.println("dep2 butcesi = " + dep2.depButcesi);//250
        System.out.println("dep1 butcesi = " + dep1.depButcesi);//dep1=400e duscek
       //dep1 ve dep2 nonstatic oldugu icin birbirini etkilemez.
        //dep1'den para harcasak dep2 butce etkilenmez.
        dep2.paraKazan(5000);
        System.out.println(dep1.kasa);//boyle kullanma diye uyariyo
        System.out.println(dep2.kasa);//boyle kullanma diye uyariyo

    }

}
