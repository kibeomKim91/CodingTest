class Solution {
    public String solution(String myString) {
        StringBuilder answer = new StringBuilder(); // StringBuilder를 사용하여 문자열을 만듭니다.
        
        for (char ch : myString.toCharArray()) { // 문자열의 각 문자에 대해
            if (ch == 'a') { // 만약 문자가 'a'이면
                answer.append('A'); // 'A'를 추가합니다.
            } else if (ch != 'A' && Character.isUpperCase(ch)) { // 문자가 'A'가 아닌 다른 대문자이면
                answer.append(Character.toLowerCase(ch)); // 소문자로 변환하여 추가합니다.
            } else { // 그렇지 않으면 (소문자이거나 'A'이면)
                answer.append(ch); // 문자를 그대로 추가합니다.
            }
        }
        
        return answer.toString(); // 완성된 문자열을 반환합니다.
    }
}