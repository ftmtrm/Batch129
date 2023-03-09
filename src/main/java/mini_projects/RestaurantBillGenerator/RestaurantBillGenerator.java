package mini_projects.RestaurantBillGenerator;

import java.util.Scanner;

public class RestaurantBillGenerator {
    public static void main(String[] args) {
getSelectionMenu();
    }
    //1-islem secimi icin menu gosterelim
    public static void getSelectionMenu(){
        Scanner inp = new Scanner(System.in);
        DishService dishService =new DishService();//listede 10 tane yemek var
        OrderService orderService=new OrderService();

    //2-menu tekrar tekrar gosterilsin
    //3-yiyecekler icin class olusturalim
    //7-siparis icin class olusturalim
        int select=-1;//initialize icin 0 disinda bir deger giriyoruz
        while(select!=0){
            System.out.println("------------------------------------------");
            System.out.println("***Lezzet Restaurant Siparis Uygulamasi***");
            System.out.println("1-Menu");
            System.out.println("2-Siparis gir");
            System.out.println("3-Siparisi iptal et");
            System.out.println("4-Hesap Olustur");
            System.out.println("0-CIKIS");
            select=inp.nextInt();
            System.out.println("------------------------------------------");
            switch(select){
                case 1:
                //menu goster
                dishService.showMenu();
                break;
                case 2:
                    orderService.createOrder(dishService);
                //siparis olustur
                break;
                case 3:
                    //siparis iptal
                    orderService.deleteOrder();
                break;
                case 4:
                 // hesap
                    orderService.printBill();
                break;
                case 0:
                System.out.println("İyi günler...");
                    break;
                default:
                    System.out.println("Hatalı giriş");
            }
        }

            }
        }

