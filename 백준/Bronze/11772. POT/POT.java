import java.util.Scanner;

public class Main {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int sum = 0;
        
        for(int i=0; i<n; i++) {
            int num = sc.nextInt();
            int a = num/10;
            int b = num%10;
            
            sum += (int) Math.pow(a, b);
        }
        
        System.out.print(sum);
    }
    
}