package LinkedList;

import java.util.LinkedList;

public class Q1 {
    public static void main(String[] args) {
        LinkedList<String> list = new LinkedList<>();
        list.add("Email");
        list.add("Meeting");
        list.add("Coding");
        list.add("Review");
        list.add("Deploy");
        if (!list.isEmpty()) {
            list.removeFirst();
        }
        if (!list.isEmpty()) {
            list.removeLast();
        }
        System.out.println(list);
    }
}
