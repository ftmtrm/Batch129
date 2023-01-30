package day30exceptions_interface;

public interface AC {
    /* 1) interface'lerin icine concrete method konulamaz.Cunku concrete method'larda body vardir)
    ve body method'un isi nasil yapacagini belirtir.Isin nasil yapilacagi bir cok detay icerir ve
    bu child class'lara kafa karisikligina sebep olur.Halbuki sadece yapilmasi gereken isi soyleyip
    nasil yapilacagini child'a birakirsaniz Child class'in kafa karisikligini engellemis olursunuz.
    2) Interface'lerdeki tum methodlar otomatik olarak public,abstract'tir ve static degildir.
    3) Coklu interface parent'larin herbirinin icine ayni isimli methodlar koyabiliriz.Mesela AC'nin,Engine'nin
    ve Security'nin herbirinin iclerine run methodu koymak gibi.
    Child class herhangi birini override ettiginde hepsini override etmis gibi olur sonra da body'yi child
    class'ta yazarak uygulamasini yapmis olur.
    4) Interface'lerdeki variable'lar otomatik olarak public'tir,static'tir ve final'dir.
    5) Interface'ler fully abstract'tir, abstract classlar ise icinde hem concrete hem abstract method kullanilabilir
    bu nedenle abstract classlar partial abstract'tir.
  1)Interface'lerden object olusturulamaz cunku interface'lerin constructor'i yoktur.
  2)Abstract class'lardan object olusturulamaz constructorlari vardir ama constructor object olusturmada
  kullanilamaz.
  3)Interface'lerin constructorlari olmadigindan collection olustururken interface isimleri "new" keyword'un son
  den sonra kullanilamaz.
  4)class --> class ==> extends
    class --> interface ==> implements
    interface --> interface ==> extends
    interface --> class ==> Bu mumkun degildir. Bir interface bir class'in child'i olamaz.
    */
    void cool();//methodun return type'i olmalidir ondan void silinemez.
    void run();

     int price = 2000;//interface'deki variable'lar public static final'dir.o nedenle yazmayabiliriz.
    String model ="Mitsubishi";


    }

