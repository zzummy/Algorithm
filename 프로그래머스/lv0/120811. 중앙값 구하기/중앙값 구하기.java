import java.util.Arrays;

class Solution {
    public int solution(int[] array) {
        int answer = 0;
        Arrays.sort(array);
        
        int len = array.length;
        answer = array[len/2];
        
        return answer;
    }
}