import java.util.Scanner;

public class Main {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int count = 0;
        int result = 0;
        
        for(int i=0; i<n; i++) {
            int num = sc.nextInt();
            
            if(num > 0) {
                count++;
            } else if(num == 0) {
                if(count > result) {
                    result = count;
                }
                
                count = 0;
            }
            
            if(i == n-1 && count > result) {
                result = count;
            }
        }
        
        System.out.print(result);
    }
    
}