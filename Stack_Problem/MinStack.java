import java.util.*;
class MinStack {
    public static void main(String[] args) {
        Stack<Integer> st = new Stack<>();
        Stack<Integer> minSt = new Stack<>();
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        for(int i=0;i<n;i++){
            int val = sc.nextInt();
            st.push(val);
            if(minSt.isEmpty() || val <= minSt.peek()) minSt.push(val);
        }

        System.out.println(minSt.peek());
    }
}