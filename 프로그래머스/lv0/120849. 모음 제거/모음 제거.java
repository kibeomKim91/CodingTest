class Solution {
    public String solution(String my_string) {
        StringBuilder answer = new StringBuilder();  // StringBuilder를 이용해 문자열을 빌드

        for (int i = 0; i < my_string.length(); i++) {
            char ch = my_string.charAt(i);  // 문자열의 i번째 문자

            // 모음이 아닌 경우에만 StringBuilder에 추가
            if (ch != 'a' && ch != 'e' && ch != 'i' && ch != 'o' && ch != 'u') {
                answer.append(ch);
            }
        }

        return answer.toString();  // StringBuilder를 String으로 변환해서 반환
    }
}