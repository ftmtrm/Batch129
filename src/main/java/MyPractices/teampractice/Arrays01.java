package MyPractices.teampractice;

public class Arrays01 {

    //Verilen bir String'de 'b' ile veya 'B' ile başlayan kelime sayılarini bulunuz.

    public static void main(String[] args) {
        String s = "Babasi ile Burak bol bol balik yediler";
        String[] arr = s.split(" ");
        int counter1 = 0;
        int counter2 = 0;
        for (String w : arr) {
            if (w.startsWith("b")){
                counter1++;
            }else if( w.startsWith("B")) {
                counter2++;
            }
        }
        System.out.println("The number of words which starts with 'b' is :" +counter1 + "  'B' is : " + counter2);
    }
}







