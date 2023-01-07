package ssg_if_nestedif;

public class NestedIf {
    public static void main(String[] args) {
        // bir kisinin kan bagisinda bulunup bulunmadigini kontrol ediniz .
        // yas:18 baslamali
        // kilo : 50 dan ust olmali
        //Yaş ve kilo için iki değişken oluşturma
        int yas = 20;
        int kilo = 60;
        if (yas >= 18) {

            if (kilo >= 50) {
                System.out.println("Kan bagisinda bulunabilirsiniz");
            } else {
                System.out.println("kan bagisina uygun degilsiniz");
            }

        }else
            System.out.println("yasiniz 18'den buyuk olmali");
            }

        }

