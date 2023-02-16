package mini_projects.loginpageApp;

import java.util.Scanner;

public class LoginPageApplication {
    public static void main(String[] args) {

        start();
    }
    public static void start(){
        Scanner inp=new Scanner(System.in);
        UserService service=new UserService();
//1-kullanıcıya işlem menüsü gösterelim.
        int select;
        do {
            System.out.println("=== TECHPROEDUCATION ===");
            System.out.println("1-üye ol");
            System.out.println("2-giriş yap");
            System.out.println("0-ÇIKIŞ");
            select= inp.nextInt();
            switch (select){
                case 1:
                    //register
                    service.register();
                    System.out.println(service.userList);
                    break;
                case 2:
                    //login
                    service.login();
                    break;
                case 0:
                    System.out.println("İyi günler dileriz...");
                    break;
                default:
                    System.out.println("Hatalı giriş yaptınız, tekrar deneyiniz!");
                    break;
            }
        }while (select!=0);
//2-tüm userların ortak özellikleri olacak, user classı oluşturalım.
    }
}