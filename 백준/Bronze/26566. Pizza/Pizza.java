import java.util.Scanner;

public class Main {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        
        for(int i=0; i<n; i++) {
            double a = sc.nextDouble();
            int b = sc.nextInt();
            int c = sc.nextInt();
            int d = sc.nextInt();
            
            double slice = a / b;
            double whole = Math.PI * c * c / d;
            
            if(slice > whole) {
                System.out.println("Slice of pizza");
            } else {
                System.out.println("Whole pizza");
            }
        }
    }
    
}