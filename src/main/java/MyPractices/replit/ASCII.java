package MyPractices.replit;

public class ASCII {
    public static void main(String[] args) {
        //'a'dan 'z'ye kadar olan tum karakterlerin ASCII degerlerini konsola yazdiran bir kod yazınız.
        char ch1 = 'a';

        char ch2 = 'z';

        for (int i = ch1; i <= ch2; i++) {

            System.out.println("The ASCII value of "+ (char) i +" = " + " "+ i );
        }
    }
}

