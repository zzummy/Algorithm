class Solution {
    public int solution(int order) {
        int answer = 0;
        
        char[] arr = (order + "").toCharArray();
        for(char c : arr){
            if(c == '3' || c == '6' || c == '9') answer++;
        }
        return answer;
    }
}