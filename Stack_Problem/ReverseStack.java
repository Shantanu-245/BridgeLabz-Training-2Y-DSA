import java.util.*;
class ReverseStack {
    static void insertBottom(Stack<Integer> st, int x){
        if(st.isEmpty()){
            st.push(x);
            return;
        }
        int top = st.pop();
        insertBottom(st,x);
        st.push(top);
    }

    static void reverse(Stack<Integer> st){
        if(st.isEmpty()) return;
        int top = st.pop();
        reverse(st);
        insertBottom(st, top);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        Stack<Integer> st = new Stack<>();

        for(int i=0;i<n;i++) st.push(sc.nextInt());

        reverse(st);

        while(!st.isEmpty()) System.out.print(st.pop()+" ");
    }
}