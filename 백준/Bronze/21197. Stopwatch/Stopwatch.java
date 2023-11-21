import java.util.Scanner;

public class Main {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int sum = 0;
        
        if(n%2 == 0) {
            for(int i=0; i<n/2; i++) {
                int a = sc.nextInt();
                int b = sc.nextInt();
                
                sum += b-a;
            }
            
            System.out.print(sum);
        } else {
            for(int i=0; i<n; i++) {
                int a = sc.nextInt();
            }
            
            System.out.print("still running");
        }
    }
    
}