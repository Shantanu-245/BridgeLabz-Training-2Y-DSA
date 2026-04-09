import java.util.*;

class StockSpanStack {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] price = new int[n];

        for(int i=0;i<n;i++) price[i]=sc.nextInt();

        int[] span = new int[n];
        Stack<Integer> st = new Stack<>();

        for(int i=0;i<n;i++){
            while(!st.isEmpty() && price[st.peek()]<=price[i]) st.pop();
            span[i] = st.isEmpty()? i+1 : i-st.peek();
            st.push(i);
        }

        for(int x:span) System.out.print(x+" ");
    }
}