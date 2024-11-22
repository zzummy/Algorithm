import java.util.*;

class Solution {
    public int solution(int bridge_length, int weight, int[] truck_weights) {
        Queue<Integer> q = new LinkedList<>();
        
        int sum = 0;    // 다리에 올라간 트럭의 무게를 합친 값 - weight와 비교위함
        int time = 0;
        
        for(int i=0; i<truck_weights.length; i++){
            int truck = truck_weights[i];
            
            while(true){
                // 1) 큐가 비어있을 때
                // 2) bridge_length를 초과했을 때
                // 3) 큐가 아직 다 안찼을 때 (bridge_length 안넘겼을 때)
                if(q.isEmpty()){
                    q.offer(truck);
                    sum += truck;
                    time++;
                    break;
                }else if(q.size() == bridge_length){
                    sum -= q.poll();
                }else{
                    // 다음에 다리에 있는 트럭(sum)과 들어올 트럭의 합이 weight을 넘는지 확인
                    if(sum + truck > weight){
                        q.offer(0);
                        time++;
                    }else{
                        q.offer(truck);
                        sum += truck;
                        time++;
                        break;
                    }
                }
            }
        }
        
        return time + bridge_length;
    }
}