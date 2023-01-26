import java.util.*;

class Solution {
    public ArrayList<Integer> solution(String my_string) {
        ArrayList<Integer> answer = new ArrayList<>();
        
        for(char c : my_string.toCharArray()){
            int num = c - '0';
            if(num >= 0 && num < 10){
                answer.add(num);
            }else continue;
        }
        
        // ArrayList 정렬 방법
        Collections.sort(answer);
        return answer;
    }
}