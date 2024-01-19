class Solution {
    public int solution(int n) {
        int answer = 0;
        
        if(n%2 == 0){
            while(n > 0){
                answer += Math.pow(n,2);
                n -= 2;
            }
        }else{
            while(n > 0){
                answer += n;
                n -= 2;
            }
        }
        
        return answer;
    }
}