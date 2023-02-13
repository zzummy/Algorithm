import java.util.*;

class Solution {
    public int[] solution(int[] numlist, int n) {
        int[] answer = new int[numlist.length];
        List<Integer> nums = new ArrayList<>();
		Arrays.sort(numlist);
		for (int num : numlist) nums.add(num);
        
        nums.sort((s1, s2) -> Integer.compare(Math.abs(s2 - n), Math.abs(s1 - n)));
        Collections.reverse(nums);
        
        for(int i = 0; i < answer.length; i++)
            answer[i] = nums.get(i);
        
        return answer;
    }
}