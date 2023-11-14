import java.util.Scanner;

public class Main {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int a = sc.nextInt();
        int b = sc.nextInt();
        
        if(a == b && n <= b) {
            System.out.print("Anything");
        } else if(a > b && n <= b) {
            System.out.print("Subway");
        } else if(a < b) {
            System.out.print("Bus");
        }
    }
    
}