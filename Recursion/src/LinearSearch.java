public class LinearSearch {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6,7,9,34,12};
        System.out.println(search(arr,33,0));
    }

    private static int search(int[] arr, int target, int i) {
        if(i == arr.length){
            return -1;
        }
        if(arr[i] == target){
            return i;
        }
        return search(arr,target,i+1);
    }
}
