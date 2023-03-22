class Solution {
    public int solution(int[] numbers) {
        int answer = 45;    // 0 ~ 9까지의 합
        for(int n : numbers)
            answer -= n;
        return answer;
    }
}