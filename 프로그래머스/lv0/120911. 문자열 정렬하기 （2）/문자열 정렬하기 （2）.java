import java.util.*;

class Solution {
    public String solution(String my_string) {
        String answer = "";
        char[] arr = my_string.toLowerCase().toCharArray();
        Arrays.sort(arr);
        for(char c : arr)
            answer += c;
        return answer;
    }
}