import java.util.Scanner;

public class Main {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int sum = 0;
        
        if(a<1) {
            sum = b * 15;
        } else if(a>=1 && a<2) {
            sum = 15 * 12 + b * 9;
        } else if(a>=2) {
            sum = 15 * 12 + 9 * 12 + (a-2) * 4 * 12 + b * 4;
        }
        
        a = sum/12;
        b = sum%12;
        
        System.out.print(a+" "+b);
    }
    
}