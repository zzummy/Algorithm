class Solution {
    public String solution(String polynomial) {
        String answer = "";
        int xSum = 0, num = 0;
        for(String s : polynomial.split(" ")){
            if(s.contains("x")){
                xSum += s.equals("x") ? 1 : Integer.parseInt(s.replace("x",""));
            }else if(!s.equals("+")){
                num += Integer.parseInt(s);
            }
        }
        
        answer = (xSum != 0 ? (xSum == 1 ? "x" : xSum + "x") : "" )
            + (num != 0 ? (xSum != 0 ? " + " + num : num) : "");
        return answer;
    }
}