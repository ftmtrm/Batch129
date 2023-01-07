package day20passbyvaluemethodoverloading_s;

public class MethodOverloading {
    public static void main(String[] args) {
        /* Ayni isimde farkli islemler yapan methodlara METHOD OVERLOADING denir.
        ayni isme birden fazla is yuklendigi icin bu isim verilmistir.(replace,substring gibi)
        birden fazla method oldugunda java hangisini kullanacagina nasil karar verir?
        en az islemle yapacagi sekilde olusturulan methodu kullanir.
        METHOD OVERLOADING nasil yapilir?
        1)Method Overloading yaparken method ismi degistirilmez
        2)Method Overloading yaparken parametreler degistirilir.
            a)Parametre degistirilirken parametrelerin data type'lari degistirilebilir.
            b)Parametre degistirirken,parametrelerin data type'lari farklı ise yerleri degistirilebilir.
            c)Parametre degistirirken, parametrelerin sayisi degistirilebilir.
        3) Java icin ismi ve parametreleri ayni olan iki method tamamiyla aynidir
        bu yuzden isim ve parametre "Method Signature" olarak adlandirilir.
        4) Method overloading olustururken  return type'i degistirmenin hicbir etkisi yoktur.
           Method overloading olustururken  access modifier'i degistirmenin hicbir etkisi yoktur.
           Method overloading olustururken  methodu statik veya non-static yapmanin hicbir etkisi yoktur.
           Method overloading olustururken  method body'i degistirmenin hicbir etkisi yoktur.
         5) "Private" methodlar overload edilebilir.//private method's can be overloaded
         cunku method overloading sadece bir class'in icinde olur.
         "private" olmak ise baska class'lara gidildiginde problem olusturur.
         6) Statik methodlar overload edilebilirler.
         ustundeki degisiklikler herkes tarafindan aninda gorulebilen objelere statik denir,gorulemeyenlere
         non-static denir.(kayitli ogrenci sayisi, gokteki ay ornegi)
         */
     add(3,5);
    }
    public static void add(int a, int b){//add'den sonraki kisma "method signature" denir.
        // a ve b'nin ikisi de int oldugu icin Java bunu kullanir.hic autowidening yok
        System.out.println(a + b);
    }

    public static void add(double a, double b){
        //1.method olmasa a=3, b=5 iken 2 autowidening yaparak buraya koyabilir.ama tercih etmez
        System.out.println(a + b);
    }

    public static void add(double a, int b){
        //1.method olmasa a=3, b=5 iken 1 autowidening yaparak buraya koyabilir.
        // alttakiyle birlikte ikisi arasinda kendisi karar vermez.bir secenegi silmek gerekir.yoksa calismaz
        System.out.println(a + b);
    }

    public static void add(int a, double b){
        //b'yi double yaparsak bunu kullanir.
        // 1.method olmasa a=3, b=5 iken 1 autowidening yaparak buraya koyabilir
        System.out.println(a + b);
    }
    public static void add(int a, int b, int c){
        System.out.println(a + b + c);
    }
    //a=3,b=5.2,c=4 olursa Java islem yapmaz
}
