
import java.util.*;

public class WordSearchGrid {

    static boolean dfs(char[][] grid,String word,int i,int j,int k,boolean[][] vis){

        if(k==word.length()) return true;

        if(i<0||j<0||i>=grid.length||j>=grid[0].length||vis[i][j]||grid[i][j]!=word.charAt(k))
            return false;

        vis[i][j]=true;

        boolean res= dfs(grid,word,i+1,j,k+1,vis)||
                     dfs(grid,word,i-1,j,k+1,vis)||
                     dfs(grid,word,i,j+1,k+1,vis)||
                     dfs(grid,word,i,j-1,k+1,vis);

        vis[i][j]=false;
        return res;
    }

    public static void main(String[] args){

        Scanner sc=new Scanner(System.in);

        System.out.print("Rows: ");
        int r=sc.nextInt();
        System.out.print("Cols: ");
        int c=sc.nextInt();

        char[][] grid=new char[r][c];

        System.out.println("Enter grid letters:");
        for(int i=0;i<r;i++){
            for(int j=0;j<c;j++){
                grid[i][j]=sc.next().charAt(0);
            }
        }

        System.out.print("Enter word: ");
        String word=sc.next();

        boolean[][] vis=new boolean[r][c];
        boolean found=false;

        for(int i=0;i<r;i++){
            for(int j=0;j<c;j++){
                if(dfs(grid,word,i,j,0,vis)){
                    found=true;
                    break;
                }
            }
        }

        System.out.println(found? "Word Found":"Word Not Found");
    }
}
