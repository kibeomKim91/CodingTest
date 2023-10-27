import java.util.Scanner;

public class Main {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        int d = sc.nextInt();
        int x = 0;
        int y = b + d;
        
        if(a >= c) {
            x = a;
        } else {
            x = c;
        }
        
        System.out.print(2*(x+2) + 2*(y+2) - 4);
    }
    
}