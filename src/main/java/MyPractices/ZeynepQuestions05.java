package MyPractices;

import java.util.Scanner;
import java.util.Arrays;


public class ZeynepQuestions05 {
    public static void main(String[] args) {
         /* Kullanicidan bir isim ve karakter girmesini isteyin, sonra karakterin kac kez tekrarlandigini kontrol edin.

     *///1.yol:
        Scanner input = new Scanner(System.in);
        System.out.println("Lutfen bir sehir ismi giriniz");
        String sehir = input.next();
        System.out.println("Lutfen bir karakter giriniz");
        char ch = input.next().charAt(0);
        int sayac = 0;
        for (int i = 0; i < sehir.length(); i++) {
            if(sehir.charAt(i)== ch)
                sayac++;
            }
            System.out.println("Tekrar sayisi " + sayac);
        System.out.println();
        //2.yol:
                Scanner scan = new Scanner(System.in);
                System.out.print("Bir String giriniz :");

                String str= scan.nextLine();  //alican
                String arr[]=str.split("");
                System.out.println(Arrays.toString(arr));//[a, l, i, c, a, n]
                Arrays.sort(arr);
                System.out.println("sort methodundan sonra "+Arrays.toString(arr));
                int counter=0;

                for (int i = 1; i <arr.length ;             i++) {

                    if (arr[i - 1].equals(arr[i])) {
                        counter++;//Ayni olanlar icin 1 artir
                    } else {
                        System.out.println(arr[i - 1] + " karakterinin sayisi " +( counter+1) + " kez tekrarlanmistir");
                        counter = 0;//baska harfe gectigi icin sifirlanmali
                    }
                    if(i== arr.length - 1)//defalarca kodu yazdirmamasi icin sona gelindiginde yazdirmasi icin if kullandik
                        System.out.println(arr[i]+ " karakterinin sayisi "+(counter+1)+" kez tekrarlanmistir");
                }
            }
        }





