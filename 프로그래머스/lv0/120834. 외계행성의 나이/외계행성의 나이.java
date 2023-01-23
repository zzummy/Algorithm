import java.util.*;

class Solution {
    public String solution(int age) {
        String answer = "";
        String str_age = String.valueOf(age);
        String[] arr = str_age.split("");
        
        for(int i = 0; i < arr.length; i++)
            answer += (char)(Integer.parseInt(arr[i]) + 97);
        
        return answer;
    }
}