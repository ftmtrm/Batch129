package day30exceptions_interface;

public class CustomExceptions01 {
    public static void main(String[] args) {
        getStudentGrade(120);
        getTheNumberOfStudents(-45);

    }
    public static void getStudentGrade(int grade){
        if(grade<0 ||grade>100){
            try {
                throw new invalidStudentGradeException ("Student's grades cannot be less than zero or greater than 100");
            } catch (invalidStudentGradeException e) {
                System.out.println(e.getMessage());
            }
        }else
            System.out.println(grade);
    }
public static void getTheNumberOfStudents(int numOfStudents){
        if(numOfStudents<0){
            try {
                throw new invalidNumberException("Student number cannot be negative");
            } catch (invalidNumberException e) {
                System.err.println(e.getMessage());
            }
        }else {
            System.out.println(numOfStudents);
        }

}
}
