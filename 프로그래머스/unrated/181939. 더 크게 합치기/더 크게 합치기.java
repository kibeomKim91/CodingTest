class Solution {
    public int solution(int a, int b) {        
        int AB = Integer.parseInt(Integer.toString(a) + Integer.toString(b));
        int BA = Integer.parseInt(Integer.toString(b) + Integer.toString(a));
        
        if(AB > BA) {
            return AB;
        } else if(BA > AB) {
            return BA;
        } else {
            return AB;
        }        
    }
}