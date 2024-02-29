import java.util.Scanner;

public class Main {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        double m = sc.nextInt();
        double min = m;
        int result = 0;
        
        for(int i=0; i<n; i++) {
            int a = sc.nextInt();
            int b = sc.nextInt();
            
            if((m-a)/b < min) {
                min = (m-a)/b;
                result = i+1;
            }
        }
        
        System.out.print(result);
    }
    
}