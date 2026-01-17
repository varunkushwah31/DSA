package TreeSet;


import java.util.Iterator;
import java.util.TreeSet;

public class Q1 {
    public static void main(String[] args) {
        TreeSet<String> usernames = new TreeSet<>();
        usernames.add("alice");
        usernames.add("charles");
        usernames.add("bob");
        usernames.add("davidson");
        usernames.add("emily");
        usernames.add("franklin");

        Iterator<String> iterator = usernames.iterator();
        while(iterator.hasNext()) {
            String user = iterator.next();
            if (user.length() > 5) {
                System.out.print(user + " ");
            }
        }
    }
}
