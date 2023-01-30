package practice09;

public class KumandaRunner {
   /* 1)TV ekraninin genisligini,
    yuksekligini ve ekran buyuklugunu ayarlayabildiginiz
    2)kanal degistirebildiginiz;kapatip acabildiginiz;
    3)ses azaltip artirabildiginiz ve bu artirmanin bir
    max. degerinin oldugu bir TV kumandasinin kodunu yaziniz.*/
   public static void main(String[] args) {

       Kumanda tv = new Kumanda(11.5,7,9.8);
       tv.gucDugmesi();
       System.out.println(tv.kanalDegistirme(3));//
       System.out.println(tv.sesAzaltma());//9
       System.out.println(tv.sesArtirma());//10

   }//main
}

