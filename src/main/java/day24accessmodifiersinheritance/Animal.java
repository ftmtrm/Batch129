package day24accessmodifiersinheritance;

public class Animal {//parent class

    //parent'taki method ve variable'lari child'lerin kullanabilmesine inheritance denir.
    //ancak parent child classindaki hicbirseyi kullanamaz.Java'da cocuklar parent'i secer

    protected void eat(){
        System.out.println("Animals eat");
    }
    public void drink(){
        System.out.println("Animals drink");
    }

    void breath(){
        System.out.println("Animals breath");
    }//private yaparsak nefes al methodunu cocuklar goremez
    // bu nedenle mavis.breath kartopu.breath kullanilamaz.
    //default yaparsak ayni package'daki cocuklar da kullanabilir sorun olmaz
    //ama diger package'daki maymus.breath calismaz



}
