class Solution {
    public int[] solution(int[] num_list) {
        
        int num_list_length = num_list.length;        
        int even_number = 0;
        int odd_number = 0;
        
        for(int i=0; i<num_list_length; i++) {
            if(num_list[i]%2 == 0) {
                even_number ++;
            } else if(num_list[i]%2 == 1) {
                odd_number ++;
            }            
        }
        
        int[] answer_array = {even_number, odd_number};
        
        return answer_array;
    }
}