package MyPractices.javaqb;

public class AAAA_Matrix {
    /*Aşağıdaki görüntüyü bir for döngüsü kullanarak elde eden kodu yazınız.
    A A A A A
    A A A A A
    A A A A A*/
    public static void main(String[] args) {
        int rows = 3;
        int columns = 5;
        for (int i = 1; i <= rows; i++) {
            String s = "";
            for (Integer k = 1; k <= columns; k++) {
                s += "A ";
            }
            System.out.println(s);
        }
    }
}