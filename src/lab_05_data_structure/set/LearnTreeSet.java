package lab_05_data_structure.set;

import java.util.Set;
import java.util.TreeSet;

public class LearnTreeSet {
    public static void main(String[] args) {
        TreeSet<Integer> nums = new TreeSet<>(Set.of(25,30,5,14,18,20,45));
        System.out.println(nums); //sorted [5, 14, 18, 20, 25, 30, 45]
        System.out.println(nums.floor(20));//20
        System.out.println(nums.floor(19));//18
        System.out.println(nums.lower(19));//18
        System.out.println(nums.lower(18));//14

        System.out.println(nums.ceiling(20));//20
        System.out.println(nums.ceiling(19));//20
        System.out.println(nums.higher(19));//20
        System.out.println(nums.higher(18));//20

        //subset
        System.out.println(nums.subSet(14,30));//[14,18, 20, 25] include lower, not include upper boundary 30

    }
}
