package MyPractices.javaqb;

public class Palindrome {
    /*Bir String ‘ in palindrom olup olmadığını kontrol etmek için kod yazınız. Bir String, tersi ile
    aynıysa, buna palindrom denir. Örneğin; “anna”, “123321” palindromlardır.*/
    public static void main(String[] args) {

        String s = "runnur";
        String r = "";
        for (Integer i = s.length() - 1; i >= 0; i--) {
            String c = s.substring(i, i + 1);
            r+= c;
        }
        if (s.equals(r)) {
            System.out.println(s + " palindromdur");
        } else {
            System.out.println(s + " palindrom degildir");
        }
    }
}
