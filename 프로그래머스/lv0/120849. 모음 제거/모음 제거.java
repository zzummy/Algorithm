import java.util.*;

class Solution {
    public String solution(String my_string) {
        StringBuilder answer = new StringBuilder();
        
        
        // 모음 배열 선언
        char[] vowel = {'a', 'e', 'i', 'o', 'u'};
        
        for(int i = 0; i < my_string.length(); i++){
            boolean not_vowl = true;
            for(int j = 0; j < vowel.length; j++){
                 if(vowel[j] == my_string.charAt(i)) {
                    not_vowl = false;
                }
            }
            if(not_vowl)
                answer.append(my_string.charAt(i));
        }
        
        return answer.toString();
    }
}