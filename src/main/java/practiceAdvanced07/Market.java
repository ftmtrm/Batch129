package practiceAdvanced07;

import java.time.LocalDate;

public class Market {//constructor overloading yapilabilir
    String urunAdi;
    double urunFiyati;//Double yapsak (wrapper class) yani urunFiyati bos birakilirsa 'null'gorunur.
    String sonKullanmaTarihi;
    /*Market(String ad, double fiyat, String skt){
        urunAdi = ad;//this.urunAdi = urunAdi seklinde de yapilabilir ancak karmasik olur.
        urunFiyati = fiyat;
        sonKullanmaTarihi = skt;*/

    public Market(String urunAdi, double urunFiyati, int aySonra) {
        this.urunAdi = urunAdi;
        if(urunFiyati>99){
            urunFiyati= urunFiyati*0.9;
        }
        this.urunFiyati = urunFiyati;
        this.sonKullanmaTarihi = LocalDate.now().plusMonths(aySonra).toString();
    }
    public Market(String urunAdi, double urunFiyati) {
        this.urunAdi = urunAdi;
        if (urunFiyati > 99) {
            urunFiyati = urunFiyati * 0.9;
        }
        this.urunFiyati = urunFiyati;
        this.sonKullanmaTarihi = "Urunun son kullanma tarihi bulunmamaktadir.";

    }

    public Market() {

    }

    @Override
    public String toString() {
        return "Market{" +
                "urunAdi='" + urunAdi + '\'' +
                ", urunFiyati=" + urunFiyati +
                ", sonKullanmaTarihi='" + sonKullanmaTarihi + '\'' +
                '}';
    }
}


