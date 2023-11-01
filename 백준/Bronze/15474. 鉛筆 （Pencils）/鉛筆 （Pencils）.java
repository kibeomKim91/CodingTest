import java.util.Scanner;

public class Main {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int x = sc.nextInt();
        int a = sc.nextInt();
        int y = sc.nextInt();
        int b = sc.nextInt();
        
        if(n%x == 0) {
            x = n/x;
        } else {
            x = n/x+1;
        }
        
        if(n%y == 0) {
            y = n/y;
        } else {
            y = n/y+1;
        }
        
        a = x*a;
        b = y*b;
        
        if(a >= b) {
            System.out.print(b);
        } else {
            System.out.print(a);
        }
    }
    
}