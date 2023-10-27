import java.util.Scanner;

public class Main {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        int d = sc.nextInt();
        
        if(a == c && b == d) {
            System.out.print(0 + " " + 0);
            return;
        } else {
            if(a > c || (a == c && b > d)) {
                c += 24;                
            }
        }
        
        int minute = (60*c+d)-(60*a+b);
        System.out.print(minute + " " + minute/30);        
    }
    
}