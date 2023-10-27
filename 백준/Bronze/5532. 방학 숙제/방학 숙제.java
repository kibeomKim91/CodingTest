import java.util.Scanner;

public class Main {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int l = sc.nextInt();
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        int d = sc.nextInt();
        
        if(a%c == 0) {
            a /= c;
        } else {
            a = a/c+1;
        }
        
        if(b%d == 0) {
            b /= d;
        } else {
            b = b/d+1;
        }
        
        if(b > a) {
            a = b;
        }
        
        System.out.print(l-a);
    }
    
}