package Lambda_Practice_BurakHoca;

public class Lambda03_PojoApartman {
    private String cephe;
    private int katSayi;
    private int kira;
    public Lambda03_PojoApartman() {
    }
    public Lambda03_PojoApartman(String cephe, int katSayi, int kira) {
        this.cephe = cephe;
        this.katSayi = katSayi;
        this.kira = kira;
    }

    public String getCephe() {
        return cephe;
    }

    public void setCephe(String cephe) {
        this.cephe = cephe;
    }

    public int getKatSayi() {
        return katSayi;
    }

    public void setKatSayi(int katSayi) {
        this.katSayi = katSayi;
    }

    public int getKira() {
        return kira;
    }

    public void setKira(int kira) {
        this.kira = kira;
    }

    @Override
    public String toString() {
        return "Lambda03_PojoApartman{" +
                "cephe='" + cephe + '\'' +
                ", katSayi=" + katSayi +
                ", kira=" + kira +
                '}';
    }
}

