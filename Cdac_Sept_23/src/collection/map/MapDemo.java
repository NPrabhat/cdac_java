package collection.map;

import java.util.HashMap;
import java.util.Map;

public class MapDemo {
    public static void main(String[] args) {
        Map<Integer,String> mp = new HashMap<>();
        mp.put(102, "Ramesh");
        mp.put(102, "Suresh");
        mp.put(102, "Dinesh");
        mp.put(102, "Bhavesh");
        mp.put(102, "Ramesh");
        
    }
}