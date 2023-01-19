class Solution {
    public int[] solution(int numer1, int denom1, int numer2, int denom2) {
        int[] answer = {};
        
         // 분자
        int x = numer1 * denom2 + numer2 * denom1;
        
        // 분모
        int y = denom1 * denom2;
        
        // denom1,2의 최대공약수 구하기
        int max = 0;
        for(int i = 1; i <= x && i <= y; i++ ){
            if(x % i == 0 && y % i == 0) max = i;
        }
        
        if(x % max == 0 && y % max == 0){
            x = x/max;
            y = y/max;
        }
        
        answer = new int[]{x,y};
        
        return answer;
    }
}