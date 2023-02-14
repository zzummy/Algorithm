class Solution {
    public int solution(String A, String B) {
        int answer = 0;
        String copyA = A;
        for(int i = 0; i < A.length(); i++){
            if(copyA.equals(B)) return answer;
            String str = copyA.substring(copyA.length()-1);
            copyA = str + copyA.substring(0, copyA.length()-1);
            answer++;
        }
        return -1;
    }
}