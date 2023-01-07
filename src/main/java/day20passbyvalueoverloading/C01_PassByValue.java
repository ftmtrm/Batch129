package day20passbyvalueoverloading;

public class C01_PassByValue {
    public static void main(String[] args) {
        
       /*Pass by value :Methoda value'nun bir kopyasini gonder demektir.
       variable'in icindeki degeri gonderiyor variable'in hepsini degil 
       bu nedenle pass by value'da orjinal parametre degismez.Java pass by value kullanir,
       pass by referance kullanmaz.cunku Java variable'in orjinal degerini korumak ister.
       variable'in icindeki degeri kopyalar ve methodun icerisine kopya degeri gonderir 
       deger uzerinde yapilan degisiklikler orjinal parametreyi etkilemez. 
       
       Pass by referance: Refernace kopyalananir ve methodda kullanilir.Yapilan degisiklik orjinal parametreyi etkiler 
       bu tarz programlar degeri korumak istiyorsa isi developer'a birakmistir.kendisi degeri degistirir.
        */
        
    int gomlek = 100;
        //System.out.println(gomlek);//100
        
       // ogrenciIndirimi(gomlek);
        
        System.out.println("gomlek = " + gomlek);
        gomlek = ogrenciIndirimi(gomlek);//!!methodda yaptigimiz degisikligi kalici hale getirmis oluruz bu sekilde
        System.out.println("atamadan sonra maindeki gomlek ="+ gomlek);


    }

    private static int ogrenciIndirimi(int gomlek) {
        int ogrenciGomlegi = gomlek-10;
        System.out.println("ogrenciGomlegi = " + ogrenciGomlegi);
        return ogrenciGomlegi;
        
    }
}
