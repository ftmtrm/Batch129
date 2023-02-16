package day36Lambda;

public class Utils {    //Utils-->lazim olcak methodlarin depolandigi yer

public static int getLengthSquare(String s){

            return s.length()*s.length();
        }
public static boolean islengthEven(String s){
            return s.length()%2==0;
        }
public static String getlastChar(String s){
            return s.substring(s.length()-1);
        }
public static void printInTheSameLineWithSpace(Object obj) {
    System.out.println(obj + " ");

}
public static int getSumOfDigits(int x){
    int sum = 0;
    while(x!=0){
       sum=sum+ x%10;
       x/=10;
    }
    return sum;

    }
    }


