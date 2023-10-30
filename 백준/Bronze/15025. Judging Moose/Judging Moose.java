import java.util.Scanner;

public class Main {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        
        if(a == b) {
            if(a == 0 && b == 0) {
                System.out.print("Not a moose");
            } else {
                System.out.print("Even " + (a+b));
            }            
        } else {
            if(a > b) {
                System.out.print("Odd " + a*2);
            } else if(b > a) {
                System.out.print("Odd " + b*2);
            }
        }
    }
    
}