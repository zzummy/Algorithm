import java.util.*;

class Solution {
    public int solution(String[] spell, String[] dic) {
        int answer = 0;
        boolean[] chk = new boolean[spell.length];
        
        for(String dic_str : dic){
            String[] arr = dic_str.split(""); 
            for(String str : arr){
                for(int j = 0; j < spell.length; j++){
                    if(str.equals(spell[j]) && !chk[j]) {
                        chk[j] = true;
                    }
                }
            }
            
            // chk 함수 모두가 true면 1 반환
            int sum = 0;
            for(boolean b : chk){
                sum += b ? 1 : 0;
            }
            
            if(sum == spell.length){
                return 1;
            }else{
                Arrays.fill(chk, false);
            }           
        }
                 
        return 2;
    }
}