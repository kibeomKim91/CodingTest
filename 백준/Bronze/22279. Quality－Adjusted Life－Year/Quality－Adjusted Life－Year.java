import java.util.Scanner;

public class Main {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        double sum = 0;
        
        for(int i=0; i<n; i++) {
            double a = sc.nextDouble();
            double b = sc.nextDouble();
            
            if(a != 0.0) {
                sum += a * b;
            }
        }
        
        System.out.print(sum);
    }
    
}