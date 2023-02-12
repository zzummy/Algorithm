import java.util.*;

class Solution {
    public int solution(String before, String after) {
        String[] bArr = before.split("");
        String[] aArr = after.split("");
    
        Arrays.sort(bArr);
        Arrays.sort(aArr);
        
        for(int i=0; i<bArr.length; i++){
            if(!bArr[i].equals(aArr[i])) return 0;
        }
        return 1;
    }
}