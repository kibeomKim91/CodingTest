class Solution {
    public int solution(int n) {
        int answer = 0;
        for(int i = 1; i <= Math.sqrt(n); i++) {
            if(n % i == 0) {
                answer++; // (i, n/i)라는 순서쌍이 있음
                if (i != n / i) { // i와 n/i가 같지 않을 경우에만 추가 순서쌍이 가능
                    answer++; // (n/i, i)라는 순서쌍도 있음
                }
            }
        }
        return answer;
    }
}