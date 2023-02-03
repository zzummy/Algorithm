class Solution {
    public int solution(int[] array) {
        int answer = 0;
        for(int n : array){
            while(n != 0){
                if(n % 10 == 7) answer++;
                n /= 10;
            }
        }
        return answer;
    }
}