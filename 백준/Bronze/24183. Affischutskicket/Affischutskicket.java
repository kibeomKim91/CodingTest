import java.util.Scanner;

public class Main {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        
        double x = 0.229 * 0.324 * 2;
        double y = 0.297 * 0.420 * 2;
        double z = 0.210 * 0.297;
        
        System.out.print(a*x + b*y + c*z);
    }
    
}