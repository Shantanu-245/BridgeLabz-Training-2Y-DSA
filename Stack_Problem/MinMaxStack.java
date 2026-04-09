import java.util.*;

class MinMaxStack {
    Stack<Integer> st = new Stack<>();
    Stack<Integer> minSt = new Stack<>();
    Stack<Integer> maxSt = new Stack<>();

    void push(int val){
        st.push(val);

        if(minSt.isEmpty() || val <= minSt.peek())
            minSt.push(val);

        if(maxSt.isEmpty() || val >= maxSt.peek())
            maxSt.push(val);
    }

    void pop(){
        int removed = st.pop();

        if(removed == minSt.peek()) minSt.pop();
        if(removed == maxSt.peek()) maxSt.pop();
    }

    int getMin(){
        return minSt.peek();
    }

    int getMax(){
        return maxSt.peek();
    }

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        MinMaxStack obj = new MinMaxStack();

        int n = sc.nextInt();
        for(int i=0;i<n;i++){
            obj.push(sc.nextInt());
        }

        System.out.println("Min: " + obj.getMin());
        System.out.println("Max: " + obj.getMax());

        obj.pop();

        System.out.println("After pop -> Min: " + obj.getMin());
        System.out.println("After pop -> Max: " + obj.getMax());
    }
}