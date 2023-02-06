class Solution {
    public int solution(int[][] dots) {
        int answer = 0;
        float[] arr = new float[6];
        
        int idx = 0;
        for(int i = 0; i < 3; i++){
            for(int j = i+1; j < 4; j++){
                arr[idx++] = (float)(dots[i][1] - dots[j][1]) / (dots[i][0] - dots[j][0]);
            }
        }
        
        for(int i = 0; i < 5; i++){
            for(int j = i+1; j < 6; j++){
                String s1 = String.valueOf(arr[i]);
                String s2 = String.valueOf(arr[j]);
                if(s1.equals(s2)){
                    return 1;
                }
            }
        }
        
        return answer;
    }
}