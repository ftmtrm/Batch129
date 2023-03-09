package ProjectStudies.ATM_Project;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class AccountService {
    List<Integer> cardNoList = new ArrayList<>();
    List<String> passwList = new ArrayList<>();
    List<String> customerList = new ArrayList<>();
    static double balance = 7500;
    static Scanner inp;

    public AccountService(){
        Customer customer1 = new Customer("Fatma","Tarim",563894,"bf456");
        Customer customer2 = new Customer("Ayse", "Kartal", 325894, "ak568");
        Customer customer3 = new Customer("Mehmet","Can",258974,"mc741");
        Customer customer4 = new Customer("Ahmet", "Tan", 96587, "at596");
        customerList.add(customer1.getName()+" "+customer1.getSurname());
        customerList.add(customer2.getName()+" "+customer1.getSurname());
        customerList.add(customer3.getName()+" "+customer1.getSurname());
        customerList.add(customer4.getName()+" "+customer1.getSurname());
        passwList.add(customer1.getPassword());
        passwList.add(customer2.getPassword());
        passwList.add(customer3.getPassword());
        passwList.add(customer4.getPassword());
        cardNoList.add(customer1.getCardNo());
        cardNoList.add(customer2.getCardNo());
        cardNoList.add(customer3.getCardNo());
        cardNoList.add(customer4.getCardNo());

    }

    public void login() {
        boolean flag;
        do {
            flag = false;
        inp =new Scanner(System.in);
        System.out.println("Lutfen isminizi giriniz");
        String name = inp.next();
        System.out.println("Lutfen soyisminizi giriniz");
        String surname = inp.next();
        //customerList.add(name+" "+surname);

        System.out.println("Lutfen kart numaranizi giriniz");
        int cardNo = inp.nextInt();
       // cardNoList.add(cardNo);
        System.out.println("Lutfen sifrenizi giriniz");
        String passw = inp.next().trim();
        //passwList.add(passw);
        inp.nextLine();

            boolean isCardno = cardNoList.contains(cardNo);
            boolean isPassw = passwList.contains(passw);
            int idx;
            if (isCardno && isPassw ) {
                idx = cardNoList.indexOf(cardNo);
                if (passwList.get(idx).equals(passw)) {
                    System.out.println("Tebrikler!!! Sisteme basarili bir sekilde giris yaptiniz");
                    break;
                } else {
                    System.out.println("Kart numaraniz ile sifreniz eslesmemektedir. Lutfen tekrar deneyiniz");
                    flag = true;
                }

            } else {
                System.out.println("kart numaraniz veya sifreniz yanlis");
                System.out.println("Bilgilerinizi kontrol ediniz.");
            }

        }while (!flag);

    }

    public void withdrawal() {
        System.out.println("Lutfen yatirmak istediginiz tutari giriniz");
        double withdrawal = inp.nextDouble();
        balance += withdrawal;
        System.out.println("Mevcut bakiyeniz: " + balance);

    }

    public void deposit() {
        boolean isFail;
        double deposit = 0;
        do {
            isFail = false;
            System.out.println("Lutfen cekmek istediginiz tutari giriniz");
            deposit = inp.nextDouble();
            if (balance > deposit) {
                balance -= deposit;
                System.out.println("Cekilen tutar: "+ deposit);
                System.out.println("Kalan bakiyeniz: " + balance);
                break;
            } else {
                System.out.println("Hesabinizda yeterli bakiye bulunmamaktadir. Lutfen bakiyenizden daha az bir miktar giriniz");
                isFail = true;
            }
        } while (isFail);

    }

    public void balanceInquiry() {
        System.out.println("Hesabinizda" + balance + "TL bakiyeniz bulunmaktadir.");

    }

    public void transfer() {
        boolean isValid;
        boolean isExist;
        double transfer = 0;
        do {
            isExist = false;
            System.out.println("Lutfen para gondermek istediginiz hesabin IBAN Nosunu giriniz");
            String ibanNo = inp.next();

            boolean startsTR = ibanNo.startsWith("TR");
            boolean lengthIban = ibanNo.length() == 26;

            if (!startsTR) {
                System.out.println("IBAN No TR ile baslamalidir.");
            } else if (!lengthIban) {
                System.out.println("IBAN No 26 karakterden olusmalidir");
            }
            isValid = startsTR && lengthIban;
            if (!isValid) {
                System.out.println("Yanlis giris yaptiniz Lutfen tekrar deneyiniz");
            } else {
                System.out.println("Lutfen gondermek istediginiz tutari giriniz");
                transfer = inp.nextDouble();
                if (transfer > balance) {
                    System.out.println("Gondermek istediginiz tutar bakiyenizden fazla olamaz");
                    isExist =true;
                } else {
                    System.out.println("Gonderme islemi basariyla tamamlanmistir.");
                    balance -= transfer;
                    System.out.println("Mevcut bakiyeniz: " + balance);
                }
            }
        } while (isExist);
    }

    public void changePassword() {
        System.out.println("Lutfen sifrenizi giriniz");
        String passw = inp.next().trim();
        boolean isPassw = passwList.contains(passw);
        while (true) {
            if (isPassw) {
                System.out.println("Lutfen yeni sifrenizi giriniz");
                String newPassw = inp.next();
                System.out.println("Sifreniz guncellenmistir. Yeni sifreniz :" + newPassw);
                passwList.set(passwList.indexOf(passw),newPassw);
                break;
            }else {
                System.out.println("Gecersiz sifre lutfen tekrar deneyiniz.");
                break;
            }
        }
    }
}

