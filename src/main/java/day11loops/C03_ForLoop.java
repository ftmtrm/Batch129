package day11loops;

public class C03_ForLoop {

    //INTERVIEW Questions

    public static void main(String[] args) {
        //String karakterleri teker teker yazdiran
        // eger 'a' karakterini gorurse yazdirmayi durduran kodu yaziniz

        String cumle = "Ogrenmek yasamin tek kanitidir";
        for (int i = 0; i < cumle.length(); i++) {
            if (cumle.charAt(i)=='a'){
                break;

            }
            System.out.print(cumle.charAt(i)+" ");

        }
    }

}
