import java.util.Scanner;

public class Main {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        int n = str.length();
        int result = 0;
        
        for(int i=0; i<n; i++) {
            if(str.charAt(i)-'0' != i+1) {
                result = -1;
                break;
            }
            
            if(i == n-1) {
                result = str.charAt(i)-'0';
            }
        }
        
        System.out.print(result);
    }
    
}