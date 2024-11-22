import java.util.*;

public class Solution {
    public int[] solution(int []arr) {        
        Queue<Integer> q = new LinkedList<>();
        
        int tmp = -1;
        for(int i=0; i<arr.length; i++){
            if(tmp == arr[i]) continue;
            else{
                tmp = arr[i];
                q.offer(arr[i]);
            }
        }
        
        int[] answer = new int[q.size()];
        int cnt = 0;
        for(Integer n : q){
            answer[cnt++] = n;
        }
        
        return answer;
    }
}