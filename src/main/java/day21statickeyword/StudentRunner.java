package day21statickeyword;

public class StudentRunner {
    public static void main(String[] args) {
        //stdName statik oldugundan ona ulasmak icin obje olusturmaya gerek yoktur
        // sadece class ismini kullanmak yeterlidir.
        //age non-static oldugundan ona ulasmak icin object olusturmak zorundayiz.

        System.out.println(Student.stdName);
        Student std1 = new Student();
        System.out.println(std1.age);
        Student std2 = new Student();

        String initials = Student.getInitials("Tom Cruise");
        System.out.println(initials);//TC
        int vowels = std1.countVowels("Tom Cruise");
        System.out.println(vowels);//4

        String s= std1.getInitials("Ali Can");
        //gereksiz olur static method olanlari objeyle cagirmak tavsiye edilmez.

    }
}
