import java.util.Scanner;

public class InversionPairs {
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        int n = read.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = read.nextInt();
        }
        int[] temp = new int[n];
        int ans = mergeSortAndCount(arr,temp,0,n-1);
        System.out.println(ans);
    }

    private static int mergeSortAndCount(int[] arr, int[] temp, int left, int right) {
        int mid, ans = 0;
        if(left < right ){
            mid = left + (right-left)/2;
            ans += mergeSortAndCount(arr,temp,left,mid);
            ans += mergeSortAndCount(arr,temp,mid+1,right);
            ans += mergeAndCount(arr,temp,left,mid+1,right);
        }
        return ans;
    }

    private static int mergeAndCount(int[] arr, int[] temp, int left, int mid, int right) {
        int i = left;
        int j = mid;
        int k = left;
        int ans = 0;
        while (i <= mid-1 && j <= right ){
            if(arr[i] <= arr[j]){
                temp[k++] = arr[i++];
            }else {
                temp[k++] = arr[j++];
                ans += (mid-i);
            }
        }
        while (i <= mid-1){
            temp[k++] = arr[i++];
        }
        while (j <= right){
            temp[k++] = arr[j++];
        }
        for(i=left;i<=right;i++){
            arr[i] = temp[i];
        }
        return ans;
    }
}
