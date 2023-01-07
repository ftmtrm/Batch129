package day04memorykullanimiwrapperclassascii;

public class C04_WrapperClass {
    /*
    nonprimitive data türleri sadece data barındırmak için değil aynı zamanda methodlarda bulundurur
    primitive data türleri ise sadece değer saklar methodu yoktur
    Java bu duruma bir çözüm üretmiştir.
    her primitive data türünü nonprimitive olarak kullanabilmek için özel classlar oluşturmuştur.
    Oracle firmasının ürünü olan Java primitivelere method ekleyerek oluşturdukları
     bu yeni yapıya wrapper class ismini vermiştir.

     primitive           Wrapper
     byte                 Byte
     short                Short
     int                  Integer***
     long                 Long
     float                Float
     double               Double
     boolean              Boolean
     char                 Character***

     */

    public static void main(String[] args) {
        byte primitiveByte = 12;//primitive data tiplerinde . koyduğumuzda hiçbir method gelmez.
        Byte wrapperByte = 12; //wrapper classlarda . koyduğumuzda birçok method kullanabiliriz.

        //byte data type'ının en küçük ve en büyük değerini ekrana yazdırın.

        System.out.println(Byte.MIN_VALUE);
        System.out.println(Byte.MAX_VALUE);
        System.out.println(Short.MIN_VALUE);
        System.out.println(Short.MAX_VALUE);
        System.out.println(Integer.MIN_VALUE);
        System.out.println(Integer.MAX_VALUE);
        System.out.println(Long.MIN_VALUE);
        System.out.println(Long.MAX_VALUE);

        //Primitiveler Wrapper Classlara nasıl çevrilir?
        //(Autoboxing) ile yapılır.

        float f1 = 13.99F;//Küçük kutu primitive
        Float wrapperF1 = f1;//primitive data tipini nonprimitive'in içine yerleştirmiş oluruz.

        //Wrapper Classları nasıl primitive lere çevrilir?
        //(unboxing) ile yapılır.
        //Autoboxing ve Unboxing Java tarafından otomatik yapılır. Ekstra kod yazmaya gerek yoktur.

        Character w1 = 's';
        char primitiveW1 = w1;

        //verilen iki string datanın toplamını gösteren kodu yazınız

        String str1 = "12345";
        String str2 = "6789";
        System.out.println(str1+str2);//concad yaptı 12345678

        System.out.println(Integer.valueOf(str1)+Integer.valueOf(str2));//19134 verir.










    }
}
