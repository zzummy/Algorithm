class Solution {
    public String solution(String myString) {
        String answer = "";
        myString = myString.replace("a", "A");
        
        for(int i=0; i<myString.length(); i++){
            String s = myString.charAt(i) +"";
            if(!s.equals("A"))
                s = s.toLowerCase();
            answer += s;
        }
        
        return answer;
    }
}