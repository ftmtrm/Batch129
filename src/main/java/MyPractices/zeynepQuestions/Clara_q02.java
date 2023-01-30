package MyPractices.zeynepQuestions;

import java.util.Scanner;

public class Clara_q02 {
    public static void main(String[] args) {

        //kullanicidan pozitif bir sayi girmesini isteyin ve sayinin asal sayi olup olmadigini konrol edin..
        Scanner scan = new Scanner(System.in);
        System.out.println("Lutfen pozitif bir tamsayi giriniz");
        int num = scan.nextInt();

        boolean asalMi = true;
        if (num>=2){
            for (int i = 2; i <num ; i++) {
                if(num%i==0){
                    asalMi = false;
                    break;
                }
            }if(asalMi)
            System.out.println("Sayi asaldir");
        }else

            System.out.println("sayi asal degildir");
            }


        }


