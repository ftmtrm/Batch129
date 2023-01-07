package day11_forloop;

public class ForLoop01 {
    public static void main(String[] args) {
        //Ex1:Verilen bir String'te ilk a harfinden onceki tum karakterleri console'a yazdiriniz.
        //I love Java"
        String s = "I love Java";
        for (int i = 0; i <s.length() ; i++) {
            char ch = s.charAt(i);
            if (ch =='a') {
                break;

            }System.out.print(ch);

        }
        System.out.println();
        //Ex2:verilen bir String'te son a'dan sonraki tum karakterleri ters sirada yazdiriniz.
        //"Germany"==>yn

        String t = "Germany";
        for (int i = t.length()-1; i >=0 ; i--) {
            char ch1 = t.charAt(i);
            if (ch1=='a'){
                break;

            }
            System.out.print(ch1);

        }

    }
}
