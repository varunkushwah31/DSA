import java.util.*;
class LargestAlmostMissingNumber {
    public static int largestInteger(int[] nums, int k) {
        int n = nums.length;
        HashMap<Integer,Integer> map = new HashMap<>();
        int ans = -1;
        for(int i=0;i<n;i++){
            for(int j=i;j<i+k && j < n;j++){
                map.put(nums[j],map.getOrDefault(nums[j],0) + 1);
            }
        }
        for(int x : map.keySet()){
            if(map.get(x) == 1){
                ans = Math.max(ans,x);
            }
        }
        return ans;
    }
    public static void main(String[] args){
        Scanner read = new Scanner(System.in);
        int n = read.nextInt();
        int[] arr = new int[n];
        for(int i=0;i<n;i++){
            arr[i] = read.nextInt();
        }
        int k = read.nextInt();
        System.out.println(largestInteger(arr,k));
    }
}