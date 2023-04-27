class Solution {
    public int solution(String my_string, String target) {
        int answer = 0;
        for(int i=0; i<target.length(); i++){
            String find = String.valueOf(target.charAt(i));
            for(int j=0; j<my_string.length(); j++){
                String my = String.valueOf(my_string.charAt(j));
                if(my.equals(find)){
                    answer++;
                    break;
                }
            }
        }
        return answer == target.length() ? 1 : 0;
    }
}