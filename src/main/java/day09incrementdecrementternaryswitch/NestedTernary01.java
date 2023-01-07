package day09incrementdecrementternaryswitch;

public class NestedTernary01 {
    public static void main(String[] args) {
        /*
        Ex1: Verilen yilin "artik yil(leap year)" olup olmadigini kontrol eden kodu yaziniz
        1) yil 100'e bolunuyorsa 400'e de bolunmelidir
        2) yil 100'e bolunmuyorsa 4'e bolunmelidir
         */
        int year = 1600;
        String result = year%100==0 ? (year%400==0 ? "Leap":"Not Leap"):(year%4==0 ? "Leap": "Not Leap");
        System.out.println(result);
    }
}
