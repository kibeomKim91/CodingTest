import java.util.Arrays;

class Solution {
    public int solution(int[] array) {
        int centerIndex = array.length/2;
        Arrays.sort(array);
        int arrayCenterNum = array[centerIndex];
        return arrayCenterNum;
    }
}