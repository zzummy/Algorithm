class Solution {
    boolean solution(String s) {
        int p=0, y=0;
        for(int i=0; i<s.length(); i++){
            char c = Character.toUpperCase(s.charAt(i));
            if(c == 'P') p++;
            else if(c == 'Y') y++;
        }
        
        return p==y ? true : false;
    }
}