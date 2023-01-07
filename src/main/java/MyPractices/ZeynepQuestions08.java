
package MyPractices;

import java.util.ArrayList;
import java.util.Scanner;
public class ZeynepQuestions08 {

static Scanner input = new Scanner(System.in);
static ArrayList<String> days = new ArrayList<>();
static ArrayList<Double>dailyIncomes = new ArrayList<>();

public static void main(String[] args) {

        grocery();
        getIncome();
        ArrayList<String> daysOfOverIncome = new ArrayList<>();
        System.out.println("Average Income: " + getAverageIncome() );
        System.out.println("Days of lower-Average Income: " +getDaysOfIncomeOverAverage(daysOfOverIncome));

        System.out.println("Days of over-Average Income: ");
        getDaysOfIncomeLowerAverage();
        }
public static void grocery(){
        days.add("Sunday");
        days.add("Monday");
        days.add("Tuesday");
        days.add("Wednesday");
        days.add("Thursday");
        days.add("Friday");
        days.add("Saturday");
        }
public static void getIncome(){

        for (int i = 0; i < days.size(); i++){
        System.out.println(" enter your income for the day of " +days.get(i) + " : " );
        double dailyIncome = input.nextDouble();
        dailyIncomes.add(dailyIncome);
        }
        }
public static double getAverageIncome(){
        double sum =0;
        for (double w : dailyIncomes){
        sum += w;
        }
        return  sum / days.size();
        }
public static ArrayList<String> getDaysOfIncomeOverAverage(ArrayList<String> liste){

        double averageIncome = getAverageIncome();
        for(int i = 0; i<days.size(); i++){
        if(dailyIncomes.get(i)> averageIncome){
        liste.add(days.get(i));
        }
        }
        return liste;
        }
public static void getDaysOfIncomeLowerAverage(){
        ArrayList<String> daysOfLowerIncome = new ArrayList<>();
        double averageIncome = getAverageIncome();
        for (int i = 0; i < days.size(); i++){
        if (dailyIncomes.get(i)< averageIncome){
        daysOfLowerIncome.add(days.get(i));
        }
        }
        System.out.println(daysOfLowerIncome);
        }
        }