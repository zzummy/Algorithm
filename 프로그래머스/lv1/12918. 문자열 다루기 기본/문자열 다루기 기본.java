import java.util.*;

class Solution {
    public boolean solution(String s) {
        boolean answer = true;
        
        if(s.length() == 4 || s.length() == 6) {
            for(int i=0; i<s.length(); i++){
                char c = s.charAt(i);
                if(!Character.isDigit(c)) return false;
            }    
        } else return false;
        
        return answer;
    }
}