package MyPractices.interviewQuestions;

public class ReverseString {
    // Stringi ters cevirmek icin bir Java Programi yazin
    //1.Yol: StringBuilder () kullanarak
    //2.Yol: String Classini kullanarak
    //3.Yol: Bir method olusturun, ardindan methodu main method dan cagirin
    public static void main(String[] args) {
        //1.Yol: StringBuilder () kullanarak
        String input = "Java ogren para kazan";

        StringBuilder stb = new StringBuilder();
        stb.append(input);

        String reverseInput = stb.reverse().toString();
        System.out.println("1.yol :" + reverseInput);

        //2.yol: String kullanarak
        String str = "Java ile hayat cok guzel";
        for (int i = str.length() - 1; i >= 0; i--) {
            System.out.print(str.charAt(i));
        }
        System.out.println();
        //3.yol:
        inputTersArray(input);

    }//main sonu
    private static void inputTersArray(String input) {
        char [] arr = input.toCharArray(); //String bir veriyi karakterlere char tipinde ayirir..
       // String arr[] = input.split("");bu sekilde soutun icine sadece arr[i] yazilmali
        for (int i = input.length()-1; i >=0 ; i--) {
            System.out.print("3.yol: " + arr[i]);

        }
    }

}
