package day25inheritance;

public class C02_Isci extends C03_Muhasebe{//memur ile kardes

    protected String isciStatu = "surekli isci";

    protected void mesai() {
            System.out.println("Isciler her cagrildiklarinda" + " haftada " + " 5 gun calisir");
        }
    public static void main(String[] args) {
        C02_Isci isci1 = new C02_Isci();
        isci1.isim = "Ebubekir";
        isci1.soyIsim = "Can";
        isci1.adres = "Istanbul";
        isci1.telNo = "76125893";
        isci1.personelNo = 2000;

        isci1.calismaSaati = 7;
        isci1.saatUcreti = 30;
        isci1.isciStatu = "Dev";

        System.out.println(isci1);
    }

    @Override
    public String toString() {
        return "C02_Isci{" +
                "isciStatu='" + isciStatu + '\'' +
                ", saatUcreti=" + saatUcreti +
                ", statu='" + statu + '\'' +
                ", calismaSaati=" + calismaSaati +
                ", isim='" + isim + '\'' +
                ", soyIsim='" + soyIsim + '\'' +
                ", adres='" + adres + '\'' +
                ", telNo='" + telNo + '\'' +
                ", personelNo=" + personelNo +
                '}';
    }
}



