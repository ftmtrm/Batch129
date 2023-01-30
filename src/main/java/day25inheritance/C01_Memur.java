package day25inheritance;

public class C01_Memur extends C03_Muhasebe {//isci ile kardes "memur is a muhasebe"
    public static void main(String[] args) {

        /*Osman = Obje String gösterimini döndürür. Genel olarak, toString metodu,bu Objeyi "metinsel olarak temsil eden" bir
        String döndürür. Sonuç, bir kişinin okuması kolay,kısa ama bilgilendirici bir sunum olmalıdır.
                Tüm child classs'lar bu yöntemi Override
        önerilir. Object sınıfı için toString yöntemi,nesnenin bir örneği olduğu sınıfın adından, "@"
        işareti karakterinden ve nesnenin karma kodunun işaretsiz onaltılık gösteriminden oluşan bir String
        döndürür. Başka bir deyişle,bu yöntem o değerine eşit bir String döndürür.*/


        //personel class'i dededen aldik

        C01_Memur memur1 = new C01_Memur();
        memur1.isim = "Osman";
        memur1.soyIsim = "Sagir";
        memur1.adres = "Izmir";
        memur1.telNo = "5333564646";
        memur1.personelNo = 1001;

        memur1.calismaSaati = 8;
        memur1.saatUcreti = 20;
        memur1.statu = "Memur";
        System.out.println(memur1);


    }

    @Override
    public String toString() {
        return "C01_Memur{" +
                "saatUcreti=" + saatUcreti +
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