import java.util.Scanner;

public class Main {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int result = n;
        
        while(n >= m) {
            result += n/m;
            n /= m;
        }
        
        System.out.print(result);
    }
    
}