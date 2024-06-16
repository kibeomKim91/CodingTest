import java.util.Scanner;

public class Main {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String a = sc.next();
        String b = sc.next();
        int aLength = a.length();
        int bLength = b.length();
        int aa = Integer.parseInt(a);
        int bb = Integer.parseInt(b);
        int max = 0;
        int min = 0;
        int powNum = 0;
        
        for(int i=0; i<aLength; i++) {
            int num = aa%10;
            int multiplicand = (int) Math.pow(10, powNum);
            
            if(num<5 || num>6) {
                max += num * multiplicand;
                min += num * multiplicand;
            } else {
                max += 6 * multiplicand;
                min += 5 * multiplicand;
            }
            
            aa /= 10;
            powNum++;
        }
        
        powNum = 0;
        
        for(int i=0; i<bLength; i++) {
            int num = bb%10;
            int multiplicand = (int) Math.pow(10, powNum);
            
            if(num<5 || num>6) {
                max += num * multiplicand;
                min += num * multiplicand;
            } else {
                max += 6 * multiplicand;
                min += 5 * multiplicand;
            }
            
            bb /= 10;
            powNum++;
        }
        
        System.out.print(min+" "+max);
    }
    
}