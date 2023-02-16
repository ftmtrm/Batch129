package day37Lambda_SuleymanHoca;

import day36Lambda.Utils;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Arrays;

public class Lambda02 {
    public static void main(String[] args) throws IOException {
    //1) LambdaTextFile dosyasi icindeki metni konsola yazdiran kodu yaziniz.
    Files.lines(Paths.get("src/main/java/day37Lambda_SuleymanHoca/LambdaTextFile.txt")).forEach(System.out::println);
//satir satir okuma yapar.

    //2) LambdaTextFile dosyasi icindeki her karakteri UpperCase yapiniz.
    Files.lines(Paths.get("src/main/java/day37Lambda_SuleymanHoca/LambdaTextFile.txt")).
                map(String::toUpperCase).forEach(Utils::printInTheSameLineWithSpace);

    //3) LambdaTextFile dosyasi icindeki herhangi bir kelimenin var olup olmadigini gosteren kodu yaziniz.
   boolean result1 =  Files.lines(Paths.get("src/main/java/day37Lambda_SuleymanHoca/LambdaTextFile.txt")).
            map(t->t.split(" ")).flatMap(Arrays::stream).
            anyMatch(t->t.contains("Java"));//herhangi birisi Java ise true dondurur.
        System.out.println(result1);
    //flatMap kelimeleri arraylerin icinden tek tek cikarir.

   //4) LambdaTextFile dosyasi icindeki her kelimenin "a" icerip icermedigini gosteren kodu yaziniz.
        boolean result2 =  Files.lines(Paths.get("src/main/java/day37Lambda_SuleymanHoca/LambdaTextFile.txt")).
                map(t->t.split(" ")).
                flatMap(Arrays::stream).
                allMatch(t->t.contains("a"));//her kelime icin dogru olmasi gerekir. yoksa false verir.
                 System.out.println(result2);

    //5) LambdaTextFile dosyasi icindeki hicbir kelimenin "x" icermedigini gosteren kodu yaziniz.
        boolean result3 =  Files.lines(Paths.get("src/main/java/day37Lambda_SuleymanHoca/LambdaTextFile.txt")).
                map(t->t.split(" ")).
                flatMap(Arrays::stream).
                noneMatch(t->t.contains("x"));//hicbir kelimenin x icermemesi gerekir.bu durumda true verir.
                System.out.println(result3);
    //6) LambdaTextFile dosyasi icinde "r" ile biten kelimeleri sayan kodu yaziniz.
      long result4 = Files.lines(Paths.get("src/main/java/day37Lambda_SuleymanHoca/LambdaTextFile.txt")).
                map(t->t.split(" ")).
                flatMap(Arrays::stream).filter(t->t.endsWith("r")).count();
        System.out.println(result4);
      //count yerine sona collect(Collector.toList()).size() de olur ama count tercih edilir.

    }

}
