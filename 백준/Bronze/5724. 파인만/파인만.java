import java.util.Scanner;

public class Main {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        while(true) {
            int n = sc.nextInt();
            int sum = 0;
            
            if(n == 0) {
                break;
            }
            
            for(int i=n; i>=1; i--) {
                sum += i*i;
            }
            
            System.out.println(sum);
        }
    }
    
}