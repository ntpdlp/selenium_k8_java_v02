package lab_05_data_structure;

import java.util.HashSet;
import java.util.Iterator;

public class LearnHashSet {

    public static void main(String[] args) {

        //common methods set: add(),remove(),contains(),size(),clear()
        HashSet<String> names = new HashSet<>();
        names.add("Jamie");
        names.add("Peggy");
        names.add("Tom");
        names.add("Adnan");
        names.add("Vovo");
        System.out.println(names);
        if (names.contains("Vovo")){
            names.remove("Vovo");
        }

        System.out.println("Size after removing : " + names.size());//4

        for (String name : names) {
            System.out.println(name);
        }
        System.out.println("-----------------------");

        //Iterator
        Iterator<String> iternames = names.iterator();
        while(iternames.hasNext()){
            System.out.println(iternames.next());
        }
    }
}
