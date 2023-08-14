class Solution {
    public int solution(int n) {
        double sqrtValue = Math.sqrt(n);

        if (Math.pow((int) sqrtValue, 2) == n) {
            return 1;
        } else {
            return 2;
        }
    }
}