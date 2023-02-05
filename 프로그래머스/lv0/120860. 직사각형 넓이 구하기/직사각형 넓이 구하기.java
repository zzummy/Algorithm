class Solution {
    public int solution(int[][] dots) {
        int answer = 0;
        int maxX =Integer.MIN_VALUE;
        int maxY = Integer.MIN_VALUE;
        
        for(int i = 1; i < 4; i++){
            int disX = Math.abs(dots[0][0] - dots[i][0]);
            int disY = Math.abs(dots[0][1] - dots[i][1]);
            if(disX != 0){
                maxX = maxX <= disX ? disX : maxX;
            }else if(disY != 0){
                maxY = maxY <= disY ? disY : maxY;
            }
                            
        }
        return maxX * maxY;
    }
}