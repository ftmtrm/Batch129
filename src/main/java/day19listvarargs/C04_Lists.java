package day19listvarargs;

import java.util.ArrayList;
import java.util.List;

public class C04_Lists {
    public static void main(String[] args) {

// Size verilen ArrayListte 8 (inclusive-dahil) ve
// 8 den onceki tum elemanlari 2 katina cikariniz

        List<Integer> nums = new ArrayList<>();
        nums.add(1);
        nums.add(2);
        nums.add(3);
        nums.add(4);
        nums.add(5);
        nums.add(6);
        nums.add(7);
        nums.add(8);
        nums.add(9);
        nums.add(10);
        System.out.println("nums = " + nums);

        for (int i = 0; i <nums.size() ; i++) {
            if(nums.get(i)==8){
                nums.set(i,nums.get(i)*2);
                break;
        }

        }
        System.out.println("Degistirilmis list "+nums);
    }
}
