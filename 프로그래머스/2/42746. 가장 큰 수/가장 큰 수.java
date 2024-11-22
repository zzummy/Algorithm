import java.util.*;

class Solution {
    public String solution(int[] numbers) {
        String[] arr = new String[numbers.length];
        
        for(int i=0; i<numbers.length; i++){
            arr[i] = String.valueOf(numbers[i]);
        }
        
        Arrays.sort(arr, (s1, s2) -> (s2+s1).compareTo(s1+s2));
        
        StringBuilder answer = new StringBuilder();
        for(String str : arr){
            answer.append(str);
        }
        
        if(answer.charAt(0) == '0')
            return "0";
        
        return answer.toString();
    }
}