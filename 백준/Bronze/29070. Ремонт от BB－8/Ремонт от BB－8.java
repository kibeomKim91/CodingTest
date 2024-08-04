import java.util.Scanner;

public class Main {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int h = sc.nextInt();
        int w = sc.nextInt();
        int result = 0;
        
        if(h/a>=1) {
            if(h%a==0) {
                result = h/a;
            } else {
                result = h/a+1;
            }
        } else {
            result = 1;
        }
        
        if(w/b>=1) {
            if(w%b==0) {
                result *= w/b;
            } else {
                result *= w/b+1;
            }
        }
        
        System.out.print(result);
    }
    
}