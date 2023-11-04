import java.util.Scanner;

public class Main {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        long a = 1;
        
        for(int i=1; i<=n; i++) {
            a *= i;
        }
        
        System.out.print(a/60/60/24/7);
    }
    
}