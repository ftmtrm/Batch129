package day27encapsulation_abstraction;

public class Student {
    private String stdId = "AC123";
    private double gpa = 3.99;
    private boolean poor = true;


    public String getStdId() {
        return stdId;
    }
    public double getGpa() {
        return gpa;
    }
    public boolean isPoor() {
        return poor;
    }

    public void setStdId(String stdId) {
        this.stdId = stdId;
    }

    public void setGpa(double gpa) {
        this.gpa = gpa;
    }

    public void setPoor(boolean poor) {
        this.poor = poor;
    }


   }


