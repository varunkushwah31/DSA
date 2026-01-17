public class BinarySearchSQRT {
    public static void main(String[] args) {
        int n = 21;  // Number for which the square root is to be calculated
        int p = 3;   // Precision

        System.out.println(sqrt(n, p));
    }

    static double sqrt(int n, int p) {
        // Binary search for the integer part of the square root
        int start = 0;
        int end = n;
        double root = 0.0;

        // Step 1: Find the integer part of the square root using binary search
        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (mid * mid == n) {
                return mid;  // Return exact value if we find it
            }
            if (mid * mid > n) {
                end = mid - 1;
            } else {
                start = mid + 1;
                root = mid;  // Update root to the last valid mid value
            }
        }

        // Step 2: Refine the square root for precision (decimal part)
        double incre = 0.1;  // We start refining with 0.1 and decrease the increment
        for (int i = 0; i < p; i++) {
            // Refine the result to the required precision by incrementing the root
            while (root * root <= n) {
                root += incre;
            }

            // Once we overshoot, backtrack by the increment amount
            root -= incre;

            // Decrease the increment (to refine further)
            incre /= 10;
        }

        return root;
    }
}
