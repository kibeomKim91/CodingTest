class Solution {
    public String solution(String my_string) {
        StringBuilder answer = new StringBuilder();  // StringBuilder를 사용하여 문자열을 더 효율적으로 조작

        // 문자열을 한 문자씩 순회
        for (int i = 0; i < my_string.length(); i++) {
            char c = my_string.charAt(i);

            // 대문자인 경우
            if (Character.isUpperCase(c)) {
                answer.append(Character.toLowerCase(c));
            }
            // 소문자인 경우
            else {
                answer.append(Character.toUpperCase(c));
            }
        }

        return answer.toString();  // StringBuilder 객체를 String으로 변환하여 반환
    }
}