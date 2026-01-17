package LinkedHashSet;
import java.util.*;
public class Q1 {
    public static void main(String[] args) {

        List<String> list1 = Arrays.asList("apple", "banana", "apple", "cherry", "date");
        List<String> list2 = Arrays.asList("banana", "date", "fig", "banana", "grape");

        LinkedHashSet<String> set1 = new LinkedHashSet<>(list1);
        LinkedHashSet<String> set2 = new LinkedHashSet<>(list2);

        // 1. Union
        LinkedHashSet<String> union = new LinkedHashSet<>(set1);
        union.addAll(set2);

        // 2. Intersection
        LinkedHashSet<String> intersection = new LinkedHashSet<>(set1);
        intersection.retainAll(set2);

        // 3. Difference (list1 - list2)
        LinkedHashSet<String> difference = new LinkedHashSet<>(set1);
        difference.removeAll(set2);

        System.out.println("Union: " + union);
        System.out.println("Intersection: " + intersection);
        System.out.println("Difference (list1 - list2): " + difference);
    }
}
