import java.util.*;
class PriorityQueueExample {
    public static void main(String[] args) {
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        for(int i=0;i<n;i++){
            pq.add(sc.nextInt());
        }

        while(!pq.isEmpty()){
            System.out.print(pq.poll() + " ");
        }
    }
}