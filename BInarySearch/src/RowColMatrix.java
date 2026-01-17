import java.util.Arrays;

public class RowColMatrix {
    public static void main(String[] args) {
        int[][] arr = {
                {10,20,30,40},
                {15,25,35,45},
                {28,29,38,49},
                {33,34,38,50},
        };

        System.out.println(Arrays.toString(Search(arr,20)));

        // Time Complexity O(N)
        // WIll work on row and column wise sorted

    }

    static int[] Search(int[][] Matrix,int target){
        int r = 0;
        int c = Matrix[0].length-1;

        while (r < Matrix.length && c >= 0){
            if(Matrix[r][c] == target){
                return new int[] {r,c};
            }
            if(Matrix[r][c] < target){
                r++;
            }
            else{
                c--;
            }
        }
        return new int[] {-1,-1};
    }
}
