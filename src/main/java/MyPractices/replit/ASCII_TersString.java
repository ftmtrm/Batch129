package MyPractices.replit;

public class ASCII_TersString {
    public static void main(String[] args) {
        //'a'dan 'z'ye kadar olan tum karakterlerin ASCII degerlerini konsola yazdiran bir kod yazınız.

        for (int i = 'a'; i <= 'z'; i++) {

            System.out.println("The ASCII value of "+ (char) i +" = " + " "+ i );
        }
        System.out.println();
        /*Write a Java program that reverse a sentence by using Array (with all spaces and special characters).
Input  : Coding is great.   Output : .taerg si gnidoC*/
        //1.yol:arrayli cozum
        String str = "Coding is great.";
        String str2="";
        String arr[] = str.split("");
        for (int i = arr.length-1; i >=0 ; i--) {
            for (int j =arr[i].length()-1 ; j >=0; j--) {
                str2+=arr[i].substring(j,j+1);
            }

        }
        System.out.println(str2);
        //2.yol:stringli cozum
//        String tersStr = "";
//
//        for (int i = str.length()-1; i >=0 ; i--) {
//            tersStr+=str.substring(i,i+1);
//
//        }
//        System.out.println(tersStr);
        //3.yol:StringBuilderli cozum

        StringBuilder sb = new StringBuilder(str);
        String tersstr = String.valueOf(sb.reverse());
        System.out.println(tersstr);

            }
            }



