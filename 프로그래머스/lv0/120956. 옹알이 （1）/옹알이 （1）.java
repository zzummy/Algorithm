class Solution {
    public int solution(String[] babbling) {
        int answer = 0;
        String[] ong = {"aya", "ye", "woo", "ma" };
        String[] check = babbling;
        
        for(int i = 0; i < babbling.length; i++){
            for(int j = 0; j < ong.length; j++){
                check[i] = check[i].replace(ong[j],"!");
                
                if(check[i].replace("!", "").equals("")){
                    answer++;
                    break;
                }
            }
        }
        
        return answer;
    }
}