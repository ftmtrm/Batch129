package practiceAdvanced11.abstraction_alanhesaplama.abstraction_alanhesaplama;

public class AbstractionRunner {

    //Dikdörtgen ve üçgenin alanlarını hesaplayan bir kod yazınız.(abstraction kullanın)
    public static void main(String[] args) {

        Dikdortgen dikdortgen = new Dikdortgen();
        System.out.println(dikdortgen.alanHesapla(5, 4));

        Ucgen ucgen = new Ucgen();
        System.out.println(ucgen.alanHesapla(5, 4));

            }
        }


