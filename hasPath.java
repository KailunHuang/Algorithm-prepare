/***
 * created by huang ON 2020/7/6
 */

public class hasPath {

    public static boolean exist(char[][] board, String word) {
        int row = board.length;
        int col = board[0].length;
        boolean haveAPass = false;
        for (int i=0; i<row; i++){
            for(int j=0; j<col; j++){
                System.out.println("x: "+i+" y: "+j);
                boolean[][] pathMap = new boolean[row][col];
                if(findNext(board, i, j, word, 0, pathMap)){
                    haveAPass=true;
                };
                System.out.println("******************************************************");
            }
        }
        return haveAPass;
    }

    public static boolean findNext(char[][] board, int x, int y, String word, int wordLocation, boolean[][] pathmap){
        int row = board.length;
        int col = board[0].length;

        char currentChar = word.charAt(wordLocation);
        if (x<0 || y<0 || x>=row || y>=col || board[x][y]!=currentChar || pathmap[x][y]==true) return false;
        if (wordLocation == word.length()-1) return true;
        pathmap[x][y]=true;
        boolean pass = findNext(board, x-1,y,word,wordLocation+1,pathmap) ||
                findNext(board, x+1, y, word, wordLocation+1, pathmap) ||
                findNext(board, x, y-1, word, wordLocation+1, pathmap) ||
                findNext(board, x, y+1, word, wordLocation+1, pathmap);
        pathmap[x][y]=false;
        return pass;
    }



    public static void main(String[] args) {
        char[][] map = {{'A','B','C','E'},{'S','F','E','S'},{'A','D','E','E'}};
        String word = "ABCESEEEFS";
        System.out.print(exist(map, word));

    }
    //    public boolean hasPath(char[] matrix, int rows, int cols, char[] str)
//    {
//        int current_location = 0;
//        boolean[] pathMap = new boolean[matrix.length];
//
//        for (int i = 0; i < rows; i++){
//            for (int j = 0; j < cols; j++){
//                int index = i*cols+j;
//                if (matrix[index] == str[current_location]){
//                    boolean pathTrack = findNextChar(matrix, rows, cols, i, j, 1, str, pathMap);
//                    return pathTrack;
//                }else{
//                    return false;
//                }
//            }
//        }
//    }
//
//    public boolean findNextChar(char[] matrix, int row, int col, int currentRow, int currentCol, int currentLocation, char[] str, boolean[] map){
//        if (currentLocation >= str.length){
//            return true;
//        }
//        int nextChar = str[currentLocation];
//        if (currentRow-1>=0){
//            int index = (currentRow-1)*col+currentCol;
//            if (matrix[index]==nextChar && map[index]!=true){
//                map[index] = true;
//                findNextChar(matrix,row,col,currentRow-1, currentCol,currentLocation+1, str, map);
//            }
//        }else if(currentRow+1<=row){
//            int index = (currentRow+1)*col+currentCol;
//            if(matrix[index]==nextChar && map[index]!=true){
//                map[index] = true;
//                findNextChar(matrix,row,col,currentRow+1,currentCol,currentLocation+1,str,map);
//            }
//        }else if(currentCol-1>=0){
//            int index = currentRow*col+currentCol-1;
//            if(matrix[index]==nextChar && map[index]!=true){
//                map[index]=true;
//                findNextChar(matrix, row, col, currentRow, currentCol-1, currentLocation+1, str, map)
//            }
//        }else if(currentCol+1<=col){
//            int index = currentRow*col+currentCol+1;
//            if(matrix[index]==nextChar && map[index]!=true){
//                map[index]=true;
//                findNextChar(matrix, row, col, currentRow, currentCol+1, currentLocation+1, str, map)
//            }
//        }
//        return false;
//    }
}
