class Solution {
    boolean solution(String s) {
        int open = 0, close = 0;
        for(int i=0; i<s.length(); i++){
            char c = s.charAt(i);
            if(c == '(') open++;
            else close++;
            if(open < close) return false;
        }

        return open == close ? true : false;
    }
}