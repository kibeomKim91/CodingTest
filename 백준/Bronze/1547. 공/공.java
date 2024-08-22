import java.util.Scanner;

public class Main {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int result = 1;
        
        for(int i=0; i<n; i++) {
            int a = sc.nextInt();
            int b = sc.nextInt();
            
            if(result==a) {
                result = b;
            } else if(result==b) {
                result = a;
            }
        }
        
        System.out.print(result);
    }
    
}