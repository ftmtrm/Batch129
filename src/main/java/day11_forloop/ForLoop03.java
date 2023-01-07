package day11_forloop;

public class ForLoop03 {
    public static void main(String[] args) {
        //Ex1:size verilen bir string'i tersten yazdiriniz!!INTERVIEW!!!
        //"Germany"
        String str = "Germany";
        String t = "";//memory'de ters haline yer acmis olduk
        // "Java" String'inde i==3 icin "a" oldu i==2 icin "av"oldu i==1 icin "ava" oldu i==0 icin "avaJ"oldu

        for (int i = str.length()-1; i >=0 ; i--) {

            t += str.charAt(i);//"avaj"i alip t ye koyuyor.

        }System.out.println(t);
        //t'nin son halini aliriz for'un disina yazdirdigimiz icin!!!!
        // butun degisimi gormek istersek loop'un icine koyulur.
        // her degisimden sonra t'nin hali konsolda gorulur.

        //Ex2: Size verilen bir String'in "Palindrome"olup olmadigini kontrol ediniz/
        //sagdan sola soldan saga ayni sey yazar. 11211 civic nalan
        String duz = "civic";//Civic yazarsak palindrome olmaz.duz.equalsIgnoreCase(ters) palindrome olur
        String ters = "";
        for (int i = duz.length()-1; i >=0 ; i--) {
            ters += duz.charAt(i);
        }
            if(duz.equals(ters)){
                System.out.print(duz +  " Palindrome'dur");
            }else {
                System.out.println(duz + " Palindrome degildir");

        }


    }
}
