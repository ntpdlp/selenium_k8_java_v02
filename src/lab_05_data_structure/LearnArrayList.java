package lab_05_data_structure;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class LearnArrayList {

    public static void main(String[] args) {
        ArrayList<Integer> myNums = new ArrayList<>();

        //common methods: add(),get(),set(),remove(),size()
        myNums.add(1);
        myNums.add(5);
        myNums.add(8);
        myNums.add(9);
        System.out.println("size at initial: " + myNums.size()); //4
        System.out.println(myNums);
        Integer myChoice = myNums.get(1); //get(index) >> 5
        myNums.set(1, 50); //set(index,value)
        System.out.println("update value at 1 position, old value: " + myChoice); //5
        System.out.println(myNums);
        myNums.remove(0); // remove(index)
        System.out.println("size after removing first element: " + myNums.size()); //3
        System.out.println(myNums);

        //3 ways to loop through an arrayList elements
        // 01: by using loop with for
        // 02: by using loop with for enhanced
        // 03: iterator
        for (int index = 0; index < myNums.size(); index++) {
            System.out.print(myNums.get(index) + "\t");
        }
        System.out.println("\r\n------------------");

        for (Integer num : myNums) {
            System.out.print(num + "\t");
        }
        System.out.println("\r\n------------------");

        Iterator<Integer> iterMyNums = myNums.iterator();
        while (iterMyNums.hasNext()) {
            System.out.print(iterMyNums.next() + "\t");
        }
        System.out.println("\r\n------------------");

        //sort
        List<String> inputNames = List.of("Jamie", "Peggy", "Tom", "Vovo", "Mike");
        List<String> names = new ArrayList<>(inputNames);
        System.out.println("Original list: " + names);
        Collections.sort(names);
        System.out.println("After sorting: " + names);
        Collections.sort(names, Collections.reverseOrder());
        System.out.println("Reverse Order sorting: " + names);
    }
}
