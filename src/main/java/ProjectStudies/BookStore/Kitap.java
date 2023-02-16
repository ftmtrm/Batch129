package ProjectStudies.BookStore;

public class Kitap extends KitapDefter{
    String yazarAdi;
    String yayinevi;

    public Kitap() {
    }

    public Kitap(String kitapdefterID,int birimFiyat , int stok,String yayinevi , String yazarAdi) {
        super(kitapdefterID,birimFiyat,stok);
        this.yazarAdi = yazarAdi;
        this.yayinevi = yayinevi;
    }

    public String getYazarAdi() {
        return yazarAdi;
    }

    public void setYazarAdi(String yazarAdi) {
        this.yazarAdi = yazarAdi;
    }

    public String getYayinevi() {
        return yayinevi;
    }

    public void setYayinevi(String yayinevi) {
        this.yayinevi = yayinevi;
    }

    @Override
    public String toString() {
        return "Kitap{" +super.toString()+
                 ", yayinevi= " + yayinevi +
                ", yazarAdi= " + yazarAdi+
                '}';
    }
}
