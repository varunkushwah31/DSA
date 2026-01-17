package HashMap;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class Q1 {
    public static void main(String[] args) {
        HashMap<String, Integer> products = new HashMap<>();
        products.put("Pen", 10);
        products.put("Notebook", 3);
        products.put("Pencil", 7);
        products.put("Eraser", 2);

        Iterator<Map.Entry<String, Integer>> iterator = products.entrySet().iterator();
        while (iterator.hasNext()) {
            Map.Entry<String, Integer> entry = iterator.next();
            if (entry.getValue() < 5) {
                iterator.remove();
            }
        }

        System.out.println(products);
    }
}
