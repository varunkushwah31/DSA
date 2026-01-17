package ArrayDeque;

import java.util.ArrayDeque;
import java.util.Iterator;

public class Q1 {
    public static void main(String[] args) {
        ArrayDeque<Double> deque = new ArrayDeque<>();
        deque.add(150.5);
        deque.add(90.0);
        deque.add(120.0);
        deque.add(80.3);

        Iterator<Double> iterator = deque.iterator();
        while (iterator.hasNext()) {
            if (iterator.next() < 100.0) {
                iterator.remove();
            }
        }

        System.out.println(deque);
    }
}
