class Solution {
    public String solution(String my_string) {
        String[] vowels = {"a", "e", "i", "o", "u"};
        
        for(String v : vowels){
            if(my_string.contains(v))
                my_string = my_string.replace(v ,"");
        }
        
        return my_string;
    }
}