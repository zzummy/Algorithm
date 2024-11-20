class Solution {
    boolean[] visited;
    int answer = 0;
    
    public void DFS(String begin, String target, String[] words, int cnt){
        if(begin.equals(target)){
            answer = cnt;
            return;
        }
        
        for(int i=0; i<words.length; i++){
            if(visited[i]) continue;
            
            // 같은 알파벳이 몇개인지 파악하기
            int n = 0;
            for(int j=0; j<begin.length(); j++){
                if(begin.charAt(j) == words[i].charAt(j))
                    n++;
            }
                
            // 한글자 빼고 모두 같은 경우
            if(n == begin.length() -1){
                visited[i] = true;
                DFS(words[i], target, words, cnt+1);
                visited[i] = false;     // 모든 경우의 수 파악위해
            }
        }
    }
    
    public int solution(String begin, String target, String[] words) {
        visited = new boolean[words.length];
        
        DFS(begin, target, words, 0);
                
        return answer;
    }
}