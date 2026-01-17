package HashSet;

import java.util.HashSet;
import java.util.Iterator;

public class Q2 {
    public static void main(String[] args) {
        HashSet<Integer> set = new HashSet<>();
        set.add(5);
        set.add(12);
        set.add(7);
        set.add(15);
        set.add(20);

        Iterator<Integer> iterator = set.iterator();
        while (iterator.hasNext()) {
            if (iterator.next() < 10) {
                iterator.remove();
            }
        }

        System.out.println(set);
    }
}
