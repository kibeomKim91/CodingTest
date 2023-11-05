import java.util.Scanner;

public class Main {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        int x = 0;
        int y = 0;
        
        if(b >= c) {
            x = c;
            y = a-b;
        } else {
            x = b;
            y = a-c;
        }
        
        System.out.print(x+y);
    }
    
}