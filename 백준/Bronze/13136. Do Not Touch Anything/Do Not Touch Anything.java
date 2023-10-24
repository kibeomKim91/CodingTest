import java.util.Scanner;

public class Main {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        int x = 0;
        int y = 0;
        
        if(a%c == 0) {
            x = a/c;
        } else {
            x = a/c + 1;
        }
        
        if(b%c == 0) {
            y = b/c;
        } else {
            y = b/c + 1;
        }
        
        System.out.print((long)x*y);
    }
    
}