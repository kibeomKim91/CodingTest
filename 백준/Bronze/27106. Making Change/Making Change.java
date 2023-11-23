import java.util.Scanner;

public class Main {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = 100 - sc.nextInt();
        
        int a = n/25;
        n %= 25;
        int b = n/10;
        n %= 10;
        int c = n/5;
        n %= 5;
        int d = n/1;
        
        System.out.print(a+" "+b+" "+c+" "+d);
    }
    
}