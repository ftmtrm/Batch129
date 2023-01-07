package day11_forloop;

public class ForLoop04 {
    public static void main(String[] args) {
        //Ex1: 5'den 8'e kadar tamsayilarin toplamini veren kodu yaziniz
        int sum = 0;
        for (int i = 5; i <9 ; i++) {
            sum=sum+i;
        }
        System.out.println(sum);
        //Ex2: 7'den 9'a kadar olan tamsayilarin carpimini veren kodu yaziniz
        int multiply = 1;
        for (int i = 7; i <10 ; i++) {
            multiply = multiply*i;

        }
        System.out.println(multiply);
    }
}
