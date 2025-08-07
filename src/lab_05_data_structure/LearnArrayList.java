package lab_05_data_structure;

import java.util.*;

public class LearnArrayList {

    public static void main(String[] args) {

        ArrayList<Integer> myNums = new ArrayList<>();

        //common methods: add(),get(),set(),remove(),size()
        //use index or iterator to loop through elements
        myNums.add(1);
        myNums.add(5);
        myNums.add(8);
        myNums.add(9);
        System.out.println("size at initial: " + myNums.size()); //4
        System.out.println(myNums);

        Integer myChoice = myNums.get(1); //get(index) >> 5
        myNums.set(1,50); //set(index,value)
        System.out.println("update value at 1 position, old value: " + myChoice); //5
        System.out.println(myNums);

        myNums.remove(0); // remove(index)
        System.out.println("size after removing first element: " + myNums.size()); //3
        System.out.println(myNums);


        //loop through elements by using index loop
        int myNumsSize = myNums.size();
        for (int index = 0; index < myNumsSize; index++) {
            System.out.print(myNums.get(index) + "\t");
        }
        System.out.println("\r\n------------------");

        //loop through elements by using Iterator
        Iterator<Integer> iterMyNums = myNums.iterator();
        while(iterMyNums.hasNext()){
            System.out.print(iterMyNums.next() + "\t");
        }
        System.out.println("\r\n------------------");


        //sort
        List<String> names = new ArrayList<>();
        names.add("Jamie");
        names.add("Peggy");
        names.add("Tom");
        names.add("Adnan");
        names.add("Vovo");
        System.out.println("Before: " + names);
        Collections.sort(names);
        System.out.println("After sorting: " + names);

        Collections.sort(names,Collections.reverseOrder());
        System.out.println("Reverse Order sorting: " + names);


    }
}
