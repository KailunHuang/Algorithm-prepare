/***
 * created by huang ON 2020/7/5
 */

public class movingCount {
    public static int movingCount(int threshold, int rows, int cols)
    {
        int nums = 0;
        int[][] map = new int[rows][cols];
        map[0][0] = 1;
        for (int i = 0; i < rows; i++){
            for (int j = 0; j < cols; j++){
                int a = i/10;
                int b = i%10;
                int c = j/10;
                int d = j%10;
                if (
                        ((a+b+c+d)<=threshold) &&
                        (
                        (j+1<cols && map[i][j+1]==1) ||
                        (j-1>=0 && map[i][j-1]==1) ||
                        (i+1<rows && map[i+1][j]==1) ||
                        (i-1>=0 && map[i-1][j]==1)
                        )
                ){
                    nums++;
                    map[i][j]=1;
                }
            }
        }
        return nums;
    }

    public static void main(String[] args) {
        System.out.print(movingCount(18,33,44));
    }
}
