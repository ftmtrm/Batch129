package day18arraylist;

import java.util.ArrayList;


public class C01_ArrayList {

    public static <List> void main(String[] args) {

        // 1) ArrayList nasil olusturulur?

        ArrayList<Integer> nums = new ArrayList<>();

        // 2) Arraylist'ler nasil yazdirilir?

        System.out.println(nums);//[] goruruz
        nums.add(37);
        nums.add(38);
        nums.add(39);
        nums.add(40);
        nums.add(41);
        nums.add(42);
        System.out.println("nums = " + nums);

        // 3) ArrayList'in bos olup olmadigini nasil anlariz?

        boolean bosMu1 = nums.isEmpty();
        System.out.println("bosMu1 = " + bosMu1);//false

        ArrayList<Integer> ages = new ArrayList<>();
        boolean bosMu2 = ages.isEmpty();
        System.out.println("bosMu2 = " + bosMu2);//true

        //Example 1: nums ArrayList'indeki tum tek sayilari 11
        // artirdiktan sonra ekrana yazdiriniz
        // nums = [37,38,39,40,41,42]

        for (Integer w : nums) {
            if(w%2!=0){
                nums.set(nums.indexOf(w), w+11);
        }

        }
        System.out.println("nums = " + nums);

        // 4) List'ten eleman nasil silinir?'
        //nums listinden 52 rakaminin ilk gorunumunu siliniz.

        nums.add(52);
        nums.add(36);
        nums.add(52);
        System.out.println(nums);
        //        remove() methodunun icerisine tamsayi yazarsaniz
        //        Java bunu index kabul eder.Silinecek eleman olarak algilamaz
        //        Tum tamsayilar aksi belirtilmedikce primitive int 'dir
        //        Primitive Data Type'lari da ArrayList'lerin elemani olamazlar
        //        Primitive Data Type'larini Wrapper class'a cevirmeliyiz

        System.out.println("nums = " + nums);
        Integer sayi = 52;//num.remove(52)yazamayiz.52yi index olarak algiliyo cunku.o nedenle wrapper classa atadik.
        nums.remove(sayi);
        System.out.println(nums);

        ArrayList<String> names  = new ArrayList<>();
        names.add("Tom");
        names.add("Thomas");
        names.add("Tahsin");
        names.add("Trump");
        names.add("Taceddin");

        System.out.println("names = " + names); //names = [Tom, Thomas, Tahsin, Trump, Taceddin]
        ArrayList<String> emekliOlacaklar = new ArrayList<>();
        emekliOlacaklar.add("Thomas");
        emekliOlacaklar.add("Tahsin");
        emekliOlacaklar.add("Trump");
        names.removeAll(emekliOlacaklar);

        System.out.println("emekliOlacaklar = " + emekliOlacaklar);//emekliOlacaklar = [Thomas, Tahsin, Trump]
        System.out.println("names = " + names);  //names = [Tom, Taceddin]

        ArrayList<String> a = new ArrayList<>();
        a.add("Shoes");
        a.add("TV");
        a.add("Radio");
        a.add("Laptop");
        a.add("Shoes");
        a.add("Book");
        a.add("Shoes");
        System.out.println("a = " + a);
        a.remove("Shoes");
        System.out.println("a = " + a);//ilk gordugu "shoes"u sildi.

        // 5) ArrayList'ten coklu datanin olup olmadigini nasil kontrol ederiz?
        // containsAll(): Bir listin icinde coklu elemanin olup olmadigini kontrol eder
        //hepsi varsa true en az bir tanesi yoksa false verir.

        ArrayList<String> myNames  = new ArrayList<>();
        myNames.add("Burcu");
        myNames.add("Can");
        myNames.add("Zisan");
        myNames.add("Emre");
        myNames.add("Bilal");
        myNames.add("Gul");
        System.out.println("myNames = " + myNames);

        ArrayList<String> varMi  = new ArrayList<>();
        varMi.add("Burcu");
        varMi.add("Gul");
        varMi.add("Can");

        boolean sonuc = myNames.containsAll(varMi);
        System.out.println("sonuc = " + sonuc);



        }



}
