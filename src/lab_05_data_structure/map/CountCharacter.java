package lab_05_data_structure.map;

import java.util.*;

public class CountCharacter {
    public static void main(String[] args) {
        String input_str = new String("This is an awesome occassion.This has never happened before.");
        String[] input_str_split = input_str.split("[., ]");
        Map<Character,Integer> str_in_hash_map = new HashMap<>();
        Set<Character> keys = str_in_hash_map.keySet();
        for(String str:input_str_split){
            System.out.println(str);
            //if str is not in hasmap.keys(), then add a new node (key,1)
            //else just plus 1 more into current node (key, +=val)
            List<Character> characterSet = splitWordToChars(str);
            for(Character ch:characterSet)
            {
                if(!keys.contains(ch)){
                    str_in_hash_map.put(ch,1);
                }else {
                    int val = str_in_hash_map.get(ch);
                    val +=1;
                    str_in_hash_map.put(ch,val);
                }
            }
        }
        System.out.println(str_in_hash_map);
    }

    public static List<Character> splitWordToChars(String str){
        char[] chars = str.toCharArray();
        List<Character> set_chars = new ArrayList<>();
        for(int i = 0; i<str.length(); i++)
        {
            set_chars.add(chars[i]);
        }
        return set_chars;
    }
}
