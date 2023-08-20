class Solution {
    public String solution(String my_string, String alp) {
        StringBuilder answer = new StringBuilder();
        for(int i=0; i<my_string.length(); i++) {
            char currentChar = my_string.charAt(i);
            if(currentChar == alp.charAt(0)) {
                answer.append(Character.toUpperCase(currentChar));
            } else {
                answer.append(currentChar);
            }
        }
        
        return answer.toString();
    }
}
