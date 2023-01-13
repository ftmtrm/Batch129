package ssgler.ssgArrays;

public class Arrays02 {
    public static void main(String[] args) {
        //soru Verilen bir int array'deki en buyuk sayiyi yazdiran bir method olusturun.

        int sayi[] = {8, 5, 12, 11, 14};

        maxSayiYazdir(sayi);

}public static void maxSayiYazdir(int [] sayi) {
        int maxSayi = sayi[0];
        for (int i = 1; i < sayi.length; i++) {
            if (sayi[i] > maxSayi) {
                maxSayi = sayi[i];
                //for(int w:sayi){
                //  if(w>maxSayi);
                //maxSayi=w;

            }

            System.out.println(maxSayi);
        }
    }

}


