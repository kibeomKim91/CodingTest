class Solution {
    public int[] solution(int[] num_list) {
        int numListLength = num_list.length;
        int sum = 0;
        int[] answer_List = new int[numListLength + 1];
        if (num_list[numListLength-1] > num_list[numListLength-2]) {
            sum = num_list[numListLength-1] - num_list[numListLength-2];
        } else {
            sum = num_list[numListLength-1] * 2;
        }
        for (int i=0; i<numListLength; i++) {
            answer_List[i] = num_list[i];
        }
        answer_List[numListLength] = sum;
        return answer_List;
    }
}