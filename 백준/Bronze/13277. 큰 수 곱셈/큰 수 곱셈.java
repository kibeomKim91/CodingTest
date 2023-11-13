import java.util.Scanner;
import java.math.BigInteger;

public class Main {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String a = sc.next();
        String b = sc.next();
        
        BigInteger aa = new BigInteger(a);
        BigInteger bb = new BigInteger(b);
        
        System.out.print(aa.multiply(bb));
    }
    
}