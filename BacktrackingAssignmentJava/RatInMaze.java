
import java.util.*;

public class RatInMaze {

    static boolean solve(int[][] maze,int x,int y,int[][] sol){

        int n=maze.length;

        if(x==n-1 && y==n-1 && maze[x][y]==1){
            sol[x][y]=1;
            return true;
        }

        if(x>=0 && y>=0 && x<n && y<n && maze[x][y]==1){

            if(sol[x][y]==1) return false;

            sol[x][y]=1;

            if(solve(maze,x+1,y,sol)) return true;
            if(solve(maze,x,y+1,sol)) return true;
            if(solve(maze,x-1,y,sol)) return true;
            if(solve(maze,x,y-1,sol)) return true;

            sol[x][y]=0;
        }

        return false;
    }

    static void print(int[][] sol){
        for(int[] r:sol){
            for(int v:r) System.out.print(v+" ");
            System.out.println();
        }
    }

    public static void main(String[] args){

        Scanner sc=new Scanner(System.in);
        System.out.print("Enter maze size: ");
        int n=sc.nextInt();

        int[][] maze=new int[n][n];
        int[][] sol=new int[n][n];

        System.out.println("Enter maze (1 path,0 block):");

        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                maze[i][j]=sc.nextInt();
            }
        }

        if(solve(maze,0,0,sol)){
            System.out.println("Path:");
            print(sol);
        }else{
            System.out.println("No path found");
        }
    }
}
