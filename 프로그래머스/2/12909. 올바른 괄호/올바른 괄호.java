import java.util.*;

class Solution {
    boolean solution(String s) {
        Stack<Integer> st = new Stack<>();
        for(int i=0; i<s.length(); i++){
            if(s.charAt(i) == '('){
                st.push(0);
            }else{
                if(st.isEmpty())
                    return false;
                else st.pop();
            }
        }

        return st.isEmpty() ? true : false;
    }
}