import java.util.Scanner;

public class Main {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long n = sc.nextLong();
        long sum = 1;
        
        if(n == 0) {
            System.out.print(1);
            return;
        }
        
        for(int i=1; i<=n; i++) {
            sum *= i;
        }
        
        System.out.print(sum);
    }
    
}