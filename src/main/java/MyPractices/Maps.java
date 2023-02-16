package MyPractices;
import java.util.HashMap;
import java.util.Scanner;
public class Maps {
        static HashMap<String, String> person = new HashMap<>();
        static Scanner sc = new Scanner(System.in);
	              /*
                     1) Kullanicidan kimlik numarasini(4 haneli), tam ismini, adresini, telefonunu, alin
                     2) Kimlik numarasini key olarak, diger bilgileri value olarak bir map'e depolayin

                     saveInfo() method olusturun:
                     3)Kullanicidan bircok kimlik numarasi(4 haneli), isim, adres ve telefon alin.
                     4)Kimlik numarasini key olarak, diger bilgileri value olarak bir map'e depolayin.
                     5)Ayni kimlik numarasi ile bilgi girilmesine engel olun.

                	 getInfo() method olusturun:
          		     1)Kimlik numarasini girerek kullanicinin bilgilerine ulasin.
                     2)Olmayan kimlik numarasi girilirse kullaniciya hata mesaji verin.

                     removeInfo() method olusturun:
                     1)Kimlik numarasini girerek data silin.
                     2)Girilen kimlik numarasi yoksa kullaniciya hata mesaji verin.
                     3)Collection bos ise kullaniciya hata mesaji verin.

                     selectOption() method olusturun:
                     1)Yukaridaki 3 methodu programi sonlandirana kadar secme hakki verin
               */

        public static void main(String[] args) {
            selectOption();
        }
        private static void selectOption() {
            System.out.println("yapmak istediginiz islemi giriniz :\n0:islemi sonlandir\n" +
                    "1:kullanici ekle\n2:kullanici bilgisi alma\n3:kullanici silme");
            int secim = sc.nextInt();//nextLine hata verir.Ã§Ã¼nkÃ¼ bir Ã¼st satÄ±r println deÄŸil print olduÄŸu iÃ§in tum satÄ±rÄ± alÄ±r.
            switch (secim) {
                case 0:
                    cikis();
                    break;
                case 1:
                    saveInfo();
                    break;
                case 2:
                    getInfo();
                    break;
                case 3:
                    removeInfo();
                    break;
                default:
                    System.out.println("yanlis giris yaptiniz. Tekrar deneyiniz");
                    selectOption();
                    break;
            }
        }
        private static void cikis() {
            System.out.println("cikis isleminiz yapildi. haydi selametle....");
        }

        private static void removeInfo() {
            System.out.print("silinecek tc yi giriniz :");
            String silinecekTc = sc.next();//nextLine hata verir.cunku bir ust satir println degil print oldugu icin tum satiri alir.
            if (person.containsKey(silinecekTc)) {//1. adim
                person.remove(silinecekTc);
                System.out.println("girilen tc gayet basarili bi sekilde silindi"+person);//silinecekTc nin tum bilgilerini person map'inden getirdik.(map.get(key);tum degerleri value getirir.)

            } else {System.out.println("aradiginiz tc'ye sahip sahis yoktur.\n Lutfen tekrar deneyiniz");//2. adim
                removeInfo();}//kullanici, silinenTc ye sahip sahis olmadigi  icin tekrar tc girisi yapacak
            selectOption();
        }

        private static void getInfo() {
            System.out.print("aradiginiz tc yi giriniz :");
            String arananTc = sc.next();//nextLine hata verir.
            if (person.containsKey(arananTc)) {
                System.out.println(person.get(arananTc));//arananTc nin tum bilgilerini person map'inden getirdik.(map.get(key);tum degerleri value getirir.)
            } else {System.out.println("aradiginiz tc sahip sahis yoktur.\n tekrar deneyin");
                getInfo();}//kullanici, arananTc ye sahip sahis olmadigi  icin tekrar tc girisi yapacak //kullanici var olmayan tc girdigi icin tekrar tc girisi icin getInfo() metoda geri gonderdik.
            selectOption();
        }



        private static void saveInfo() {

            System.out.print("4 haneli tc nizi girin : ");
            String tc = sc.next();//nextLine hata verir.
            sc.nextLine();//arda arda scan.nextline calisinca hata vermemesi icin bos bir sc.nextLine(); atadik .

            if (person.containsKey(tc)) {
                System.out.println("var olan bir tc girdiniz tekrar deneyiniz...");
                saveInfo();//kullanici var olan tc girdigi icin tekrar tc girisi icin saveInfo() metoduna geri gonderdik.
            } else {
                System.out.print("adinizi giriniz: ");
                String name = sc.nextLine();

                System.out.print("soyadinizi giriniz: ");
                String surName = sc.nextLine();

                System.out.print("adres giriniz: ");
                String adress = sc.nextLine();

                System.out.print("tel  giriniz: ");
                String phone = sc.nextLine();

                String values = name + " " + surName + " " + adress + " " + phone;//tc haric verileri bir stringe atadik
                person.put(tc, values);//person map'ine tc key olarak diger bilgiler (name surname...) value olarak eklendi.
                System.out.println("verilerinizi dogru sekilde girdiniz tebrikler verileriniz kaydedildi. verileriniz : "+person);
                System.out.println("     *****    ");
                selectOption();
            }

        }
    }




