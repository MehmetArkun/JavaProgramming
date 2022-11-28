package day51_Map;

public class MapIntro {

    /*
    Collection of pairs. data structure based on key+value pairs
    does not have IS A relation with Collection. size can be increased and decreased(dynamic)
    key can not be duplicated. must be unique.
    they do not have indexes. while using get method, we put key inside get, not index number.

    **MAP (I)
        *HashMap (C) the most common used
            the fastest map. Similar to HashSet, it maintains the RANDOM order.
            Accepts null value as a key and values
            not synchronized

            -LinkedHashMap (C)
                it maintains insertion order. accepts null one value and multiple keys
                            not synchronized


        *Hashtable (C)
            Maintains RANDOM order. DOES NOT accept null key or value
            THREAD_SAFE (slow) synchronized

        *SortedMap (I)
            -TreeMap (C)
                it maintains SORTED order. Does NOT accept null as a key. but accepts null as value
                            not synchronized

         methods:
         put(key, value) inserts the given key and value to map
         get(key, value) returns the value of the given key
         replace()
         remove(key,value) or remove(key)
         containsKey(key)







     */
}
