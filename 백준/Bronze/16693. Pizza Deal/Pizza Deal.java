import java.util.Scanner;

public class Main {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        int d = sc.nextInt();
        
        double aa = a;
        double cc = c*c*Math.PI;
        
        if(aa/b > cc/d) {
            System.out.print("Slice of pizza");
        } else {
            System.out.print("Whole pizza");
        }
    }
    
}