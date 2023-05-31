class Solution {
    public int solution(int[][] sizes) {
        int maxW = 0;
        int maxH = 0;
        
        for(int i=0; i<sizes.length; i++){
            int W = Math.min(sizes[i][0], sizes[i][1]); 
            int h = Math.max(sizes[i][0], sizes[i][1]); 

            maxW = Math.max(maxW, W);
            maxH = Math.max(maxH, h);
        }
        
        return maxW * maxH;
    }
    
}