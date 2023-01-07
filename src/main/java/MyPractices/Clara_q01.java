package MyPractices;

import java.util.Scanner;

public class Clara_q01 {
    public static void main(String[] args) {
        //Kullanicidan alinan bir Stringin ilk ve son harfini yine
        // kulanicidan alinan sayi kadar return eden metod yaziniz.
        Scanner input = new Scanner(System.in);
        System.out.println("Lutfen bir sehir ismi giriniz");
        String s = input.next();
        char chIlk = s.charAt(0);
        char chSon = s.charAt (s.length()-1);
        Scanner scan = new Scanner(System.in);
        System.out.println("Lutfen ilk ve son harfin kac kez tekrarlanacagini giriniz");
        int num = scan.nextInt();

        for (int i = 0 ; i < num; i++) {
            System.out.print(""+chIlk+chSon);
        }
        System.out.println();
        //2.yol:
        Scanner input2 = new Scanner(System.in);
        System.out.println("Lutfen bir sehir ismi giriniz");
        String s2 = input.next();
        Scanner scan2 = new Scanner(System.in);
        System.out.println("Lutfen ilk ve son harfin kac kez tekrarlanacagini giriniz");
        int num2 = scan.nextInt();
        System.out.println(ilkSonHarf(s2,num2));

    }
    private static String ilkSonHarf(String s2, int num2){
        String string =s2.substring(0,1)+s2.substring(s2.length()-1);
        String output = "";
        for (int j = 1; j <=num2; j++) {
            output+=string;
        }
        return output;
    }
}
