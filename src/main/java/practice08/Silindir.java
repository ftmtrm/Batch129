package practice08;

public class Silindir extends Geometri{
    @Override
    public double hacimHesapla(int r, int h){
        //babadaki hacim hesapla methodu isime yaramiyor ondan kendi classimizdakini kullanmak icin
        // override yapiyoruz eziyoruz yani baba classini
        return 3.14*r*r*h;
    }
}
