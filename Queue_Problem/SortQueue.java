import java.util.*;

class SortQueue {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        Queue<Integer> q = new LinkedList<>();
        for(int i=0;i<n;i++) q.add(sc.nextInt());

        List<Integer> list = new ArrayList<>(q);
        Collections.sort(list);

        for(int x:list) System.out.print(x+" ");
    }
}