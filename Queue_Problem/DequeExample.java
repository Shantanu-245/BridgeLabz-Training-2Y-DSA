import java.util.*;
class DequeExample {
    public static void main(String[] args) {
        Deque<Integer> dq = new ArrayDeque<>();
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        for(int i=0;i<n;i++){
            dq.addLast(sc.nextInt());
        }

        dq.addFirst(100);
        dq.addLast(200);

        while(!dq.isEmpty()){
            System.out.print(dq.removeFirst() + " ");
        }
    }
}