import java.util.Scanner;

public class Main {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        int n = sc.nextInt();
        int sum = 0;
        
        for(int i=0; i<n; i++) {
            int f = sc.nextInt();
            sum += f;
        }
        
        if(sum >= t) {
            System.out.print("Padaeng_i Happy");
        } else {
            System.out.print("Padaeng_i Cry");
        }
    }
    
}