class Solution {
    public String solution(String my_string, int k) {
        // String answer = "";
        // for(int i=0; i<k; i++)
        //     answer += my_string;
        // return answer;
        
        // 간단한 repeat() 사용
        // 주어진 횟수만큼 반복
        return my_string.repeat(k);
    }
}