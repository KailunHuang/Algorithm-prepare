/***
 * created by huang ON 2020/7/7
 */
import java.util.ArrayList;

public class findNumberIn2DArray {
    public static boolean findNumberIn2DArray(int[][] matrix, int target) {

        int row = matrix.length;
        int col = matrix[0].length;
        if (row==0 || col==0){
            return false;
        }
        boolean result = false;
        ArrayList<Integer> possible_rows = new ArrayList<>();
        ArrayList<Integer> possible_cols = new ArrayList<>();
        for (int i = 0; i < row; i++){
            if(target>=matrix[i][0] && target<=matrix[i][col-1]){
                possible_rows.add(i);
            }
        }
        for (int j = 0; j < col; j++){
            if(target>=matrix[0][j] && target<=matrix[row-1][j]){
                possible_cols.add(j);
            }
        }
        for (int i = 0; i < possible_rows.size(); i++){
            for (int j = 0; j < possible_cols.size(); j++){
                if (matrix[possible_rows.get(i)][possible_cols.get(j)]==target){
                    result=true;
                }
            }
        }
        return result;
    }

    public static void main(String[] args) {
        int[][] board = {{-1,3}};
        System.out.println(board[0].length);
        System.out.println(findNumberIn2DArray(board, 3));
    }
}
