import java.util.*;
import java.io.*;

public class Solution {
    static Queue<Integer> q = new LinkedList<>();
    public int[] solution(int []arr) throws IOException{
        
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