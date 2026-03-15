import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class SubsetsTest {

    public static void main(String[] args) {

        // Test Case 1
        int[] nums1 = {1, 2, 3};
        System.out.println("Input: " + Arrays.toString(nums1));
        System.out.println("Subsets: " + subsets(nums1));
        System.out.println();

        // Test Case 2
        int[] nums2 = {0};
        System.out.println("Input: " + Arrays.toString(nums2));
        System.out.println("Subsets: " + subsets(nums2));
        System.out.println();

        // Test Case 3
        int[] nums3 = {1, 2};
        System.out.println("Input: " + Arrays.toString(nums3));
        System.out.println("Subsets: " + subsets(nums3));
        System.out.println();

        // Test Case 4
        int[] nums4 = {1, 2, 3, 4};
        System.out.println("Input: " + Arrays.toString(nums4));
        System.out.println("Subsets: " + subsets(nums4));
    }

    public static List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> res = new ArrayList<>();
        List<Integer> subset = new ArrayList<>();

        createSubset(nums, 0, res, subset);

        return res;
    }

    private static void createSubset(int[] nums, int index, List<List<Integer>> res, List<Integer> subset) {

        if (index == nums.length) {
            res.add(new ArrayList<>(subset));
            return;
        }

        // Include element
        subset.add(nums[index]);
        createSubset(nums, index + 1, res, subset);

        // Exclude element (backtrack)
        subset.removeLast();
        createSubset(nums, index + 1, res, subset);
    }
}