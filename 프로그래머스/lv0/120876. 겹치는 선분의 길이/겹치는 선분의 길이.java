class Solution {
    public int solution(int[][] lines) {
        int answer = 0;
        int[] arr = new int[201];
        
        // linew는 -100 ~ 100이므로 +100씩 하면 0 ~ 200이 되어 수월함
        for(int i =0; i < lines.length; i++){
            for(int j = lines[i][0] + 100; j < lines[i][1] + 100; j++){
                arr[j]++;
            }
        }
        
        for(int n : arr){
            // 1이상이면 겹친 부분이므로
            if(n > 1) answer++;
        }
        return answer;
    }
}