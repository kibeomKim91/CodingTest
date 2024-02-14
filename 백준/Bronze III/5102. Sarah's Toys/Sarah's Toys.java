import java.util.Scanner;

public class Main {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        while(true) {
            int a = sc.nextInt();
            int b = sc.nextInt();
            int two = 0;
            int three = 0;
            
            if(a == 0 && b == 0) {
                break;
            }
            
            a -= b;
            if(a >= 3 && a % 2 == 1) {
                three = 1;
                a -= 3;
            }
            
            two = a/2;
            System.out.println(two+" "+three);
        }
    }
    
}