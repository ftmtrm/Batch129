package day27encapsulation_abstraction;

public class StudentRunner {
    public static void main(String[] args) {

        Student myStd = new Student();
        String stdId = myStd.getStdId();
        System.out.println(myStd.getStdId());//AC123 almis olduk
        //Student 1
        System.out.println(myStd.getGpa());
        System.out.println(myStd.getGpa());
        System.out.println(myStd.isPoor());

        //Student 2
        myStd.setStdId("TH123");
        myStd.setGpa(4.0);
        myStd.setPoor(false);

        System.out.println(myStd.getGpa());//4.0 setle degistirip okuyunca deger degisti 3.99du 4.0 oldu

        //Student yourStd = new Student();
        //System.out.println(yourStd.getGpa());//3.99 olur cunku biz mystd'daki gpa'yi degistirdik
    }
}
