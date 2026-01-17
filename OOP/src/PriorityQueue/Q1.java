package PriorityQueue;
import java.util.*;
public class Q1 {
    public static void main(String[] args) {
        List<String> strings = Arrays.asList(
                "banana", "apple", "kiwi", "orange", "fig", "apple", "berry", "date", "pear", "plum"
        );

        PriorityQueue<String> shortestQueue = new PriorityQueue<>(
                Comparator.comparingInt(String::length).thenComparing(Comparator.naturalOrder())
        );
        shortestQueue.addAll(strings);
        String shortestString = shortestQueue.peek();

        PriorityQueue<String> longestQueue = new PriorityQueue<>(
                (s1, s2) -> {
                    int cmp = Integer.compare(s2.length(), s1.length());
                    return cmp != 0 ? cmp : s1.compareTo(s2);
                }
        );
        longestQueue.addAll(strings);
        String longestString = longestQueue.peek();

        Set<String> uniqueStrings = new HashSet<>(strings);
        PriorityQueue<String> top3Shortest = new PriorityQueue<>(
                Comparator.comparingInt(String::length).thenComparing(Comparator.naturalOrder())
        );
        top3Shortest.addAll(uniqueStrings);

        List<String> top3 = new ArrayList<>();
        for (int i = 0; i < 3 && !top3Shortest.isEmpty(); i++) {
            top3.add(top3Shortest.poll());
        }

        System.out.println("Shortest String: " + shortestString);
        System.out.println("Longest String: " + longestString);
        System.out.println("Top 3 Shortest Unique Strings: " + top3);
    }
}
