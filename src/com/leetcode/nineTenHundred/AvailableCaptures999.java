package com.leetcode.nineTenHundred;

/**
 * Created by LiuLiHao on 2020/3/26 0026 上午 11:12
 * @author : LiuLiHao
 * 描述：
 * 在一个 8 x 8 的棋盘上，有一个白色车（rook）。也可能有空方块，白色的象（bishop）和黑色的卒（pawn）。它们分别以字符 “R”，“.”，“B” 和 “p” 给出。大写字符表示白棋，小写字符表示黑棋。
 *
 * 车按国际象棋中的规则移动：它选择四个基本方向中的一个（北，东，西和南），然后朝那个方向移动，直到它选择停止、到达棋盘的边缘或移动到同一方格来捕获该方格上颜色相反的卒。另外，车不能与其他友方（白色）象进入同一个方格。
 *
 * 返回车能够在一次移动中捕获到的卒的数量。
 *  
 *
 * 示例 1：
 *
 *
 *
 * 输入：[[".",".",".",".",".",".",".","."],[".",".",".","p",".",".",".","."],[".",".",".","R",".",".",".","p"],[".",".",".",".",".",".",".","."],[".",".",".",".",".",".",".","."],[".",".",".","p",".",".",".","."],[".",".",".",".",".",".",".","."],[".",".",".",".",".",".",".","."]]
 * 输出：3
 * 解释：
 * 在本例中，车能够捕获所有的卒。
 * 示例 2：
 *
 *
 *
 * 输入：[[".",".",".",".",".",".",".","."],[".","p","p","p","p","p",".","."],[".","p","p","B","p","p",".","."],[".","p","B","R","B","p",".","."],[".","p","p","B","p","p",".","."],[".","p","p","p","p","p",".","."],[".",".",".",".",".",".",".","."],[".",".",".",".",".",".",".","."]]
 * 输出：0
 * 解释：
 * 象阻止了车捕获任何卒。
 * 示例 3：
 *
 *
 *
 * 输入：[[".",".",".",".",".",".",".","."],[".",".",".","p",".",".",".","."],[".",".",".","p",".",".",".","."],["p","p",".","R",".","p","B","."],[".",".",".",".",".",".",".","."],[".",".",".","B",".",".",".","."],[".",".",".","p",".",".",".","."],[".",".",".",".",".",".",".","."]]
 * 输出：3
 * 解释：
 * 车可以捕获位置 b5，d6 和 f5 的卒。
 *  
 *
 * 提示：
 *
 * board.length == board[i].length == 8
 * board[i][j] 可以是 'R'，'.'，'B' 或 'p'
 * 只有一个格子上存在 board[i][j] == 'R'
 *
 */
public class AvailableCaptures999 {
    public static void main(String[] args) {
//        char[][] board = {
//                {'.','.','.','.','.','.','.','.'},
//                {'.','p','p','p','p','p','.','.'},
//                {'.','p','p','B','p','p','.','.'},
//                {'.','p','B','R','B','p','.','.'},
//                {'.','p','p','B','p','p','.','.'},
//                {'.','p','p','p','p','p','.','.'},
//                {'.','.','.','.','.','.','.','.'},
//                {'.','.','.','.','.','.','.','.'}
//        };

        char[][] board = {
                {'.','.','.','.','.','.','.','.'},
                {'.','.','.','p','.','.','.','.'},
                {'.','.','.','R','.','.','.','p'},
                {'.','.','.','.','.','.','.','.'},
                {'.','.','.','.','.','.','.','.'},
                {'.','.','.','p','.','.','.','.'},
                {'.','.','.','.','.','.','.','.'},
                {'.','.','.','.','.','.','.','.'}
        };

        System.out.println(numRookCaptures(board));
    }

    public static int numRookCaptures(char[][] board) {
        int len = board.length;
        for (int i = 0; i < len; i++) {
            for (int j = 0; j < board[i].length; j++) {
                if (board[i][j]=='R'){
                    return calc(board,i,j,0,1)+
                            calc(board,i,j,0,-1)+
                            calc(board,i,j,1,0)+
                            calc(board,i,j,-1,0);
                }
            }
        }
        return 0;
    }

    /**
     *  辅助计算函数
     * @param board 数组
     * @param i R 所在行
     * @param j R 所在列
     * @param x 行移动量
     * @param y 列移动量
     * @return
     */
    private static int calc(char[][] board, int i, int j, int x, int y) {
        int len = board.length;
        while (i>=0 && i<len
                && j>=0 && j<len
                && board[i][j]!='B'){
            if (board[i][j]=='p'){
                return 1;
            }
            i+=x;
            j+=y;
        }
        return 0;
    }

//
//    public static int numRookCaptures(char[][] board) {
//        //先找R
//        int len = board.length;
//        //位置
//        int RI = 0,RJ = 0;
//        for (int i = 0; i < len; i++) {
//            for (int j = 0; j < board[i].length; j++) {
//                if (board[i][j]=='R'){
//                    RI =  i;
//                    RJ = j;
//                }
//            }
//        }
//        int sum = 0;
//        for (int i = RI+1; i < 8; i++) {
//            //往下走
//            char current = board[i][RJ];
//            //白色象
//            if (current=='B'){
//                break;
//            }else if (current=='p'){
//                sum++;
//                break;
//            }
//        }
//        for (int i = RI-1; i >=0; i--) {
//            //往上走
//            char current = board[i][RJ];
//            //白色象
//            if (current=='B'){
//                break;
//            }else if (current=='p'){
//                sum++;
//                break;
//            }
//        }
//
//        for (int i = RJ+1; i < 8; i++) {
//            //往右走
//            char current = board[RI][i];
//            //白色象
//            if (current=='B'){
//                break;
//            }else if (current=='p'){
//                sum++;
//                break;
//            }
//        }
//        for (int i = RJ-1; i >=0; i--) {
//            //往左走
//            char current = board[RI][i];
//            //白色象
//            if (current=='B'){
//                break;
//            }else if (current=='p'){
//                sum++;
//                break;
//            }
//        }
//
//        return sum;
//    }


}
