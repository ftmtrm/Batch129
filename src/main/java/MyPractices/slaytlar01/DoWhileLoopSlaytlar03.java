package MyPractices.slaytlar01;

import java.util.Scanner;

public class DoWhileLoopSlaytlar03 {
    public static void main(String[] args) {
        //Q1:
        int i = 9;
        do {
            if (i%7== 0){
                System.out.print(i+" ");
            }
            i++;
        } while (i <= 190);
        System.out.println();

        //Q2:
        char k = 'm';
        do{
            System.out.print(k);
            k--;
        }while(k>='c');
        System.out.println();

        //Q3:
        Scanner input = new Scanner(System.in);
        int counter = 0;
        int sum = 0;
        do{
            System.out.println("lutfen bir sayi giriniz...");
            int number = input.nextInt();
            sum+=number;
            System.out.println(sum);
            if(number==0){
                System.out.println(counter);
                break;
            }
            counter++;
        }while(true);
        System.out.println();
//  Q5:
        Scanner scan = new Scanner(System.in);
        System.out.println("Lutfen sifrenizi giriniz");
        String pwd = scan.next();
        do{
            if(!pwd.contains("[a-z]")){
                System.out.println("Sifre kucuk harf icermelidir!");
                break;
            }else if (!pwd.contains("[A-Z]")) {
                System.out.println("Sifre buyuk harf icermelidir!");
                break;

            }
        }while(true);




    }
}
