class Solution {
    public int solution(int[] numbers) {
        int answer = 0;
        int max = Integer.MIN_VALUE;
        for(int i = 0; i < numbers.length; i++){
            for(int j = 0; j < numbers.length; j++){
                if(i != j) {
                    int mul = numbers[i] * numbers[j];
                    if(max <= mul) max = mul;
                }
                
            }
        }
        return max;
    }
}