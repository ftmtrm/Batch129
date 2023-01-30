package day30exceptions_interface;

public class Exceptions01 {
    public static void main(String[] args) {
    int a = 12;
    int b = 4;
    int c []= {3,6,9,12};
    m(c,a,b);

    }
    public static void m(int[] c, int a, int b){

        try {
            int idx = a/b;
            int element = c[idx];
            System.out.println(element);
        } catch (ArithmeticException e) {
            System.out.println(e.getMessage());
        }catch (ArrayIndexOutOfBoundsException e){
            System.out.println(e.getMessage());
        }finally {//ister exception olsun isterse olmasin her halukarda calisir.eger bir kodun herhalukarda calis
            //masini istiyorsaniz finally'nin icine koymaniz gerekir.
            System.out.println("Cut the connection with the database");
        }
    }
}
