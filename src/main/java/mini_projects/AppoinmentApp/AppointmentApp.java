package mini_projects.AppoinmentApp;

import java.util.Scanner;

public class AppointmentApp {
    public static void main(String[] args) {

        start();
    }

//1-ana menü
//2-doctor, appointment classlarını oluştur
    public static void start() {
        Scanner inp=new Scanner(System.in);
        AppointmentService appservice=new AppointmentService();
        DoctorService drService=new DoctorService();
        System.out.println("Merhaba, randevu sistemine hoşgeldiniz...");
        int select;
        do {
            System.out.println("1-Randevu al");
            System.out.println("2-Randevu görüntüleme");
            System.out.println("0-Çıkış");
            System.out.println("Seçiminiz:");
            select=inp.nextInt();
            switch (select){
                case 1:
                    appservice.getAppointment(drService);
                    break;
                case 2:
                    appservice.printAppoinment();
                    break;
                case 0:
                    System.out.println("İyi günler dileriz...");
                    break;
                default:
                    System.out.println("Hatalı giriş!!!");
                    break;
            }
        }while(select!=0);
    }

}
