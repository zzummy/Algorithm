class Solution {
    public String[] solution(String my_str, int n) {
        int len = my_str.length() % n == 0 ? my_str.length() / n : my_str.length() / n +1;
        String[] answer = new String[len];
        int idx = 0;
        for(int i = 0; i < answer.length; i++){
            answer[i] = my_str.substring(i*n, (i+1)*n > my_str.length() ? my_str.length(): (i+1)*n); 
        }
        return answer;
    }
}