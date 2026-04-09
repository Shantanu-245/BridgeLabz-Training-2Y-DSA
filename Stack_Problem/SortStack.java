import java.util.*;

class SortStack {

    static void insert(Stack<Integer> st, int x){
        if(st.isEmpty() || st.peek() <= x){
            st.push(x);
            return;
        }
        int temp = st.pop();
        insert(st, x);
        st.push(temp);
    }

    static void sort(Stack<Integer> st){
        if(st.isEmpty()) return;
        int x = st.pop();
        sort(st);
        insert(st, x);
    }

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        Stack<Integer> st = new Stack<>();

        for(int i=0;i<n;i++) st.push(sc.nextInt());

        sort(st);

        while(!st.isEmpty()) System.out.print(st.pop()+" ");
    }
}