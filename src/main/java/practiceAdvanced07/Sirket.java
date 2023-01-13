package practiceAdvanced07;

public class Sirket {

        static int kasa;
        int depButcesi;
        int depKazandigiParaToplami;

      public void kasadanParaAl(int alinacakPara){
          depButcesi += alinacakPara;
          kasa -=alinacakPara;
          System.out.println("Kasadan "+ alinacakPara + "lira alindi");

      }
    public void paraKazan(int kazanilanPara){
          kasa+=kazanilanPara;
          depKazandigiParaToplami+=kazanilanPara;
    System.out.println((kazanilanPara+ "lira kazanildi"));
}
    public static void kasadanHarca (int harcananPara){
          kasa-=harcananPara;
        System.out.println("Kasadan " +harcananPara+ "  lira harcandi.");

    }
    public void departmanHarcamasi(int harcananPara){
          depButcesi-=harcananPara;
        System.out.println("Departman butcesinden " +harcananPara+ "  lira harcandi");

    }

    }

