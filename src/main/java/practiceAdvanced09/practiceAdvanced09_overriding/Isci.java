package practiceAdvanced09.practiceAdvanced09_overriding;

public class Isci extends Banka {
    @Override
    public double faizHesapla(double alinacakKredi) {
        return alinacakKredi * 15 / 100;
    }
}