import java.util.*;

class Solution {
    boolean solution(String s) {
        boolean answer = true;
        Stack<Integer> st = new Stack<>();
       
        for(int i=0; i<s.length(); i++){
            if(s.charAt(i) == '(')
                st.push(1);
            else{
                if(st.isEmpty()) return false;
                else st.pop();
            }
        }
        
        if(!st.isEmpty()) return false;

        return answer;
    }
}