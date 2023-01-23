class Solution {
    public int solution(int n, int k) {
        int answer = 0;
        int service = n >= 10 ? n / 10 : 0;
        answer = n * 12000 + (k - service) * 2000;
        return answer;
    }
}