import java.util.Scanner;

public class Main {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        double c = sc.nextDouble();
        double d = sc.nextDouble();
        
        if((a >= c/2 && b >= d) || a >= d/2 && b >= c) {
            System.out.print("YES");
        } else {
            System.out.print("NO");
        }
    }
    
}