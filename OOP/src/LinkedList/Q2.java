package LinkedList;

import java.util.Iterator;
import java.util.LinkedList;

public class Q2 {
    public static void main(String[] args) {
        LinkedList<String> list = new LinkedList<>();
        list.add("one");
        list.add("three");
        list.add("two");
        list.add("four");
        list.add("six");
        list.add("seven");

        Iterator<String> iterator = list.iterator();
        while (iterator.hasNext()) {
            String s = iterator.next();
            if (s.length() <= 3) {
                iterator.remove();
            }
        }

        System.out.println(list);
    }
}
