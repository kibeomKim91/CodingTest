class Solution {
    
    public int solution(String my_string, String is_suffix) {
        if(my_string.length() >= is_suffix.length()) {
            if(my_string.substring(my_string.length()-is_suffix.length()).equals(is_suffix)) {
                return 1;
            } else {
                return 0;
            }
        } else {
            return 0;
        }        
    }
    
}