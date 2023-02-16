package day35Lambda_SuleymanHoca;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Lambda01 {
    /*
    1) Lambda "Functional programming"dir, digeri Structured Programming'dir.(geleneksel yontem)
    "Functional programming" hizli ve hatasiz calisir
    2) "Functional programming" ne yapmak gerekir(What to do) ile ilgilenir nasil yapmak gerekir(how to do)
     ile ilgilenmez.
    3) "Functional programming" Collection'larda ve Array'lerde kullanilir.
    4) Lambda Java'ya Java 8'de eklendi.
     */
    public static void main(String[] args) {
        List<Integer> nums = new ArrayList<Integer>();
        nums.add(12);
        nums.add(9);
        nums.add(131);
        nums.add(14);
        nums.add(9);
        nums.add(10);
        nums.add(4);
        nums.add(12);
        nums.add(15);
        printElements1(nums);
        System.out.println();
        printElements2(nums);
        System.out.println();
        printEvenElements1(nums);
        System.out.println();
        printEvenElements2(nums);
        System.out.println();
        printSquareOfOddElements(nums);
        System.out.println();
        printCubeOfDistinctElements(nums);
        System.out.println();
        printSumOfSquareOfDistinctEvenElements(nums);

        printProductOfSquaresOfDistinctEvenElements(nums);

        getMaxValue(nums);

        getMaxValue1(nums);

        getMaxValue2(nums);

        getMinValue(nums);

        getMinValue1( nums);

        getMinValue2(nums);

        getMinGreaterThanSevenEven(nums);

//1)Create a method to print the list elements on the console in the same line with a space
// between two consecutive elements.(Structured)
    }

    public static void printElements1(List<Integer> nums) {//Structured programming
        for (Integer w : nums) {
            System.out.print(w + " ");
        }
    }
    //2)Create a method to print the list elements on the console in the same line with a space
// between two consecutive elements.(Functional)
    public static void printElements2(List<Integer> nums) {//"Functional programming"

        nums.stream().forEach(t -> System.out.print(t + " "));
    }
//stream: yukardan asagiya akis demektir. elemanlari altalta dizer."Lambda" list'i "stream" e cevirir öyle calisir
//forEach() methodu stream deki elemanlarin herbiri icin  yazdirma islemi yapar.

    //3)Create a method to print the even list elements on the console in the same line
// with a space between two consecutive elements.(Structured)
    public static void printEvenElements1(List<Integer> nums) {//Structured programming
        for (Integer w : nums) {
            if (w % 2 == 0) {
                System.out.print(w + " ");
            }
        }
    }

    //4)Create a method to print the even list elements on the console in the same line
// with a space between two consecutive elements.(Functional)
    public static void printEvenElements2(List<Integer> nums) {//Functional
        nums.
                stream().
                filter(t -> t % 2 == 0).
                forEach(t -> System.out.print(t + " "));

        //"filter()" methodu  filtrelemek icin kullanilir.yani ustteki soruda cift sayilari ayirmak icin kullandik.
    }

    //5)Create a method to print the square of odd list elements on the console in the same line
// with a space between two consecutive elements.(Functional)
    public static void printSquareOfOddElements(List<Integer> nums) {
        nums.stream().filter(t -> t % 2 != 0).map(t -> t * t).forEach(t -> System.out.print(t + " "));

        //map var olan elemani degistirmek icin kullanilir.
    }

    //6)Create a method to print the "cube" of "distinct" "odd" list elements on the console in the same line with a space between two consecutive elements.
    //Bir list'teki "tek sayi" olan elemanlarin "kup"lerini tekrarsiz olarak ayni satirda aralarina bosluk koyarak yazdiran method'u olusturunuz.(Functional)
    public static void printCubeOfDistinctElements(List<Integer> nums) {
        nums.
                stream().
                distinct().
                filter(t -> t % 2 != 0).
                map(t -> t * t * t).
                forEach(t -> System.out.print(t + " "));
        //"distinct method" u tekrarli elemanlari sadece bir kere gosterir ve tekrarsizlari olduklari kadar gosterir.
        // distinct() methodunun ve diger methodlarin yeri degistirilebilir distinct() methodu filter'dan
// onceye koymak daha mantiklidir.
// sonraki islemleri daha az elemanla yapacagi icin Java'yi daha az yorar daha hizli calisir.
    }

    //7)Create a method to calculate the "sum" of the "squares" of "distinct" "even" elements
    public static void printSumOfSquareOfDistinctEvenElements(List<Integer> nums) {
        Integer sum = nums.stream().distinct().filter(t -> t % 2 == 0).map(t -> t * t).reduce(0, (t, u) -> t + u);
        System.out.println(sum);

        //reduce() methodu kullanildiginda cok sayidaki deger bir tane degere donusmus olur.(sum gibi)
        // Orn; reduce(0,(t,u)->t+u) ==> "t" ilk degeri "sifir" dan alir, daha sonraki degerleri toplamanin sonucundan alir.
        // "u" ise degerlerini her zaman "stream" den alir
    }

    //8)Create a method to calculate the "product" of the "square" of "distinct" "even" elements
    public static void printProductOfSquaresOfDistinctEvenElements(List<Integer> nums) {
        Integer product = nums.stream().distinct().filter(t -> t % 2 == 0).map(t -> t * t).reduce(1, (t, u) -> t * u);
        System.out.println(product);
    }

    //9)Create a method to find the "maximum value" from the list elements
    //1.yol:
    public static void getMaxValue(List<Integer> nums) {
        Integer max = nums.stream().distinct().reduce(Integer.MIN_VALUE, (t, u) -> t > u ? t : u);
        System.out.println(max);
        //Max.degeri ararken Integer.MIN_VALUE kullanmak genel pratiktir.Min degeri ararken
        //Integer.MAX_VALUE kullanmak genel pratiktir.
    }

    //2.yol:"not recommend" nums.get(0) Java'ya daha cok is yaptirir.
    public static void getMaxValue1(List<Integer> nums) {
        Integer max = nums.stream().distinct().reduce(nums.get(0), (t, u) -> t > u ? t : u);
        System.out.println(max);
    }

    //3.yol:
    public static void getMaxValue2(List<Integer> nums) {
        Integer max = nums.stream().distinct().sorted().reduce((t, u) -> u).get();
        System.out.println(max);
        //get() methodu optional integer data tipini integer'a cevirir.
    }
    //10)Create a method to find the minimum value from the list elements
    //1.yol:
    public static void getMinValue(List<Integer> nums) {
        Integer min = nums.stream().distinct().sorted(Comparator.reverseOrder()).reduce((t, u) -> u).get();
        System.out.println(min);
    }
    //2.yol:
    public static void getMinValue1(List<Integer> nums) {
        Integer min = nums.stream().distinct().reduce((t, u) -> t > u ? u : t).get();
        System.out.println(min);
    }
   //3.yol:
   public static void getMinValue2(List<Integer> nums) {
       Integer min = nums.stream().distinct().reduce((t, u) ->Math.min(t,u)).get();
       System.out.println(min);
 }
 //11) Create a method to find the minumum value which is greater than 7 and even from the list
 public static void getMinGreaterThanSevenEven(List<Integer> nums) {
     Integer min = nums.stream().filter(t -> t > 7 && t % 2 == 0).sorted().reduce((t, u) -> t).get();
     System.out.println(min);
 }

}
