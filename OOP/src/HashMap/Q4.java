package HashMap;
import java.util.*;
public class Q4 {
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        System.out.println("Enter first string:");
        String s1 = read.nextLine();

        System.out.println("Enter second string:");
        String s2 = read.nextLine();

        boolean result = areIsomorphic(s1, s2);

        if (result) {
            System.out.println("Isomorphic");
        } else {
            System.out.println("Not Isomorphic");
        }

        read.close();
    }

    private static boolean areIsomorphic(String s1, String s2) {
        if (s1.length() != s2.length()) {
            return false;
        }
        s1 = s1.toLowerCase();
        s2 = s2.toLowerCase();

        HashMap<Character, Character> map = new HashMap<>();
        HashSet<Character> mappedValues = new HashSet<>();
        for (int i = 0; i < s1.length(); i++) {
            char c1 = s1.charAt(i);
            char c2 = s2.charAt(i);
            if (map.containsKey(c1)) {
                // Check if current mapping matches the character in s2
                if (map.get(c1) != c2) {
                    return false;
                }
            } else {
                // If c2 is already mapped by another char, mapping invalid
                if (mappedValues.contains(c2)) {
                    return false;
                }
                map.put(c1, c2);
                mappedValues.add(c2);
            }
        }
        return true;
    }
}
