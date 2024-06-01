package neet_code;

import java.util.HashSet;
import java.util.Set;

public class Q1FindDup {


    public boolean hasDuplicate(int[] nums) {

        Set<Integer> uni = new HashSet<>();

        for (int n : nums) {
            uni.add(n);
        }

        return nums.length == uni.size() ? false : true;

    }


    public static void main(String[] args) {

    }

}
