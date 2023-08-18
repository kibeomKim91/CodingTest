class Solution {
    public int solution(int[] num_list) {
        int holesoo = 0;
        int jjacksoo = 0;
        int length = num_list.length;
        for(int i=0; i<length; i++) {
            if(num_list[i]%2 == 1) {
                holesoo *= 10;
                holesoo += num_list[i];
            } else if(num_list[i]%2 == 0) {
                jjacksoo *= 10;
                jjacksoo += num_list[i];                
            }
        }
        
        return holesoo + jjacksoo;
    }
}