import java.util.Scanner;

public class Main {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        int result = 0;
        
        if(a==0) {
            result = c*c-b;
        } else if(b==0) {
            result = c*c-a;
        } else if(c==0) {
            result = (int) Math.sqrt(a+b);
        }
        
        System.out.print(result);
    }
    
}