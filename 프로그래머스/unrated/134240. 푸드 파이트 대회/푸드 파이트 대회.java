class Solution {
    public String solution(int[] food) {       
        String first = "";
        for(int i = 1; i < food.length; i++){
            int n = food[i] / 2;
            if(n > 0){
                first += Integer.toString(i).repeat(n);
            }
        }
        
        StringBuilder sb = new StringBuilder(first);
        String second = sb.reverse().toString();
        
        return first + "0" + second;
    }
}