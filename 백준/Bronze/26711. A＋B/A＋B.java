import java.util.Scanner;
import java.math.BigInteger;

public class Main {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String a = sc.nextLine();
        String b = sc.nextLine();
        BigInteger A = new BigInteger(a);
        BigInteger B = new BigInteger(b);
        
        System.out.print(A.add(B));
    }
    
}