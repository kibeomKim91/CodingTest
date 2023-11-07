import java.util.Scanner;

public class Main {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        
        for(int i=0; i<n; i++) {
            double a = sc.nextDouble();
            double b = sc.nextDouble();
            double c = a*2/b;
            
            System.out.printf("The height of the triangle is %.2f units\n", c);
        }
    }
    
}