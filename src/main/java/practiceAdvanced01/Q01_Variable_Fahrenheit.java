package practiceAdvanced01;

import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;
import java.util.Scanner;

public class Q01_Variable_Fahrenheit {
    public static void main(String[] args) {
        //Fahrenheit degeri, Celcius degere ceviren kodu yaziniz
        //formul:c = (f-32)*5/9

        Scanner input = new Scanner(System.in);
        System.out.println("Fahrenheit degeri giriniz");
        double f = input.nextDouble();
        double c = (f-32)*5/9;
        System.out.println("Celcius: "+c);

        DecimalFormat format = new DecimalFormat(".00");//0.00 seklinde de yazilabilir
        String formattedCelcius = format.format(c);
        System.out.println("formattedCelcius= "+ formattedCelcius);

        System.out.printf("Formatli: "+ "%.3f",c);//virgulden sonraki 3 basamakla yazdirir.




    }
}
