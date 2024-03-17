import java.util.Scanner;

public class Main {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = a+b;
        int count = 0;
        
        while(c > 0) {
            c /= 10;
            count++;
        }
        
        System.out.print(count);
    }
    
}