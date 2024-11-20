// 모든 항공권 사용 -> 모든 경로 탐색 -> DFS
import java.util.*;

class Solution {
    boolean[] visited;
    ArrayList<String> list;
    
    public void DFS(String start, String route, String[][] tickets, int cnt){
        if(cnt == tickets.length){
            list.add(route);
            return;
        }
        for(int i=0; i<tickets.length; i++){
            if(!visited[i] && start.equals(tickets[i][0])){
                visited[i] = true;
                DFS(tickets[i][1], route + " " + tickets[i][1], tickets, cnt+1);
                visited[i] = false;
            }
        }
    }
    
    public String[] solution(String[][] tickets) {
        String[] answer = {};
        
        visited = new boolean[tickets.length];
        list = new ArrayList<>();
        
        DFS("ICN", "ICN", tickets, 0);
        
        Collections.sort(list);
        answer = list.get(0).split(" ");
        
        return answer;
    }
}