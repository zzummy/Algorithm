import java.util.*;

class Solution {
    public String[] solution(String[] players, String[] callings) {
        HashMap<String, Integer> map = new HashMap<>();
        
        for(int i=0; i<players.length; i++){
            map.put(players[i], i);
        }
        
        for(String player : callings){
            // 해설진이 부른 선수의 등수 호출
            int idx = map.get(player);
            
            // 그 앞의 선수 호출
            String frontPlayer = players[idx-1];
            
            players[idx-1] = player;
            players[idx] = frontPlayer;
            
            map.put(player, idx-1);
            map.put(frontPlayer, idx);
        }
        
        return players;
    }
}