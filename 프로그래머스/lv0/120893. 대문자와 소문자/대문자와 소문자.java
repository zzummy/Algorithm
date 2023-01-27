class Solution {
    public String solution(String my_string) {
        String answer = "";
        
        char[] arr = my_string.toCharArray();
        for(char c : arr){
           c = Character.isUpperCase(c) ? Character.toLowerCase(c) : Character.toUpperCase(c);
            answer += Character.toString(c);
        }
        
        return answer;
    }
}