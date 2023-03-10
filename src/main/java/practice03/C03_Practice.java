package practice03;
import java.util.Arrays;
import java.util.Scanner;
public class C03_Practice {
    public static void main(String[] args) {

        /*
  INTERWIEW QUESTIONS
   Kullanicidan bir String aliniz.
   String'de var olan her character'in sayisini ekrana yazdiriniz.
   Ornek: alacan ==> a = 3, l = 1, c = 1, n = 1
          abaa   ==> a=3  b=1
          !!!YASIN HOCANINKI COK DAHA MANTIKLI BAK practiceAdvanced10==>Q02
  */
        Scanner input = new Scanner(System.in);
        System.out.print("Bir String giriniz :");

        String str= input.nextLine();  //alican
        String arr[]=str.split("");
        System.out.println(Arrays.toString(arr));//[a, l, i, c, a, n]
        Arrays.sort(arr);
        System.out.println("sort methodundan sonra "+Arrays.toString(arr));
        int counter=0;

        for (int i = 1; i <arr.length ; i++) {
            //sondaki "n"harfini kiyaslicak eleman kalmasi icin i'yi 1'den baslatiyoruz.

            if (arr[i - 1].equals(arr[i])) {
                counter++;//Ayni olanlar icin 1 artir
            } else {
                System.out.println(arr[i - 1] + " karakterinin sayisi " +( counter+1) + " kez tekrarlanmistir");
                counter = 0;//baska harfe gectigi icin sifirlanmali
            }
            if(i== arr.length - 1)//defalarca kodu yazdirmamasi icin sona gelindiginde yazdirmasi icin if kullandik
                System.out.println(arr[i]+ "karakterinin sayisi "+(counter+1)+" kez tekrarlanmistir");
            //iki a'yi karsilastirip 1 tane yazdirmasin diye counter+1 yazdiriyoruz.
        }
    }
}


