class Solution {
    public int solution(String my_string, String is_suffix) {
        int len = my_string.length();
        if(len < is_suffix.length()) return 0;
        String str = my_string.substring(len - is_suffix.length(), len);
        return is_suffix.equals(str) ? 1 : 0;
    }
}