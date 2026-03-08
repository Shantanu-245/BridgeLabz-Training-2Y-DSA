
import java.util.*;

public class SudokuSolver {

    static boolean isSafe(int[][] board, int row, int col, int num){
        for(int i=0;i<9;i++){
            if(board[row][i]==num || board[i][col]==num) return false;
        }

        int sr=row-row%3;
        int sc=col-col%3;

        for(int i=0;i<3;i++){
            for(int j=0;j<3;j++){
                if(board[sr+i][sc+j]==num) return false;
            }
        }
        return true;
    }

    static boolean solve(int[][] board){
        for(int i=0;i<9;i++){
            for(int j=0;j<9;j++){
                if(board[i][j]==0){
                    for(int num=1;num<=9;num++){
                        if(isSafe(board,i,j,num)){
                            board[i][j]=num;
                            if(solve(board)) return true;
                            board[i][j]=0;
                        }
                    }
                    return false;
                }
            }
        }
        return true;
    }

    static void print(int[][] board){
        for(int[] r:board){
            for(int v:r) System.out.print(v+" ");
            System.out.println();
        }
    }

    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int[][] board=new int[9][9];

        System.out.println("Enter Sudoku (0 for empty):");
        for(int i=0;i<9;i++){
            for(int j=0;j<9;j++){
                board[i][j]=sc.nextInt();
            }
        }

        if(solve(board)){
            System.out.println("Solved Sudoku:");
            print(board);
        }else{
            System.out.println("No solution");
        }
    }
}
