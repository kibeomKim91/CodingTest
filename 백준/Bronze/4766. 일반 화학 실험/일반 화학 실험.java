import java.util.Scanner;

public class Main {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int count = 0;
        double copy = 0.0;
        
        while(true) {
            double d = sc.nextDouble();
            
            if(d == 999.0) {
                break;
            }
            
            if(count > 0) {
                System.out.printf("%.2f\n", d-copy);
            }
            
            count++;
            copy = d;
        }
    }
    
}