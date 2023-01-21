class Solution {
    public double solution(int[] numbers) {
        double answer = 0;
        
        int sum = 0;
        int k = numbers.length;
        for(int n : numbers){
            sum += n;
        }
        
        answer = (double)sum / k;
        
        return answer;
    }
}