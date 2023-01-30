package day27encapsulation_abstraction;

public abstract class Courses {

    public abstract void math();//math mecburi ders art secmeli ders//yandaki i==>IMPLEMENT demek

    public void art() {//concrete methodlar OVERRIDE edilir//yandaki o==>OVERRIDE

        System.out.println("painting");
    }
   // public abstract void science();
}
