import java.util.ArrayList;
import java.util.List;

class Subsets {
    public static List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> res = new ArrayList<>();
        List<Integer> subset = new ArrayList<>();
        createSubset(nums,0,res,subset);
        return res;
    }

    private static void createSubset(int[] nums,int index,List<List<Integer>> res, List<Integer> subset){
        if(index == nums.length){
            res.add(new ArrayList<>(subset));
            return;
        }
        subset.add(nums[index]);
        createSubset(nums,index+1,res,subset);
        subset.removeLast();
        createSubset(nums,index+1,res,subset);
    }

    public static void main(String[] args) {
        int[] nums = {1, 2, 3};
        List<List<Integer>> res = subsets(nums);
        System.out.println(res);
    }
}