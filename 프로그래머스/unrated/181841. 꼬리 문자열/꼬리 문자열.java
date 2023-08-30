class Solution {
    public String solution(String[] str_list, String ex) {
        // 결과를 저장할 변수
        StringBuilder answer = new StringBuilder();
        
        // str_list의 각 원소에 대하여
        for (String str : str_list) {
            // 해당 원소가 ex를 포함하지 않으면 answer에 추가
            if (!str.contains(ex)) {
                answer.append(str);
            }
        }
        
        return answer.toString();
    }
}