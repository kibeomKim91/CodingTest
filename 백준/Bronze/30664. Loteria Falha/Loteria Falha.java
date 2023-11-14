import java.util.Scanner;
import java.math.BigInteger;

public class Main {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        BigInteger n = new BigInteger("42");
        
        while(true) {
            String str = sc.nextLine();
            
            if(str.equals("0")) {
                break;
            }
            
            BigInteger bi = new BigInteger(str);
            
            if(bi.mod(n).equals(BigInteger.ZERO)) {
                System.out.println("PREMIADO");
            } else {
                System.out.println("TENTE NOVAMENTE");
            }
        }
    }
    
}