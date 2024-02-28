import java.util.Scanner;

public class Main {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        double a = sc.nextInt();
        int b = sc.nextInt();
        
        for(int i=0; i<n; i++) {
            int num = sc.nextInt();
            double result = num/a*b;
            System.out.println((int) result);
        }
    }
    
}