import java.util.Scanner;

public class Main {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        int d = sc.nextInt();
        int p = sc.nextInt();
        
        int x = a*p;
        int y = 0;
        
        if(c >= p) {
            y = b;
        } else {
            y = (p-c)*d+b;
        }
        
        if(x >= y) {
            System.out.print(y);
        } else {
            System.out.print(x);
        }
    }
    
}