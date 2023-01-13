package day23datetimestringbuilder;

public class StringBuffer01 {
    public static void main(String[] args) {
        /*
        String olusturmak icin String Class, String Builder Class ve StringBuffer Class kullanilabilir.
        1) StringBuffer Java'nin String olusturmak icin olusturdugu ilk classtir.Java 5'de uretilmistir.
        2) StringBuffer "synchronized"dir,StringBuilder "synchronized" degildir.
        3) String Buffer "thread-safe"dir(multithread'e uygun demek), StringBuilder "thread-safe" degildir.
        4) String Buffer ve StringBuilder ikisi de mutable'dir.
        multithread ayni anda birden cok is yapmak corbayi ocaga koyup salataya baslamak gibi
        zamandan kazaniriz ancak mantikli bir siraya koymak gerekir buna 'synchronized" denir.
        salataya basladiktan sonra corba koyulmaz ilk once corba koyulur corba piserken salata yaparsak zamandan tasarruf edilir.

        Note1: immutable String lazim oldugunda String Class kullaniriz.
        Note2: Mutable String lazim oldugunda String Builder veya StringBuffer kullaniriz.
        Note3: StringBuffer "Multithread" ve "Synchronization" lazim oldugunda tercih edilir.
               StrinBuilder "Multithread" ve "Synchronization" gerekmezse tercih edilir.
         */
        StringBuffer sbf = new StringBuffer("Java");
        System.out.println(sbf);
        System.out.println(sbf.capacity());//20 16+4(java)


    }
}
