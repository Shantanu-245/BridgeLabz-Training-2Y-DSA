import java.util.*;
class StackUsingQueue {
    public static void main(String[] args) {
        Queue<Integer> q = new LinkedList<>();
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        for(int i=0;i<n;i++){
            int x = sc.nextInt();
            q.add(x);
            for(int j=0;j<q.size()-1;j++) q.add(q.remove());
        }

        while(!q.isEmpty()) System.out.print(q.remove()+" ");
    }
}