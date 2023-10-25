import java.util.Scanner;

public class Main {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        int d = sc.nextInt();
        int count = 0;
        
        if(b < c-d || a > c+d) {
            System.out.print("IMPOSSIBLE");
            return;
        }
        
        for(int i=a; i<=b; i++) {
            if(i >= c-d && i <= c+d) {
                count++;
            }
            
            if(i > c+d) {
                break;
            }
        }
        
        System.out.print(count);
    }
    
}