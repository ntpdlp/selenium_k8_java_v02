package lab_05_data_structure.map;

import java.util.HashMap;
import java.util.Map;

public class LearnHashMap {

    public static void main(String[] args) {

        //Map common methods: put(),get(),remove(),containsKey(),keySet()
        Map<String,String> moneytaries = new HashMap<>();
        moneytaries.put("Vietname","VND");
        moneytaries.put("USA","$");
        moneytaries.put("Enland","EUR");
        moneytaries.put("Japan","YAN");
        System.out.println(moneytaries);

        System.out.println(moneytaries.get("Japan"));
        if(moneytaries.containsKey("Japan")){
            moneytaries.remove("Japan");
        }

        //loop through by keySet
        for(String key:moneytaries.keySet()){
            System.out.println(key + " -- " + moneytaries.get(key));
        }
    }
}
