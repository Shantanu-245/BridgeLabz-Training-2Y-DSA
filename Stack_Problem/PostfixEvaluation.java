import java.util.*;
class PostfixEvaluation {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String exp = sc.next();

        Stack<Integer> st = new Stack<>();

        for(char c : exp.toCharArray()){
            if(Character.isDigit(c)) st.push(c - '0');
            else{
                int b = st.pop();
                int a = st.pop();

                if(c=='+') st.push(a+b);
                else if(c=='-') st.push(a-b);
                else if(c=='*') st.push(a*b);
                else if(c=='/') st.push(a/b);
            }
        }

        System.out.println(st.pop());
    }
}