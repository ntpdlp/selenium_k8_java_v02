package lab_05_data_structure.map;

import java.util.*;

public class CountWords {
    public static void main(String[] args) {
        String input_str = new String("This is an awesome occassion.This has never happened before.");
        String[] input_str_split = input_str.split("[, .]");
        Map<String,Integer> str_in_hash_map = new HashMap<>();
        Set<String> keys = str_in_hash_map.keySet();
        for(String str:input_str_split){
            System.out.println(str);
            //if str is not in hasmap.keys(), then add a new node (key,1)
            //else just plus 1 more into current node (key, +=val)
            if (!keys.contains(str)){
                str_in_hash_map.put(str,1);
            }else{
                int val = str_in_hash_map.get(str);
                val +=1;
                str_in_hash_map.put(str,val);
            }

        }
        System.out.println(str_in_hash_map);
    }
}
