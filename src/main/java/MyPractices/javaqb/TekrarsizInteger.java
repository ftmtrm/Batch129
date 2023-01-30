package MyPractices.javaqb;

public class TekrarsizInteger {
    /*Benzersiz (Tekrarsız) rakamları bir tamsayı olarak yazdırmak için kod yazınız.*/
    public static void main(String[] args) {

        Integer num = 223878;
        String s = String.valueOf(num);
        String d = "";
        for (Integer i = 0; i < s.length(); i++) {
            String c = s.substring(i, i + 1);
            if (s.indexOf(c) == s.lastIndexOf(c)) {
                d+= c;
            }
        }
        System.out.println(d);
    }
}
