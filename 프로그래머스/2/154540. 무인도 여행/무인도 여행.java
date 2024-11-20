import java.util.*;

class Solution {
    List<Integer> days = new ArrayList<>();
    char[][] arr;
    boolean[][] visited;
    
    int[] dx = {0, 0, -1, 1};   // 상 하 좌 우
    int[] dy = {1, -1, 0, 0};
    int sum = 0;
    
    public void DFS(int x, int y){
        sum += arr[x][y]-'0';
        visited[x][y] = true;
        
        // 상 하 좌 우 로 탐색
        for(int d=0; d<4; d++){
            int newX = x + dx[d];
            int newY = y + dy[d];
            
            // 범위 확인
            if(newX < 0 || newX >= arr.length || newY < 0 || newY >= arr[0].length){
                continue;
            }
            
            if(!visited[newX][newY] && arr[newX][newY] != 'X'){
                DFS(newX, newY);
            }
        }
        
        // return sum;
    }
    
    public int[] solution(String[] maps) {      
        arr = new char[maps.length][maps[0].length()];
        visited = new boolean[arr.length][arr[0].length];
        
        // String을 char[]으로 반환
        for(int i=0; i<maps.length; i++){
            arr[i] = maps[i].toCharArray();
        }
        
        // 무인도인지 바다(X)인지 && 방문한 적 없는지 확인
        for(int i=0; i<arr.length; i++){
            for(int j=0; j<arr[i].length; j++){
                if(arr[i][j] != 'X' && !visited[i][j]){
                    DFS(i, j);
                    days.add(sum);
                    sum = 0;
                }
            }
        }
        
        // 무인도가 없는 경우
        if(days.isEmpty()){
            return new int[]{-1};
        }
        
        // List 오름차순 정렬
        Collections.sort(days);
        int[] answer = new int[days.size()];
        
        for(int i=0; i<answer.length; i++){
            answer[i] = days.get(i);
        }
        
        return answer;
    }
}