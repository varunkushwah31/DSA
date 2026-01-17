package TreeMap;

import java.util.Iterator;
import java.util.Map;
import java.util.TreeMap;

public class Q1 {
    public static void main(String[] args) {
        TreeMap<String, Integer> map = new TreeMap<>();
        map.put("apple", 40);
        map.put("banana", 60);
        map.put("cherry", 50);
        map.put("date", 70);

        Iterator<Map.Entry<String, Integer>> iterator = map.entrySet().iterator();
        while (iterator.hasNext()) {
            Map.Entry<String, Integer> entry = iterator.next();
            if (entry.getValue() <= 50) {
                iterator.remove();
            }
        }

        System.out.println(map);
    }
}
