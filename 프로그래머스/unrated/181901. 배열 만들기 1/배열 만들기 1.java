class Solution {
    public int[] solution(int n, int k) {
        int[] answer = new int[n/k];
        int idx=0;
        for(int i=1; i<=n/k; i++)
            answer[idx++] = i*k;
        return answer;
    }
}