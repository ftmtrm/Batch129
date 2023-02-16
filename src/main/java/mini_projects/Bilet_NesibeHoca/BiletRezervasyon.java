package mini_projects.Bilet_NesibeHoca;

import java.util.Scanner;

public class BiletRezervasyon {
    public static void main(String[] args) {
        //1.bilet rezervasyonu icin otobus objesi olusturalim
        Bus bus = new Bus("34 ASD 78");//"1","2","3"....
        //4. bilet objesi olusturalim
        Bilet bilet = new Bilet();
        start(bus,bilet);
    }
    public static void start(Bus bus, Bilet bilet) {
        Scanner scan = new Scanner(System.in);
        int select;
        do {
            //6.kullanicidan bilgileri alalim
            System.out.println("Bilet rezervasyon sistemine hosgeldiniz...");
            System.out.println("Lutfen gidilecek mesafe bilgisini km olarak giriniz: ");
            double distance = scan.nextDouble();
            System.out.println("Lutfen yolculuk tipini seciniz: ");
            System.out.println("1.Tek yon");
            System.out.println("2.Gidis-Donus");
            int type = scan.nextInt();
            System.out.println("Lutfen yasinizi giriniz");
            int age = scan.nextInt();
            System.out.println("Koltuk no seciniz");
            System.out.println("Tekli koltuk ucreti %20 daha fazladir");
            System.out.println(bus.seats);
            int seat = scan.nextInt();
            boolean isReserved=!bus.seats.contains(String.valueOf(seat));
            if (isReserved){
                System.out.println("Lütfen listede aktif olan koltuk no giriniz..");
                select=0;
            }else {
                //7. secilen koltuk noyu listeden kaldirmamiz gerekiyor.
                bus.seats.remove(String.valueOf(seat));//o nedenle listi string olusturduk
                //8.kullanicidan alinan degerler gecerli mi? kontrol edilmeli
            }
            boolean check = type == 1 || type == 2;
            if (distance > 0 && age > 0 && check && !isReserved) {
                //9.bilet fiyatini hesaplayalim
                bilet.distance=distance;
                bilet.typeNo= type;
                bilet.seatNo=seat;
                bilet.price = getTotal(bilet,age);
                bilet.printTicket(bus);
            } else {
                System.out.println("Hatali giris yaptiniz!!");
            }
            System.out.println("Yeni islem icin hrhangi bir sayi giriniz, cikis icin 0 giriniz");
            select = scan.nextInt();

        } while (select != 0);
        System.out.println("iyi gunler dileriz");

    }
    private static double getTotal(Bilet bilet, int age) {
        double dist = bilet.distance;
        int type = bilet.typeNo;
        int seatNo = bilet.seatNo;
        double total = 0;
        switch (type) {
            case 1:
                if (seatNo % 3 == 0) {
                    total = dist * 1.2;
                } else {
                    total = dist * 1;
                }
                System.out.println("Tutar=" + total);
                break;
            case 2:
                if (seatNo % 3 == 0) {
                    total = dist * 2.4;
                } else {
                    total = dist * 2;
                }
                System.out.println("Tutar=" + total);
                total = total * 0.8;
                System.out.println("Gidis donus indirimli tutar" + total);
                break;
}
            if(age<=12) {
                total = total / 2;
                System.out.println("Yas indirimli tutar: "+total);
            }else if (age>12 && age<24) {
                total = total * 0.9;
                System.out.println("Yas indirimli tutar: "+total);
            }else if(age>65){
                total = total*0.7;
                System.out.println("Yas indirimli tutar: "+total);
        }
        return total;
    }
}