import java.util.*;

class Solution {
    public String solution(String s) {
        String answer = "";
        String[] str = s.split("");
        
        Map<String, Integer> map = new TreeMap<>();
        
        for(int i = 0; i < str.length; i++){
            map.put(str[i], map.getOrDefault(str[i], 0) + 1);
        }
        
        
        for(String key : map.keySet()){
            if(map.get(key) == 1)
                answer += key;
        }
        
        return answer;
    }
}