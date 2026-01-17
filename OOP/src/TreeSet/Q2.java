package TreeSet;
import java.util.*;
public class Q2 {
    public static void main(String[] args) {
        ArrayList<String> input = new ArrayList<>(Arrays.asList(
                "banana", "apple", "orange", "banana", "apple"
        ));

        TreeSet<String> sortedSet = removeDuplicatesAndSort(input);
        System.out.println("Sorted ascending: " + sortedSet);

        TreeSet<String> reverseSortedSet = removeDuplicatesAndSortReverse(input);
        System.out.println("Sorted descending: " + reverseSortedSet);
    }

    private static TreeSet<String> removeDuplicatesAndSortReverse(ArrayList<String> inputList) {
        return new TreeSet<>(Comparator.reverseOrder()) {{
            addAll(inputList);
        }};
    }

    private static TreeSet<String> removeDuplicatesAndSort(ArrayList<String> inputList) {
        //Because TreeSet is AlreadySorted and Removes Duplicate;
        return new TreeSet<>(inputList);
    }
}
