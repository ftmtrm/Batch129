package day26overriding;

public class Cat extends Mammal{
    public void meow(){
        System.out.println("Cats meow");
    }

    //@ ile baslayan kisma override annotation'i denir.methodun ustune koyarsak
    // Java override'in kurallarina uygun yapilip yapilmadigini kontrol eder.
    //parantez icine bisey konulamaz,methodun ismi de degistirilemez
    @Override
    public void eat() {
        System.out.println("Cats eat");
    }

    @Override
    public void drink() {
        System.out.println("Cats drink");//"cats drink" yazcak biz degistirdik "Animal drink" yerine
    }

    @Override
    public Cat create() {
        return new Cat();
    }

    @Override
    public int add(int a, int b) {//int'i long yaptik kabul etmedi
        return a+b;
    }

    @Override
    public Integer multiply(int a, int b) {//long yapamiyoruz cunku Long Integer'in parent'i degil o nedenle degistirilemez
        return a*b;
    }
}
