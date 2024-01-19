import java.util.*;

class Solution {
    static Stack<Integer> stack = new Stack<>();
    
    boolean solution(String s) {
        for(int i=0; i<s.length(); i++){
            if(s.charAt(i) == '('){
                stack.push(0);
            }else{
                if(stack.isEmpty()){
                    return false;
                }else{
                    stack.pop();
                }
            }
        }
    
        return stack.isEmpty() ? true : false;
    }
}