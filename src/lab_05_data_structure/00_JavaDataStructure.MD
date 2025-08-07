Java supports many Data Structure under java.util such as:
                                <Collections>
            <List>              <Set>                   <Map>
        ArrayList               HashSet                 HashMap
        LinkedList              TreeSet                 TreeMap
                                LinkedHashSet           LinkedHashMap
    ----------------        -------------------         --------------------
        add()                   add()                   put(K,V) //(key,value)pair
        get()                   contains()              get(K) 
        remove()                remove()                remove()
        set()                   clear()                 containsKey()
        size()                  size()                  keySet()
        

"Iterator" will help you to loop through each elements in a data structure

ArrayList: good for accessing elements by index ==> arr.get(index)
HashSet: avoiding duplicates, fast checks
HashMap: fast lookup by key, store as (key,value) pair