import java.util.Scanner;

public class Main {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int x = sc.nextInt();
        int b = sc.nextInt();
        int y = sc.nextInt();
        int t = sc.nextInt() * 21;
        
        if(t > 45*21) {
            System.out.print((t-30*21)*x+a+" "+((t-45*21)*y+b));
        } else if(t > 30*21 && t <= 45*21) {
            System.out.print((t-30*21)*x+a+" "+b);
        } else if(t <= 30*21) {
            System.out.print(a+" "+b);
        }
    }
    
}