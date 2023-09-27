class Solution {
    public int solution(int[] num_list) {
        int holsu = 0;
        int jjacksu = 0;
        
        for(int i=0; i<num_list.length; i++) {
            if(i % 2 == 0) {
                holsu += num_list[i];
            } else {
                jjacksu += num_list[i];
            }
        }
        
        return holsu > jjacksu ? holsu : jjacksu;
    }
}