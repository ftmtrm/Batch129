package practiceAdvanced08;

public class Kutuphane {
    String kitapAdi;
    String yazarAdi;
    int sayfaSayisi;
    String seriNumarasi;
    static int kitapSayisi;
    public Kutuphane(String kitapAdi, String yazarAdi, int sayfaSayisi) {
        kitapSayisi++;
        this.kitapAdi = kitapAdi;
        this.yazarAdi = yazarAdi;
        this.sayfaSayisi = sayfaSayisi;
        seriNumarasi = kitapAdi.substring(0,2)+yazarAdi.substring(0,2)+kitapSayisi;
        kitapBilgileri();
    }

    public void kitapBilgileri(){
        System.out.println("Kitap Adi : "+kitapAdi+" \n yazarAdi: "+yazarAdi+" \n sayfa sayisi: "+sayfaSayisi+" \nseriNumarasi: "+seriNumarasi);
        System.out.println("=========");
    }

    @Override
    public String toString() {
        return "Kutuphane{" +
                "kitapAdi='" + kitapAdi + '\'' +
                ", yazarAdi='" + yazarAdi + '\'' +
                ", sayfaSayisi=" + sayfaSayisi +
                ", seriNumarasi='" + seriNumarasi + '\'' +
                '}';
    }
}