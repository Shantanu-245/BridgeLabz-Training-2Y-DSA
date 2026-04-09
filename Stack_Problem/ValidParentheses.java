import java.util.*;
class ValidParentheses {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        Stack<Character> st = new Stack<>();
        boolean valid = true;

        for(char c : s.toCharArray()){
            if(c=='('||c=='{'||c=='[') st.push(c);
            else{
                if(st.isEmpty()){ valid=false; break; }
                char top = st.pop();
                if((c==')' && top!='(') || (c=='}' && top!='{') || (c==']' && top!='[')){
                    valid=false; break;
                }
            }
        }

        if(!st.isEmpty()) valid=false;
        System.out.println(valid);
    }
}