package MyPractices.replit;

import java.util.Scanner;

public class sonikikarakterTekrar {
    /* Ask user for a string and print a new string made of 3 copies of the last 2 letters
     The strings length will be at least 2.*/
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Please type a name");
        String name1 = scan.nextLine();
        String name2 = "";
        if(name1.length()<2){
            System.out.println("The name length must be at least 2");
        }else
            name2 = name1.substring(name1.length()-2)+name1.substring(name1.length()-2)+name1.substring(name1.length()-2);

        System.out.println(name2);


    }
}