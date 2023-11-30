import java.util.Scanner;

public class Main {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int sum = n;
        int count = 0;
        
        while(sum <= m) {
            count++;
            n *= 2;
            sum += n;
            
        }
        
        System.out.print(count);
    }
    
}