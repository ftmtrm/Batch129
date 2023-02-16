package practice11.Hastane;


public class Runner {
    private static Hastane hastane = new Hastane();
   public static void main(String[] args) {

        String hastaDurumu = "Kalp Spazmi";
        String unvan = doktorUnvan(hastaDurumu);
        String durum = hastaDurumlar(hastaDurumu);


        hastane.setDoktor(doktorBul(unvan));
     hastane.setHasta(hastaBul(durum));

        System.out.println("Doktor ismi: " + hastane.getDoktor().getIsim());
        System.out.println("Doktor soy isim: " + hastane.getDoktor().getSoyIsim());
        System.out.println("Doktor unvani: " + hastane.getDoktor().getUnvan());

        System.out.println("Hasta ismi: " + hastane.getHasta().getIsim());
        System.out.println("Hasta soy isim: " + hastane.getHasta().getSoyIsim());
        System.out.println("Hasta ID: " + hastane.getHasta().getHastaID());
        System.out.println("hasta durum:"+ hastane.getHasta().getHastaDurumu());
       System.out.println("Hastanin durumu acildir.");
        }

    public static String doktorUnvan(String actuelDurum) {

        if (actuelDurum.equals("Alerji")) {
            return hastane.unvanlar[0];

        } else if (actuelDurum.equals("Bas agrisi")) {
            return hastane.unvanlar[1];

        } else if (actuelDurum.equals("Diabet")) {
            return hastane.unvanlar[2];

        } else if (actuelDurum.equals("Kalp Spazmi")) {
            return hastane.unvanlar[3];
        }
        return "yanlis durum";

    }//method

    public static Doktor doktorBul(String unvan) {

        Doktor doktor = new Doktor();

        for (int i = 0; i < hastane.unvanlar.length; i++) {

            if (unvan.equals(hastane.unvanlar[i])) {
                doktor.setIsim(hastane.doctorIsimleri[i]);
                doktor.setSoyIsim(hastane.doctorSoyIsimleri[i]);
                doktor.setUnvan(unvan);
            }//if
        }//for i
        return doktor;
    }//method
    public static Hasta hastaBul(String durum) {
        Hasta hasta = new Hasta();
        boolean aciliyet = false;
        if (durum.contains("Kalp")) {
            aciliyet = true;

        }

        for (int i = 0; i < hastane.durumlar.length; i++) {
            if (durum.equalsIgnoreCase(hastane.durumlar[i])) {
                hasta.setIsim(hastane.hastaIsimleri[i]);
                hasta.setSoyIsim(hastane.hastaSoyIsimleri[i]);
                hasta.setHastaID(hastane.hastaIDleri[i]);
                hasta.setHastaDurumu(aciliyet);

            }
        }
        return hasta;
    }
    public static String hastaDurumlar(String durumlar) {

        if (durumlar.equals("Alerji")) {
            return hastane.durumlar[0];

        } else if (durumlar.equals("Bas agrisi")) {
            return hastane.durumlar[1];

        } else if (durumlar.equals("Diabet")) {
            return hastane.durumlar[2];

        } else if (durumlar.equals("Kalp Spazmi")) {
            return hastane.durumlar[3];
        }
        return "yanlis durum";

    }//method


}//class

