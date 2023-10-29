import java.util.Scanner;

public class Main {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        
        if(a+b+c >= 100) {
            System.out.print("OK");
        } else {
            if(a < b && a < c) {
                System.out.print("Soongsil");
            } else if(b < a && b < c) {
                System.out.print("Korea");
            } else if(c < a && c < b) {
                System.out.print("Hanyang");
            }
        }
    }
    
}