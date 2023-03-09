package ProjectStudies.BookStore;

public class Defter extends KitapDefter{
    String marka;
    int yaprakSayisi;

    public Defter() {
    }
    public Defter(int kitapdefterID,int birimFiyat , int stok, String marka, int yaprakSayisi) {
        super(kitapdefterID, birimFiyat, stok);
        this.marka = marka;
        this.yaprakSayisi = yaprakSayisi;
    }

    public String getMarka() {
        return marka;
    }

    public void setMarka(String marka) {
        this.marka = marka;
    }

    public int getYaprakSayisi() {
        return yaprakSayisi;
    }

    public void setYaprakSayisi(int yaprakSayisi) {
        this.yaprakSayisi = yaprakSayisi;
    }

    @Override
    public String toString() {
        return "Defter{" +super.toString()+
                " , marka= " + marka +
                ", yaprakSayisi=" + yaprakSayisi +
                '}';
    }
}
