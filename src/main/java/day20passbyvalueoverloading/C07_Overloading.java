package day20passbyvalueoverloading;

public class C07_Overloading {
    public static void main(String[] args) {
        String str = "Java ile guzel dunya";
        System.out.println(str.substring(2));
        str.replace("Java", "*");
        System.out.println(str.replace("Java", "*"));// * ile guzel dunya
        System.out.println(str.replace('J', '*'));// *ava ile guzel dunya

        /*!!!!!INTERVIEW
        Ayni isimde ayni classta birden fazla method olusturabilirmiyiz?
        Java ayni isimde ayni class'ta birden fazla method oldugunda icerisindeki data type'ina' data sayisina ya da
        yerlerine gore en uygun olani secer.
        eger bir classta isimlerin ayni data typelari farkli methodlar olusturursak buna METHOD OVERLOADING denir.
        Java hangi methodu kullanacagina karar verirken optimizasyona gider.
        en uygun olani en az Autowidening gerektireni secer.

         */
        topla(3, 5);
        topla(8.6,5);
        topla(2.4,6.8);

    }
        private static void topla(double a, double b) {
            System.out.println(a+b);


    }
    private static void topla(double a, int b) {
        // 8.6 ve 5 verince en uygun olan en az yoran birebir uyan bu oldugu icin bu method calisir
        //ikisi de ayni derecede yoruyorsa ugrasmaz programi calistirmaz.
        System.out.println(a+b);

    }

    private static void topla(int a, int b) {
        //3 ve 5 verince en uygun olan en az yoran birebir uyan bu oldugu icin bu method calisir
        System.out.println(a+b);
    }
}