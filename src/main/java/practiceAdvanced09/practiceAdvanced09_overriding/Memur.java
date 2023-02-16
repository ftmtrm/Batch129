package practiceAdvanced09.practiceAdvanced09_overriding;

public class Memur extends Banka {
    @Override
    public double faizHesapla(double alinacakKredi) {

        return alinacakKredi * 10/100;
    }
}
