import java.util.Scanner;

public class Main {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int x = 0;
        int y = 0;
        
        if(a+b >= a-b) {
            x = a+b;
            y = a-b;
        } else {
            x = a-b;
            y = a+b;
        }
        
        System.out.println(x);
        System.out.println(y);
    }
    
}