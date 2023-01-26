class Solution {
    public int solution(String my_string) {
        int answer = 0;
        
        for(int i = 0; i < my_string.length(); i++){
            int code = my_string.charAt(i);
            
            if(code >= 49 && code < 60) {
                answer += code - 48;
            }
        }
        return answer;
    }
}