import java.util.Arrays;

public class SumTriangleFromArray {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5};
        //printTriangleNonRecursive(arr);
        printTriangleRecursive(arr);
        System.out.println(Arrays.toString(arr));
    }

    private static void printTriangleRecursive(int[] arr) {
        if(arr.length == 1){
            return;
        }
        int[] temp = new int[arr.length - 1];
        helper(temp,arr,0);
        printTriangleRecursive(temp);
        System.out.println(Arrays.toString(temp));
    }

    private static int[] helper(int[] temp, int[] arr, int i) {
        if(i == arr.length-1){
            return temp;
        }
        temp[i] = arr[i] + arr[i+1];
        return helper(temp,arr,i+1);
    }

    private static void printTriangleNonRecursive(int[] arr) {
        if(arr.length < 1){
            return;
        }
        int[] temp = new int[arr.length - 1];
        for (int i = 0; i < arr.length-1; i++) {
            int x = arr[i] + arr[i+1];
            temp[i] = x;
        }
        printTriangleNonRecursive(temp);
        System.out.println(Arrays.toString(arr));
    }
}
