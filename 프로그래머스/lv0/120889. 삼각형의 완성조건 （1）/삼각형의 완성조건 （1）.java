class Solution {
    public int solution(int[] sides) {
        int answer = 0;
        
        int max = Integer.MIN_VALUE;
        int sum = 0;
        for(int i = 0; i < sides.length; i++){
            sum += sides[i];
            if(max <= sides[i]) {
                max = sides[i];
            }
        }
        sum -= max;
        
        return max < sum ? 1 : 2;
    }
}