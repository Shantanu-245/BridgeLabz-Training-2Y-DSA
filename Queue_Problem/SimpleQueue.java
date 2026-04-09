import java.util.*;
class SimpleQueue {
    public static void main(String[] args) {
        Queue<Integer> q = new LinkedList<>();
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        for(int i=0;i<n;i++){
            q.add(sc.nextInt());
        }

        while(!q.isEmpty()){
            System.out.print(q.remove() + " ");
        }
    }
}