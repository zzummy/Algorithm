class Solution {
    public int solution(int[] array, int n) {      
        int min = Integer.MAX_VALUE;
        int idx = 0;
        
        for(int i = 0; i < array.length; i++){
            int diff = Math.abs(n - array[i]);
            if(min > diff){
                idx = i;
                min = diff;
            }else if(min == diff){
                idx = array[idx] > array[i] ? i : idx;
            }
        }
        
        return array[idx];
    }
}