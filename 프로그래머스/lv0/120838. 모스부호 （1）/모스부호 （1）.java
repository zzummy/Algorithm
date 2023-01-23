class Solution {
    public String solution(String letter) {
        String answer = "";
        String[] code = letter.split(" ");
        String[] morse = {".-","-...","-.-.","-..",".","..-.","--.","....","..",".---","-.-",".-..","--","-.","---",".--.","--.-",".-.","...","-","..-","...-",".--","-..-","-.--","--.."};
        
        for(int i = 0; i < code.length; i++){
            for(int j = 0; j < morse.length; j++){
                if(code[i].equals(morse[j])){
                    answer += (char)('a' + j);
                    break;
                }
            }
        }
        
        return answer;
    }
}