
import java.util.*;

public class GraphColoring {

    static boolean isSafe(int v,int[][] graph,int[] color,int c){
        for(int i=0;i<graph.length;i++){
            if(graph[v][i]==1 && color[i]==c) return false;
        }
        return true;
    }

    static boolean solve(int v,int[][] graph,int m,int[] color){

        if(v==graph.length) return true;

        for(int c=1;c<=m;c++){
            if(isSafe(v,graph,color,c)){
                color[v]=c;
                if(solve(v+1,graph,m,color)) return true;
                color[v]=0;
            }
        }

        return false;
    }

    public static void main(String[] args){

        Scanner sc=new Scanner(System.in);

        System.out.print("Vertices: ");
        int v=sc.nextInt();

        int[][] graph=new int[v][v];

        System.out.println("Enter adjacency matrix:");

        for(int i=0;i<v;i++){
            for(int j=0;j<v;j++){
                graph[i][j]=sc.nextInt();
            }
        }

        System.out.print("Number of colors: ");
        int m=sc.nextInt();

        int[] color=new int[v];

        if(solve(0,graph,m,color)){
            System.out.println("Coloring:");
            for(int i=0;i<v;i++)
                System.out.println("Vertex "+i+" -> "+color[i]);
        }else{
            System.out.println("No solution");
        }
    }
}
