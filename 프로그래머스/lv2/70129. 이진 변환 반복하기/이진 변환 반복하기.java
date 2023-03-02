class Solution {
    public int[] solution(String s) {
        int[] answer = {};
        int cnt = 0, zero = 0;
        
        while(!s.equals("1")){
            int len = s.length();
            s = s.replace("0", "");
            zero += len - s.length();
            cnt++;
            s = Integer.toBinaryString(s.length());
        }
        
        return new int[]{cnt, zero};
    }
}