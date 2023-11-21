import java.util.Scanner;

public class Main {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        while(true) {
            int n = sc.nextInt();
            
            if(n == -1) {
                break;
            }
            
            int sum = 0;
            int x = 0;
            
            for(int i=0; i<n; i++) {
                int a = sc.nextInt();
                int b = sc.nextInt();
                
                sum += a * (b-x);
                
                x = b;
            }
            
            System.out.println(sum+" miles");
        }
    }
    
}