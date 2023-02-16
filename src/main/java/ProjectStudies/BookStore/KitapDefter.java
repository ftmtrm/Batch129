package ProjectStudies.BookStore;

public class KitapDefter {
    private String kitapdefterID;
    private int birimFiyat;
    private int stok;
    public KitapDefter() {

    }
    public KitapDefter(String kitapdefterID,int birimFiyat , int stok) {
        setKitapdefterID(kitapdefterID);
        this.birimFiyat = birimFiyat;
        setStok(stok);
    }

    public String getKitapdefterID() {
        return kitapdefterID;
    }

    public void setKitapdefterID(String kitapdefterID) {
        this.kitapdefterID = kitapdefterID;
    }

    public int getBirimFiyat() {
        return birimFiyat;
    }

    public void setBirimFiyat(int birimFiyat) {
        this.birimFiyat = birimFiyat;
    }

    public int getStok() {
        return stok;
    }

    public void setStok(int stok) {
        this.stok = stok;
    }

    @Override
    public String toString() {
        return "ID=" + kitapdefterID +
                ", birimFiyat=" + birimFiyat +
                ", stok=" + stok;
    }
}

