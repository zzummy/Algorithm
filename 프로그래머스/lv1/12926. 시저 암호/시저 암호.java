class Solution {
    public String solution(String s, int n) {
        String answer = "";
        for(int i=0; i<s.length(); i++){
            char c = s.charAt(i);
            
            if(c != ' '){
                // 소문자
                if(Character.isLowerCase(c)){
                    c = (char)((c - 'a' + n) % 26 + 'a');
                }else{  // 대문자
                    c = (char)((c - 'A' + n) % 26 + 'A');
                }
                // 1 <= n < 26 인 자연수이므로 범위 초과경우 % 26으로 나머지연산                 
            }
            
            answer += c;
        }
        
        return answer;
    }
}