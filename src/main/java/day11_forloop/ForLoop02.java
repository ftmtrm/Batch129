package day11_forloop;

public class ForLoop02 {
    public static void main(String[] args) {
        //Ex1: Verilen bir String'te 'a' karakteri haric tum karakterleri yazdiriniz.
        //"Madagaskar"

        //1.yol:
        String s = "Madagaskar";
        String t = s.replace("a", "");

        System.out.print(t);

        System.out.println();

        //2.yol:
        for (int i = 0; i < s.length() ; i++) {
            char ch = s.charAt(i);
            if(ch!='a'){
                System.out.print(ch);
            }

        }
        System.out.println();
        //3.yol:
        for (int i = 0; i <s.length() ; i++) {
            char ch1 = s.charAt(i);
            if(ch1=='a'){
                continue;//continue keywordu bazi sartlar icin loop'un adimlarini atlamamiza yardim eder.
            }
            System.out.print(ch1);
        }
    }
}
