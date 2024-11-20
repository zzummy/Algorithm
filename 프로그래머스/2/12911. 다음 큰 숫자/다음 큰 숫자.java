class Solution {
    public int Count(String str){
        int cnt = 0;
        for(int i=0; i<str.length(); i++){
            if(str.charAt(i) == '1')
                cnt++;
        }
        return cnt;
    }
    
    public int solution(int n) {
        // int answer = 0;
        
        String binary = Integer.toBinaryString(n);
        
        while(true){
            int k = ++n;
            String bk = Integer.toBinaryString(k);
            
            if(Count(binary) == Count(bk)){
                return k;
            }
        }
        
        // return answer;
    }
}