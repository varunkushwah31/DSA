public class CeilingOfNumber {
    public static void main(String[] args) {
        int[] arr = {2,3,5,9,14,16,18};
        System.out.println(getCeil(arr,10));
    }

    public static int getCeil(int[] arr,int target){
        int ans = -1;
        int start = 0;
        int end = arr.length-1;
        while (start <= end){
            int mid = start + (end-start)/2; // same as (start + end)/2
            if (arr[mid] >= target){
                ans = arr[mid];
                end = mid-1;
            }else{
                start = mid + 1;
            }
        }
        return ans;
    }
}
