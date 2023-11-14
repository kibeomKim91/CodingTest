import java.util.Scanner;

public class Main {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String a = sc.next();
        String b = sc.next();
        
        int aLength = a.length();
        int bLength = b.length();
        
        if(aLength >= bLength) {
            System.out.print("go");
        } else {
            System.out.print("no");
        }
    }
    
}