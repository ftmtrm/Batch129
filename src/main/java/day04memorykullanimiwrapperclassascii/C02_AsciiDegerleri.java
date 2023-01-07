package day04memorykullanimiwrapperclassascii;

public class C02_AsciiDegerleri {
    /*ASCII: Amerikan Standart Kodlama Sistemi: Uluslararası kabul görmüş değerlerdir.
    klavyemizde kullandığımız harf ve sembollerin matematiksel karşılığı char data türünde işleme alınırsa
    o char değerinin ASCII Table daki karşılığını işleme alır.
    harf ve sembollere değer atar.
    karakterlerin cebirsel karşılığını bulmak için ortaya çıkmıştır.
    çünkü bilgisarda herşey 10010001..den oluşur.
    bu yapıya dönüştürebilmek için cebirsel karşılıkları oluşturulmuştur.
    büyük harflerin ASCII Değeri küçük harflerin ASCII Değerinden daha küçüktür.
     */

    public static void main(String[] args) {
        //bir tam sayı ile bir harfi toplayınız
        int deger = 20;
        char harf = 'a';

        //1.yol
        int sum = deger+harf;
        System.out.println("bir tam sayı ile harfin toplamı="+sum);//117


        //2.yol
        System.out.println("2.yol toplam="+(deger+harf));//117

        char rakam1 = '1';
        System.out.println("rakam1 = " +rakam1);//1gelir
        char rakam2= '2';
        System.out.println("rakam2 = " + rakam2);//2gelir
        char rakam3 = '3';
        System.out.println("rakam3 = " + rakam3);//3 gelir

        System.out.println("rakam1+rakam2+rakam3="+rakam1+rakam2+rakam3);
        //123 concad yapıyo yanyana yazdırıyo
        // parantez olmadığı için matematiksel işlem olarak algılamıyor.
        System.out.println("rakam1+rakam2+rakam3 ASCII toplam="+(rakam1+rakam2+rakam3));
        // parantez içine alırsak 150 değerini verir.49+50+51

        char kh = 'a';
        char bh = 'A';
        System.out.println("a'nın ASCII Degeri=" + (kh+0));//97
        System.out.println("A'nın ASCII Değeri="+(bh+0));//65

        System.out.println("kh>bh==>"+(kh>bh));//true verdi.
        // karşılaştırma işlemlerinin sonucu true ya da false döner.

        //herhangi bir karakterin ASCII Değerini hesaplatalım
        //1.yol:
        char space = ' ';
        System.out.println("space'in ASCII Değeri="+(space+0));//32
        //2.yol:
        int hrf = 'm';
        //char data typelarında java karaktere integer değer de atanabilir
        //çünkü char'ların bir resim değeri bir de ASCII den gelen integer değeri vardır.
        //bu şekilde ASCII Değerini bulabiliriz

        System.out.println("int harfin ASCII Degeri"+hrf);//109 verir.

        //****ASCII Değerlerinden yararlanarak karşılaştırma yapabiliriz*****\\

        byte b = 125;
        float f = 2.45648f;
        long l = 54565125511144L;
        char ch = 'h';

        System.out.println(l>ch);//true
        System.out.println(b<f);//false
        System.out.println(b<ch);//false

    }
}

