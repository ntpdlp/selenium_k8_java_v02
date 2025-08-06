package lab_02_Operator;

import java.util.StringJoiner;

public class HW_Prob06_RemoveDups {

    public static void main(String[] args) {
        String[] inputStrs = new String[] {"horse","dog","cat","dog","horse"};
        int inputSize = inputStrs.length;
        String[] output = new String[inputSize];



        //buoc1: xu ly duplicated input thanh NULL
        for (int index = 0; index < inputStrs.length; index++) {
            String temp = inputStrs[index];
            int j = index+1;
            while(j<inputStrs.length){
                String nextStr = inputStrs[j];
                if(nextStr.equals(temp)){
                    inputStrs[j] = "null";

                }
                j++;

            }
        }


        //buoc2: tinh lai capacity cua nhung phan tu khac NULL
        int capacity = 0;
        for (String inputStr : inputStrs) {
            System.out.println(inputStr);
            if (!inputStr.equals("null")) capacity++;
        }
        System.out.println(capacity);


        //buoc3: tao 1 mang string moi, luu tru nhung phan tu final
        String[] outputStr = new String[capacity];
        int index = 0;
        for (String inputStr : inputStrs) {
            if (!inputStr.equals("null")){
                outputStr[index++] = inputStr;
            }

        }

        System.out.println("output ========================");
        for (String s : outputStr) {
            System.out.println(s);
        }
    }
}
