package day30exceptions_interface;

public class Exceptions02 {
    public static void main(String[] args) {
        int a = 12;
        int b = 2;
        int c []= {3,6,9,12};
        m(c,a,b);

    }

    public static void m(int[] c, int a, int b) {

        try {
            int idx = a / b;
            int element = c[idx];
            System.out.println(element);
        } catch (Exception e){      //"Exception" en genel exception'dir herturlu problemi halleder.Ancak specific cozumler uretmek
            // istiyorsaniz ayri ayri exception kullanilmali
            System.out.println(e.getMessage());

        }
    }
}