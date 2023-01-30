package MyPractices.replit;

import java.util.Scanner;

public class EvenOdd {
    /*Create 2 words : name1 and name2
if the name1 has even numbers of characters,then insert the second word in the middle of the first name
if the first word has odd numbers Then print the “Name2 cannot be inserted in the name1”
name1= mehmet  name2= ahmet    Print ==> mehahmetmet*/
    public static void main(String[] args) {
    Scanner scan = new Scanner (System.in);
        System.out.println("Please type a name");
        String name1 = scan.nextLine();
        System.out.println("Please type an another name");
        String name2 = scan.nextLine();

        if(name1.length()%2==0){
            System.out.println(name1.substring(0,name1.length()/2)+name2+name1.substring((name1.length()/2)));;
        }else
            System.out.println("Name2 cannot be inserted in the name1");

    }


}
