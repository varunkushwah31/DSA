import java.util.Scanner;

public class Oneunique {
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        int n = read.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = read.nextInt();
        }
        int uniq = UniqueElement(arr);
        System.out.println(uniq);
    }
    public static int UniqueElement(int[] arr){
        int unique = 0;
        for(int i=0;i< arr.length;i++){
            unique ^= arr[i];
        }
        return unique;
    }
}
