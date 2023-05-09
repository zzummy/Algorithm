class Solution {
    public int solution(int n, String control) {
        for(int i=0; i<control.length(); i++){
            char c = control.charAt(i);
            if(c=='w')
                n++;
            else if(c=='s')
                n--;
            else if(c=='d')
                n+=10;
            else if(c=='a')
                n-=10;  
        }
        
        return n;
    }
}