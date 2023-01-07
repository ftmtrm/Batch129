package practiceAdvanced02;

public class Q04_RandomMethod {
    public static void main(String[] args) {

        /* Rastgele bir harf veren bir method olusturun ve ardindan methodu kullanarak asagidakileri yazdiriniz
        'A' ve 'a' icin "Ilk Karakter"
        'B' ve 'b' icin "Ikinci Karakter"
        'C' ve 'c' icin "Ucuncu Karakter"
        'D' ve 'd' icin "Dorduncu Karakter"
        digerleri icin "Diger karakterler"
         */
        //System.out.println((int)(Math.random()*101));//rastgele sayi alma
        String rastgeleHarf = rastgeleHarf().toLowerCase();
        System.out.println(rastgeleHarf);

        switch (rastgeleHarf){
            case "a":
                System.out.println("Ilk Karakter");
                break;
            case "b":
                System.out.println("Ikinci Karakter");
                break;
            case "c":
                System.out.println("Ucuncu Karakter");
                break;
            case "d":
                System.out.println("Dorduncu Karakter");
                break;
            default:
                System.out.println("Diger Karakterler");
        }


    }
    public static String rastgeleHarf(){//rastgele harf cagirmak icin burayi olusturduk (belli bir scopeun icerisinden)
        String alfabe = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz";//rastgele harf alcaz
        int maxIndex = alfabe.length();
        int rastgeleIndex = (int)(Math.random()*maxIndex);

        return alfabe.substring(rastgeleIndex, rastgeleIndex+1);


}


}
