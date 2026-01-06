package lab_05_data_structure;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ArrayListModification {
    public static void main(String[] args) {
        /*
        //PROBLEM:
        //Exception: ImmutableCollections if creating by List.of and then trying to modify
        List<String> fruits = List.of("Banana","Grape","Avocado");
        System.out.println(fruits.stream().toList());
        for(int index = 0; index<fruits.size(); index++){
            if(fruits.get(index).equals("Banana")){
                fruits.remove("Banana");
            }
        }
        */

        //SOLUTION: Need to create new ArrayList so you can modify
        // loop by for => OK
        // loop by for enhanced => Running Exception Error ConcurrentModificationException
        // [BEST PRACTICE to modify an ArrayList] loop by iterator => OK

        List<String> inputFruits = List.of("Banana", "Grape", "BananaBrazil", "Avocado", "BananaFlorida");
        List<String> fruits = new ArrayList<>(inputFruits);
        System.out.println("Before: " + fruits.stream().toList());
        Iterator<String> iteratorFruits = fruits.iterator();
        while (iteratorFruits.hasNext()) {
            String curentFruit = iteratorFruits.next();
            if (curentFruit.contains("Banana")) {
                iteratorFruits.remove();
            }
        }
        System.out.println("After removing: " + fruits.stream().toList());

    }
}