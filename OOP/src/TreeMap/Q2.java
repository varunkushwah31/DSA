package TreeMap;
import java.util.*;
public class Q2 {
    public static void main(String[] args) {
        String sentence = "Hello, world! And hello... to the WORLD: the big, big world.";

        String[] words = sentence
                .toLowerCase()
                .replaceAll("[^a-z\\s]", "")  // keep only letters and spaces
                .split("\\s+");

        // OR for Splitting You can run the commented code below Your choice.

//        sentence = sentence.toLowerCase();
//        StringBuilder cleaned = new StringBuilder();
//        for (char c : sentence.toCharArray()) {
//            if (Character.isLetter(c) || Character.isSpaceChar(c)) {
//                cleaned.append(c);
//            } else {
//                cleaned.append(' '); // replace punctuation with space
//            }
//        }
//        String[] words = cleaned.toString().split(" ");

        TreeMap<String, Integer> freqMap = new TreeMap<>();
        for (String word : words) {
            freqMap.put(word, freqMap.getOrDefault(word, 0) + 1);
        }
        freqMap.forEach((word, count) -> System.out.println(word + ": " + count));
    }

}
