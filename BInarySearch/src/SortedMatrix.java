import java.util.Arrays;

public class SortedMatrix {
    public static void main(String[] args) {
        int[][] arr = {
                {1,2,3},
                {4,5,6},
                {7,8,9}
        };

        System.out.println(Arrays.toString(Search(arr,6 )));

    }

    static int[] BinarySearch(int[][] matrix, int row, int cStart, int cEnd, int target){
        while (cStart <= cStart){
            int mid = cStart + (cEnd - cStart)/2;
            if(matrix[row][mid] == target){
                return new int[] {row,mid};
            }
            if(matrix[row][mid] < target){
                cStart = mid;
            }
            else {
                cEnd = mid;
            }
        }
        return new int[] {-1,-1};
    }

    static int[] Search(int[][] matrix,int target){
        int rows =  matrix.length;
        int cols = matrix[0].length;
        if(rows == 1){
            return BinarySearch(matrix,0,0,cols-1,target);
        }
        int rStart = 0;
        int rEnd = rows-1;
        int cMid = cols/2;

        // Run the loop till 2 rows are remaining
        while (rStart < (rEnd-1)){ // While this is true it will have more than 2 rows
            int mid = rStart+(rEnd-rStart)/2;
            if(matrix[mid][cMid] == target){
                return new int[] {mid,cMid};
            }
            if(matrix[mid][cMid] < target){
                rStart = mid;
            }
            else {
                rEnd = mid;
            }
        }

        //now we have two rows;
        //check whether the target is in the col of 2 rows

        if(matrix[rStart+1][cMid] == target){
            return new int[] {rStart+1,cMid};
        }

        //search in 1st half

        if(target <= matrix[rStart][cMid-1]){
            return BinarySearch(matrix,rStart,0,cMid-1,target);
        }
        //search in 2nd half

        if(target >= matrix[rStart][cMid-1] && target <= matrix[rStart][cols-1]){
            return BinarySearch(matrix,rStart,cMid+1,cols-1,target);
        }
        //search in 3rd half

        if(target <= matrix[rStart+1][cMid-1]){
            return BinarySearch(matrix,rStart+1,0,cMid-1,target);
        }
        else{
            return BinarySearch(matrix,rStart+1,cMid+1,cols-1,target);
        }
    }
}
