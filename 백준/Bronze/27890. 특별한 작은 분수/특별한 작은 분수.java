import java.util.Scanner;

public class Main {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int n = sc.nextInt();
        
        sc.close();
        
        for(int i=0; i<n; i++) {
            if(x % 2 == 0) {
                x = (x / 2) ^ 6;
            } else {
                x = (2 * x) ^ 6;
            }
        }
        
        System.out.print(x);
    }
    
}