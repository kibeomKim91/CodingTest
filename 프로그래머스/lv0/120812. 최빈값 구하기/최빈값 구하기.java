import java.util.HashMap;
import java.util.Map;

class Solution {
    public int solution(int[] array) {
        Map<Integer, Integer> map = new HashMap<>();
        int manyNum = 0;
        int manyNumKey = 0;

        for (int num : array) {
            map.put(num, map.getOrDefault(num, 0) + 1);

            int repeatNum = map.get(num);
            if (manyNum < repeatNum) {
                manyNum = repeatNum;
                manyNumKey = num;
            } else if (manyNum == repeatNum) {
                manyNumKey = -1;
            }
        }

        return manyNumKey;
    }
}