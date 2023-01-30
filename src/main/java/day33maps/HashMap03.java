package day33maps;

import java.util.Arrays;
import java.util.HashMap;

public class HashMap03 {
    /*
    //Ex: Size verilen bir cumlede kullanilan harflerin gorunum sayisini gosteren kodu yaziniz.
    Java is Java ==> J=2 , a=4 , v = 2, i = 1, s=1
     */
    public static void main(String[] args) {
    HashMap<String,Integer> lettersMap = new HashMap<>();
    String sentence = "Java is Java";
    sentence = sentence.replaceAll("[^a-zA-Z]","");
    String [] letterArray = sentence.split("");
    System.out.println(Arrays.toString(letterArray));

        for(String w: letterArray) {
            Integer numOfOccurence = lettersMap.get(w);
            if(numOfOccurence==null){
                lettersMap.put(w,1);
            }else {
                lettersMap.replace(w,numOfOccurence+1);
            }
        }
        System.out.println(lettersMap);
        }

}
