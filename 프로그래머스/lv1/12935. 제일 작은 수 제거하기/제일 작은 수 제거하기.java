import java.util.*;

class Solution {
    public int[] solution(int[] arr) {
        int[] answer = {};
        
        if(arr.length != 1){
            answer = new int[arr.length -1];
            int min = Integer.MAX_VALUE;
            for(int i=0; i<arr.length; i++){
                min = min > arr[i] ? arr[i] : min;
            }
            
            int idx = 0;
            for(int i=0; i<arr.length; i++){
                if(arr[i] != min)
                    answer[idx++] = arr[i];
            }
        }else{
            answer = new int[1];
            answer[0] = -1;
        }
        return answer;
    }
}