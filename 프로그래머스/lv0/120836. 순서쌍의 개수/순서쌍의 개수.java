class Solution {
    public int solution(int n) {
        int answer = 0;
        
        int x = 1;
        while(n >= x){
            if(n % x == 0) answer++;
            x++;
        }
        
        return answer;
    }
}