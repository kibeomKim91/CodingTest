import java.util.Scanner;

public class Main {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        
        if(a+2*b+3*c >= 10) {
            System.out.print("happy");
        } else {
            System.out.print("sad");
        }
    }
    
}