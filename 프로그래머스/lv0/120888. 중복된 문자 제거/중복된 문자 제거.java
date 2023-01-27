import java.util.*;
class Solution {
    public String solution(String my_string) {
        String answer = "";
        
        char[] arr = my_string.toCharArray();
        for(char c : arr){
            String str = Character.toString(c);
            if(!answer.contains(str)) answer += str;
        }
        
        return answer;
    }
}