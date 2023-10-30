import java.util.Scanner;

public class Main {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int m = sc.nextInt();
        int s = sc.nextInt();
        int g = sc.nextInt();
        double a = sc.nextDouble();
        double b = sc.nextDouble();
        int l = sc.nextInt();
        int r = sc.nextInt();
        
        if(l/a+m/g < r/b+m/s) {
            System.out.print("friskus");
        } else {
            System.out.print("latmask");
        }
    }
    
}