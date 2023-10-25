import java.util.Scanner;

public class Main {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int x = 0;
        int count = 0;
        
        while(x != 1) {
            if(n%10 != 0) {
                x = 1;
            }
            
            n /= 10;
        }
        
        while(n >= 10) {
            if(n%10 == 0) {
                count++;
            }
            
            n /= 10;
        }
        
        System.out.print(count);
    }
    
}