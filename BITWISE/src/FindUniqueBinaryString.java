import java.util.*;

public class FindUniqueBinaryString {

    public static String findDifferentBinaryString(String[] nums) {
        int n = nums.length;
        StringBuilder result = new StringBuilder();

        for (int i = 0; i < n; i++) {
            char bit = nums[i].charAt(i);
            if (bit == '0') {
                result.append('1');
            } else {
                result.append('0');
            }
        }

        return result.toString();
    }

    public static void runTest(String[] nums) {
        System.out.println("Input: " + Arrays.toString(nums));
        String ans = findDifferentBinaryString(nums);
        System.out.println("Output: " + ans);

        // Validation
        Set<String> set = new HashSet<>(Arrays.asList(nums));
        if (set.contains(ans)) {
            System.out.println("Error: Output exists in input!");
        } else {
            System.out.println("Valid unique binary string");
        }

        System.out.println("----------------------------");
    }

    public static void main(String[] args) {

        // Testcase 1
        runTest(new String[]{"01", "10"});

        // Testcase 2
        runTest(new String[]{"00", "01"});

        // Testcase 3
        runTest(new String[]{"111", "011", "001"});

        // Custom testcase
        runTest(new String[]{"000", "001", "010"});
    }
}