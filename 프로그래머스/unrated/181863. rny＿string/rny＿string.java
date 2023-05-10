class Solution {
    public String solution(String rny_string) {
        // String replaceAll(String regex, String replacement)
        // 대상 문자열을 원하는 문자 값으로 변환하는 함수
        String answer = rny_string.replaceAll("m", "rn");
        return answer;
    }
}