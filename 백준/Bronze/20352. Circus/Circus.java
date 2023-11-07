import java.util.Scanner;

public class Main {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long n = sc.nextLong();
        double d = Math.sqrt(n/Math.PI);
        System.out.print(d*2*Math.PI);
    }
    
}