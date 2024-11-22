import java.util.*;

class Solution {
    public int[] solution(int[] progresses, int[] speeds) {
        ArrayList<Integer> list = new ArrayList<>();
        Queue<Integer> q = new LinkedList<>();
        
        for(int i=0; i<progresses.length; i++){
            if((100 - progresses[i]) % speeds[i] == 0){
                q.offer((100 - progresses[i]) / speeds[i]);
            }else{
                q.offer((100 - progresses[i]) / speeds[i] + 1);
            }
        }
        
        int start = q.poll();
        int cnt = 1;
        while(!q.isEmpty()){
            if(start < q.peek()){
                list.add(cnt);
                cnt = 1;
                start = q.poll();
            }else{
                cnt++;
                q.poll();
            }
        }
        
        list.add(cnt);
        
        int[] answer = new int[list.size()];
        for(int i=0; i<answer.length; i++){
            answer[i] = list.get(i);
        }
        
        return answer;
    }
}