class Solution {
    boolean[] visited;
    
    public void DFS(int n, int[][] arr){
        visited[n] = true;
        
        for(int i=0; i<arr.length; i++){
            if(!visited[i] && arr[n][i] == 1){
                DFS(i, arr);
            }
        }
    }
    
    public int solution(int n, int[][] computers) {
        int answer = 0;
        visited = new boolean[computers.length];
        
        for(int i=0; i<computers.length; i++){
            if(!visited[i]){
                DFS(i, computers);
                answer++;
            }
        }
        
        return answer;
    }
}