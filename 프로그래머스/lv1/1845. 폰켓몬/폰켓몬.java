import java.util.*;

class Solution {
    public int solution(int[] nums) {
        int answer = 0;
        
        int N = nums.length;
        
        HashMap<Integer, Integer> map = new HashMap<>();
        for(int n : nums){
            map.put(n, map.getOrDefault(n,0) + 1);
        }
        
        int max = N / 2;
        if(map.size() >= max) answer = max;
        else answer = map.size();
        
        return answer;
    }
}