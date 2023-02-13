class Solution {
    public String solution(String bin1, String bin2) {
        int answer = 0;
        String[] b1 = bin1.split("");
        String[] b2 = bin2.split("");
        
        for(int i=0; i<b1.length; i++){
            answer +=  (int)Math.pow(2, b1.length - i - 1) * Integer.parseInt(b1[i]);  
        }
        
        for(int i=0; i<b2.length; i++)
            answer +=  (int)Math.pow(2, b2.length - i - 1) * Integer.parseInt(b2[i]);  
        
        return Integer.toBinaryString(answer);
    }
}