import java.util.Scanner;

public class Main {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        
        if(a >= 1000 && (b >= 8000 || c >= 260)) {
            System.out.print("Very Good");
        } else if(a >= 1000 && (b < 8000 || c < 260)) {
            System.out.print("Good");
        } else if(a < 1000) {
            System.out.print("Bad");
        }
    }
    
}