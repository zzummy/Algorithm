class Solution {
    public int solution(int num) {
        int answer = 0;
        
        // 예시3의 626331은 계산 중에 int 자료형의 범위를 초과함
        long n = num;
        if(n == 1) return 0;
        
        while(n != 1){
            if(n % 2 == 0){
                n /= 2;
            }else{
                n *= 3;
                n++;
            }
            answer++;
        }
        
        return answer < 500 ? answer : -1;
    }
}