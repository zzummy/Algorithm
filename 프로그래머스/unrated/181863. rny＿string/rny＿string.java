class Solution {
    public String solution(String rny_string) {
        String answer = "";
        for(int i=0; i<rny_string.length(); i++){
            String str = rny_string.charAt(i) +"";
            if(str.equals("m")) answer += "rn";
            else answer += str;
        }
        return answer;
    }
}