package day36Lambda;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class Lambda03_SuleymanHoca {

    public static void main(String[] args) {
        List<Double> myList = new ArrayList<>();
        myList.add(12.0);
        myList.add(4.0);
        myList.add(7.0);
        myList.add(3.6);
        myList.add(26.8);
        myList.add(38.4);
        myList.add(26.8);
        List<Double> half = getHalfOfElementsGreaterThanFiveDistinctReversed(myList);
        System.out.println(half);

        List<String> list = new ArrayList<>();
        list.add("Tom");
        list.add("Jhon");
        list.add("Ajda");
        list.add("Angelina");
        list.add("Tom");
        list.add("Brad");
        list.add("Cuneyt");
        printAllAlphabeticallyUpperDistinct(list);
        System.out.println();
        printAllAlphabeticallyLowerDistinct(list);
        System.out.println();
        printAllSortWithLenghtUpperDistinct(list);
        System.out.println();
        printAllSortWithLastCharUpperDistinct1(list);
        System.out.println();
        printAllSortWithLastCharUpperDistinct2(list);
        System.out.println();
        printAllSortWithLenghtUpperDistinctSameLenghtsInAlphabeticalOrder(list);
        System.out.println();
        removeElementIfTheLengthGreaterThanFive(list);
        System.out.println();
        System.out.println(removeElementIfStartsWithAorEndsWithd(list));
        System.out.println();
        System.out.println(printLengthSquare(list));
        System.out.println();
        System.out.println(printElementsLengthEven(list));

    }

    //1) Create a method to find the half of the elements greater than 5, distinct, in reverse order in a list.
    public static List<Double> getHalfOfElementsGreaterThanFiveDistinctReversed(List<Double> myList) {
        return myList.stream().distinct().filter(t -> t > 5).map(t -> t / 2).sorted(Comparator.reverseOrder()).collect(Collectors.toList());
    }

    //2) Tum list elemanlarini buyuk harfle alfabetik sirada tekrarsiz olarak yazdiriniz.
    public static void printAllAlphabeticallyUpperDistinct(List<String> list) {
        list.stream().distinct().map(t -> t.toUpperCase()).sorted().forEach(t -> System.out.print(t + " "));
    }

    //3)Tum list elemanlarini kucuk harfle alfabetik siranin tersinde tekrarsiz olarak yazdiriniz.
    public static void printAllAlphabeticallyLowerDistinct(List<String> list) {
        list.stream().distinct().map(t -> t.toLowerCase()).sorted(Comparator.reverseOrder()).forEach(t -> System.out.print(t + " "));
    }

    //4) Tum list elemanlarini buyuk harfle uzunluklarina gore artan sirada tekrarsiz olarak yazdiriniz.
    public static void printAllSortWithLenghtUpperDistinct(List<String> list) {
        list.stream().distinct().map(t -> t.toUpperCase()).sorted(Comparator.comparing(t -> t.length())).forEach(t -> System.out.print(t + " "));
    }

    //5) Tum list elemanlarini buyuk harfle son harflerine gore artan sirada tekrarsiz olarak yazdiriniz.
    public static void printAllSortWithLastCharUpperDistinct1(List<String> list) {
        list.stream().distinct().map(t -> t.toUpperCase()).sorted(Comparator.comparing(t -> t.charAt(t.length() - 1))).
                forEach(t -> System.out.print(t + " "));
//t -> t.charAt(t.length()-1)) ifadesi lambda expression olarak adlandirilir.ya bu ya da method reference kullanilir.
//ancak method reference tercih edilmelidir.
    }
    public static void printAllSortWithLastCharUpperDistinct2(List<String> list) {//azalan sirada
        list.stream().distinct().map(String::toUpperCase).sorted(Comparator.comparing(Utils::getlastChar).reversed()).
                forEach(Utils::printInTheSameLineWithSpace);//ozel durumdur utils'e koyulabilir java buna method uretmez
    }
    //6) Tum list elemanlarini buyuk harfle uzunluklarina gore artan sirada tekrarsiz olarak yazdiriniz.
    public static void printAllSortWithLenghtUpperDistinctSameLenghtsInAlphabeticalOrder(List<String> list) {
        list.stream().distinct().
                map(t -> t.toUpperCase()).//map(String::UpperCase)yazilmali method referance'a gore
                sorted(Comparator.comparing(String::length).thenComparing(Comparator.naturalOrder())).
                forEach(System.out::println);
    }
//method referance class'in icindeki methodu adresle demek(String::lenght)tarzi yapilara method referance denir.
// Anlamı: String class daki lenght metodu kullan diyoruz.
    //7) Karakter sayisi 5'den fazla olan elemanlari siliniz ve sonucu list olarak yazdiriniz.

        public static List<String>removeElementIfTheLengthGreaterThanFive (List<String>list){
        list.removeIf(t->t.length()>5);
        //stream bazi methodlari gorunmez yapar o nedenle mesela removeif kullanmak icin stream kullanmadik!!
        return list;
    }
    //8) "A" ile baslayan veya "d" ile biten elemanlari siliniz.
    public static List<String> removeElementIfStartsWithAorEndsWithd(List<String> list) {
        list.removeIf(t -> t.startsWith("A") || t.endsWith("d"));
        //stream bazi methodlari gorunmez yapar o nedenle mesela removeif kullanmak icin stream kullanmadik!!
        //bazi methodlari kullanmamiza engel oldugu icin stream() methodunu kullanmayiz.ancak sonradan stream methodunu
        //kullanarak istedigimiz methodlara ulasiriz, distinct methoduna ulastigimiz gibi.
        //Sonuc bize list olarak lazimsa "collect(Collectors.toList()" ile sonucu list'e ceviririz.
        return list;//return list.stream().distinct().collect(Collectors.toList());
    }

    //9) List elemanlarinin karakter sayilarini aliniz ve bir list olarak ekrana yazdiriniz.
    public static List<Integer> printLengthSquare(List<String> list) {
        return list.stream().map(Utils::getLengthSquare).collect(Collectors.toList());
        //Lambda expression'dan kurtulmanin bir yolu da kendi methodumuzu Utils class'dan cagirarak kullanmaktir
        //burda onu yaptik utils class'tan getirdik
    }
    //10) List elemanlarindan karakter sayisi cift sayi olanlari bir list icinde ekrana yazdiriniz.
     public static List<String>printElementsLengthEven (List<String> list){
     return  list.stream().filter(Utils::islengthEven).collect(Collectors.toList());//filter'in icini
         //t->t.length%2==0 yazinca da aynisi olur. ama utils classtan kullanmak daha iyidir.yani
        // method reference'lari utils class'tan kullanmak uygundur.tekrarli kullanilcak methodlari Utils class'a
         //koymak cok mantiklidir.

    }
}