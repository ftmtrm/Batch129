package day18lists;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
public class Lists03 {

    public static void main(String[] args) {
        //******INTERVIEW QUESTION******
        //Example 1: Bir tane Integer List olusturunuz
        //           Bu List'te birbirine en yakin iki tamsayiyi yaziniz
        //           [12, 23, 9, 11, 35] ==> 12, 11

        List<Integer> nums = new ArrayList<>();
        nums.add(12);
        nums.add(13);
        nums.add(9);
        nums.add(11);
        nums.add(35);

        Collections.sort(nums);

        int minDiff = nums.get(1) - nums.get(0);

        for(int i=1; i<nums.size(); i++){
            minDiff = Math.min(minDiff, nums.get(i)-nums.get(i-1));
        }
        System.out.println(minDiff);

        for(int i=1; i<nums.size(); i++){//2.elemandan 1.elemani cikariyoruz
            // yani aslinda 2.elemandan basliyoruz o nedenle i=1 dedik.
            if(nums.get(i)-nums.get(i-1) == minDiff) {
                System.out.println(nums.get(i-1) + " and " + nums.get(i));
            }
        }
    }
}


