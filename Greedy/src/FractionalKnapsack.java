import java.util.*;

class Pair {
    int val;
    int w;
    double ratio;

    Pair(int val, int w) {
        this.val = val;
        this.w = w;
        this.ratio = (double) val / w;
    }
}

public class FractionalKnapsack {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of items: ");
        int n = sc.nextInt();

        System.out.print("Enter knapsack capacity: ");
        int cap = sc.nextInt();

        Pair[] arr = new Pair[n];

        System.out.println("Enter value and weight of each item:");

        for (int i = 0; i < n; i++) {
            int v = sc.nextInt();
            int w = sc.nextInt();
            arr[i] = new Pair(v, w);
        }

        Arrays.sort(arr, (a, b) -> Double.compare(b.ratio, a.ratio));

        double ans = 0;

        for (int i = 0; i < n; i++) {

            if (cap >= arr[i].w) {
                ans += arr[i].val;
                cap -= arr[i].w;
            } else {
                ans += arr[i].ratio * cap;
                break;
            }
        }

        System.out.printf("Maximum value in knapsack = %.6f\n", ans);
    }
}