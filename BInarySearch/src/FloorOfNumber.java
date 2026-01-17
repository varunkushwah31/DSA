public class FloorOfNumber {
    public static void main(String[] args) {
        int[] arr = {2,3,5,9,14,16,18};
        System.out.println(getFloor(arr,10));
    }
    public static int getFloor(int[] arr,int target){
        int ans = -1;
        int start = 0;
        int end = arr.length-1;
        while (start <= end){
            int mid = start + (end-start)/2;
            if(arr[mid] <= target){
                ans = arr[mid];
                start = mid+1;
            }else {
                end = mid-1;
            }
        }
        return ans;
    }
}
