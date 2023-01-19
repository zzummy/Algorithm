class Solution {
    public int solution(String t, String p) {
        int answer = 0;
        
        int len = p.length();
        long n = Long.parseLong(p);
        
        for(int i=0; i < t.length() - len + 1; i++){
            long cut = Long.parseLong(t.substring(i, i+len));
            if(cut <= n) answer++;
        }
        
        return answer;
    }
}