package lab_12_generic.customNumber;

import lab_12_generic.customList.MyCustomList;

public class TestMyNumberList {
    public static void main(String[] args) {
        MyCustomList<Integer> numInt = new MyCustomList<>();
        numInt.addElement(5);
        numInt.addElement(6);
        System.out.println(numInt);

        MyCustomList<Long> numLong = new MyCustomList<>();
        numLong.addElement(500l);
        numLong.addElement(600l);
        System.out.println(numLong);
    }
}
