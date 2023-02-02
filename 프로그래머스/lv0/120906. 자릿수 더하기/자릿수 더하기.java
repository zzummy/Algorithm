class Solution {
    public int solution(int n) {
        int answer = 0;
        String[] arr = Integer.toString(n).split("");
        for(String s : arr)
            answer += Integer.parseInt(s);
        return answer;
    }
}