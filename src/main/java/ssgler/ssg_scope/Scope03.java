package ssgler.ssg_scope;

public class Scope03 {
    int x =12;
    private String isim = "can";//runnerdan cagrilmiyor private oldugu icin
    private String soyisim = "can";
    private String yas = "can";

    public static void main(String[] args) {

        int i;
        //int i'yi buraya koyarsak hata vermez artik yazdirinca
        for ( i = 1; i <=5 ; i++) {
            System.out.println(i);//forun scope'u icinde yazdirilabilir disinda hata verir.

        }
        System.out.println(i);

    }
}
