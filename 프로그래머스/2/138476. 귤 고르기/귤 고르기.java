import java.util.*;

class Solution {
    public int solution(int k, int[] tangerine) {
        HashMap<Integer, Integer> map = new HashMap<>();        
        for(int i=0; i<tangerine.length; i++){
            map.put(tangerine[i], map.getOrDefault(tangerine[i], 0) + 1);
        }
        
        ArrayList<Integer> values = new ArrayList<>(map.values());
        Collections.sort(values, Collections.reverseOrder());
        
        int sum = 0;
        int answer = 0;
        for(int n : values){
            if(sum + n < k){
                sum += n;
                answer++;
            }else{
                answer++;
                break;
            }
        }
        
        return answer;
    }
}