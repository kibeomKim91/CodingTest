import java.util.Scanner;

public class Main {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int a = 0;
        int b = 0;
        
        while (n > 0) {
            if(n >= 3) {
                a++;
                b += 2;
            } else if(n == 2) {
                a++;
                b++;
            } else {
                b++;
            }
            
            n -= 3;
        }
        
        System.out.print(a+" "+b);
    }
    
}