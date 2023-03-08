class Solution {
    public int solution(int left, int right) {
        int answer = 0;
        
        for(int i=left; i<=right; i++){
            int yak = 0;
            
            for(int k=1; k<=i; k++){
                if(i % k == 0) yak++;
            }
            
            if(yak % 2 == 0) answer += i;
            else answer -= i;
        }
        
        return answer;
    }
}