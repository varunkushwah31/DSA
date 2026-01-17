public class MinAndMaxRecursion {
    public static void main(String[] args) {
        int[] arr = {1,4,2,6,5,9,8,7};
        int[] res = findMinMax(arr);
        System.out.println("Min = " + res[0] + " And Max = " + res[1]);
    }

    private static int[] findMinMax(int[] arr) {
        int n = arr.length;
        int minValue = getMinRec(arr,n);
        int maxValue = getMaxRec(arr,n);
        int[] res = {minValue,maxValue};
        return res;
    }

    private static int getMaxRec(int[] arr, int n) {
        if(n == 1){
            return arr[0];
        }
        int maxInRest = getMaxRec(arr,n-1);
        if(arr[n-1] > maxInRest){
            return arr[n-1];
        }else {
            return maxInRest;
        }
    }

    private static int getMinRec(int[] arr, int n) {
        if(n == 0){
            return arr[0];
        }
        int minInRest = getMinRec(arr,n-1);
        if(arr[n-1] < minInRest){
            return arr[n-1];
        }else{
            return minInRest;
        }
    }

}
