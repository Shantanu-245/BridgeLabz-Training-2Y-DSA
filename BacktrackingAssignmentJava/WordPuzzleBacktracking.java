
import java.util.*;

public class WordPuzzleBacktracking {

    static int[] dx={-1,-1,-1,0,0,1,1,1};
    static int[] dy={-1,0,1,-1,1,-1,0,1};

    static boolean dfs(char[][] grid,String word,int x,int y,int idx,boolean[][] vis){

        if(idx==word.length()) return true;

        int n=grid.length;

        if(x<0||y<0||x>=n||y>=n||vis[x][y]||grid[x][y]!=word.charAt(idx))
            return false;

        vis[x][y]=true;

        for(int d=0;d<8;d++){
            if(dfs(grid,word,x+dx[d],y+dy[d],idx+1,vis))
                return true;
        }

        vis[x][y]=false;
        return false;
    }

    public static void main(String[] args){

        Scanner sc=new Scanner(System.in);

        int n=4;
        char[][] grid=new char[n][n];

        System.out.println("Enter 4x4 grid letters:");

        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                grid[i][j]=sc.next().charAt(0);
            }
        }

        System.out.print("Enter target word: ");
        String word=sc.next();

        boolean[][] vis=new boolean[n][n];

        boolean found=false;

        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                if(dfs(grid,word,i,j,0,vis)){
                    found=true;
                    break;
                }
            }
        }

        System.out.println(found?"Word exists":"Word not found");
    }
}
