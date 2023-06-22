class Solution {
    public String solution(int[] food) {       
        StringBuilder sb = new StringBuilder();
        
        for(int i = 1; i < food.length; i++){
            int n = food[i] / 2;
            if(n > 0){
                sb.append(Integer.toString(i).repeat(n));
            }
        }
        
        String answer = sb + "0";
        answer += sb.reverse().toString();
        
        return answer;
    }
}