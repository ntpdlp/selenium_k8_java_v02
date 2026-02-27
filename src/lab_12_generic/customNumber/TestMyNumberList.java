package lab_12_generic.customNumber;

import lab_12_generic.customList.MyCustomList;

import java.util.ArrayList;
import java.util.List;

public class TestMyNumberList {

    //upper bound => general design purpose
    static double sumOfNumberInList(List<? extends Number> list)
    {
        double sum = 0.0;
        for(Number n:list){
            sum += n.doubleValue();
        }
        return sum;
    }


    //lower bound => specific all sub-classes
    static void addCoupleSubClassOfValues(List<? super Number> list)
    {
        list.add(1); //int
        list.add(1.1f); //float
        list.add(100l); //long

    }

    public static void main(String[] args) {
        MyCustomList<Integer> numInt = new MyCustomList<>();
        numInt.addElement(5);
        numInt.addElement(6);
        System.out.println(numInt);

        MyCustomList<Long> numLong = new MyCustomList<>();
        numLong.addElement(500l);
        numLong.addElement(600l);
        System.out.println(numLong);

        ArrayList<Integer> myInts = new ArrayList<>(List.of(1,2,3,4,5));
        System.out.println(sumOfNumberInList(myInts));
    }


}
