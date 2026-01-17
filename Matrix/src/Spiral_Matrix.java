import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Spiral_Matrix {
    public static void main(String[] args) {
        int[][] mat = {{1,2,3,4},
                       {5,6,7,8},
                       {9,10,11,12},
                       {13,14,15,16}};

        List<Integer> ans = printSpiral(mat);
        for (int i = 0; i < ans.size(); i++) {
            System.out.print(ans.get(i) + " ");
        }
        System.out.println();

    }

    public static List<Integer> printSpiral(int mat[][]){

        List<Integer> ans = new ArrayList<>();
        int n = mat.length; //no. of rows
        int m = mat[0].length; // no. of cols
        //initialize pointers required for traversal.
        int top = 0, left = 0, right = m-1, bottom = n-1;

        //loop until all elements are not traversed.
        while (top <= bottom && left <= right){
            for (int i = left; i <= right ; i++) {
                ans.add(mat[top][i]);
            }
            top++;
            for (int i = top; i <= bottom ; i++) {
                ans.add(mat[i][right]);
            }
            right--;
            if(top <= bottom){
                for (int i = right; i >= left ; i--) {
                    ans.add(mat[bottom][i]);
                }
                bottom--;
            }
            if(left <= right){
                for (int i = bottom; i >= top ; i--) {
                    ans.add(mat[i][left]);
                }
                left++;
            }
        }
        return ans;

    }

}
