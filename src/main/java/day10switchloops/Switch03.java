package day10switchloops;

import java.util.Scanner;

public class Switch03 {
    public static void main(String[] args) {
        //Ask user to enter country name among
        // "Amerika, England, Germany, Turkey, India, Peru, Spain, Bulgaria,Albania,France" type code to print abbreviation of the countries
        //"US,UK,DE,TR,IN,PE,ES,BG,AL,FR"
        //Ex: Kullanicidan bir ulke ismi aliniz.Alinan ulke adina gore kisaltmalari yazdiriniz.

        Scanner input = new Scanner(System.in);
        System.out.println("Ulke adini giriniz...");
        String countryName = input.nextLine();
        //nextline().toUpperCase de yazilabilirdi.ancak switch'in icinde yapmak daha dogrudur
        switch (countryName.toLowerCase()){
            case "amerika":
                System.out.println("US");
                break;
            case "england":
                System.out.println("UK");
                break;
            case "germany":
                System.out.println("DE");
                break;
            case "turkey":
                System.out.println("TR");
                break;
            case "india":
                System.out.println("IN");
                break;
            case "peru":
                System.out.println("PE");
                break;
            case "spain":
                System.out.println("ES");
                break;
            case "bulgaria":
                System.out.println("BG");
                break;
            case "albania":
                System.out.println("AL");
                break;
            case "france":
                System.out.println("FR");
                break;
            default:
                System.out.println("Bu ulke tanimli degil");

        }
    }
}
