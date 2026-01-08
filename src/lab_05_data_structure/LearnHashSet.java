package lab_05_data_structure;

import java.util.*;

public class LearnHashSet {

    public static void main(String[] args) {
        //Pre: provide input data
        List<String> namesInputdata = List.of("Jamie","Peggy","Peggy","Tom","Mike","Adnan","Eman","Eman");

        //common methods basic HashSet no duplication
        // add(),remove(),contains(),size(),clear()
        Set<String> names = new HashSet<>(namesInputdata);
        System.out.println(names);//[Jamie, Peggy, Mike, Tom, Eman, Adnan]
        System.out.println("Size: " + names.size());//6
        String isFound = names.contains("Vovo")?"found":"not found";
        System.out.println("Finding 'Vovo' result? " + isFound);//not found

        //Want to see sorted result => use TreeSet
        Set<String> orderedNames = new TreeSet<>(names);
        System.out.println("A-Z: " + orderedNames);//[Adnan, Eman, Jamie, Mike, Peggy, Tom]

        //Want to insert faster O(1) => use LinkedHashSet
        Set<String> updateNames = new LinkedHashSet<>(names);
        updateNames.add("Coco");
        updateNames.add("Ronadol");
        System.out.println(updateNames);//[Jamie, Peggy, Mike, Tom, Eman, Adnan, Coco, Ronadol]
    }
}
