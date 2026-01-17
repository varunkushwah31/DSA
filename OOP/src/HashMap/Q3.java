package HashMap;
import java.util.*;
public class Q3 {
    public static void main(String[] args) {
        List<String> list1 = Arrays.asList("apple", "banana", "apple", "orange", "grape", "banana");
        List<String> list2 = Arrays.asList("banana", "apple", "kiwi", "banana", "apple", "melon");

        Map<String, Integer> freqMap1 = getFrequencyMap(list1);
        Map<String, Integer> freqMap2 = getFrequencyMap(list2);

        Map<String, Integer> combinedFreqMap = new HashMap<>(freqMap1);
        for (Map.Entry<String, Integer> entry : freqMap2.entrySet()) {
            combinedFreqMap.merge(entry.getKey(), entry.getValue(), Integer::sum);
        }

        Map<String, Integer> commonElementsMap = new HashMap<>();
        for (String key : freqMap1.keySet()) {
            if (freqMap2.containsKey(key)) {
                commonElementsMap.put(key, Math.min(freqMap1.get(key), freqMap2.get(key)));
            }
        }

        Map<String, Integer> exclusiveList1Map = new HashMap<>();
        for (Map.Entry<String, Integer> entry : freqMap1.entrySet()) {
            if (!freqMap2.containsKey(entry.getKey())) {
                exclusiveList1Map.put(entry.getKey(), entry.getValue());
            }
        }

        System.out.println("1. Frequency Map of Combined Lists:");
        System.out.println(combinedFreqMap);

        System.out.println("\n2. Common Elements with Count:");
        System.out.println(commonElementsMap);

        System.out.println("\n3. Exclusive Elements from list1:");
        System.out.println(exclusiveList1Map);

    }
    private static Map<String, Integer> getFrequencyMap(List<String> list) {
        Map<String, Integer> freqMap = new HashMap<>();
        for (String item : list) {
            freqMap.put(item, freqMap.getOrDefault(item, 0) + 1);
        }
        return freqMap;
    }
}
