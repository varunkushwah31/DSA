import java.util.*;


public class BasicHashing {
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        int n;
        System.out.print("Enter the size of array : ");
        n = read.nextInt();
        int[] arr = new int[n];
        System.out.print("Elements of array are : ");
        for (int i = 0; i < n; i++) {
            arr[i] = read.nextInt();
        }

        //Precompute:
        int[] hash = new int[14];
        for (int i = 0; i < n; i++) {
            hash[arr[i]] = hash[arr[i]] + 1;
        }

        int q;
        System.out.print("Enter q");
        q = read.nextInt();
        while (q-- != 0){
            int number;
            number = read.nextInt();
            System.out.println(hash[number]);
        }

    }
}
