import java.util.*;
class QueueUsingStack {
    public static void main(String[] args) {
        Stack<Integer> s1 = new Stack<>();
        Stack<Integer> s2 = new Stack<>();
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        for(int i=0;i<n;i++){
            s1.push(sc.nextInt());
        }

        while(!s1.isEmpty()){
            s2.push(s1.pop());
        }

        while(!s2.isEmpty()){
            System.out.print(s2.pop() + " ");
        }
    }
}