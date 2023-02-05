class Solution {
    public int solution(String my_string) {
        int answer = 0;
        // 알파벳 모두 소문자로 바꾸고 공백 처리
        my_string = my_string.replaceAll("\\D"," ").trim();
        String[] arr = my_string.split("\\s+");
        for(String s : arr){
            answer += s.length() != 0 ? Integer.parseInt(s) : 0;
        }
            
        return answer;
    }
}