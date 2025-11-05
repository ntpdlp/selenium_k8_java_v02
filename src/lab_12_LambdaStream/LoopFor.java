package lab_12_LambdaStream;

import java.util.List;

public class LoopFor {
    public static void main(String[] args) {
        List<Integer> nums = List.of(1,2,3,4,5);
        String output = "";
        for(Integer num: nums){
            output += nums + "\n";
        }
        System.out.println(output);


        //for each
        nums.forEach(num -> System.out.println(num));
    }
}
