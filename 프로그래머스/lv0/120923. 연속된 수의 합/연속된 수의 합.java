class Solution {
    public int[] solution(int num, int total) {
        int[] answer = new int[num];
        
        int sum = num * (1 + num) / 2;
        int start = (total - sum) / num;
        
        for(int i=1; i<= num; i++)
            answer[i-1] = i + start;
        
        return answer;
    }
}