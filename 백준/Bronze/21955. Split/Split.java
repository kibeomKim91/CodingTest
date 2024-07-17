import java.util.Scanner;

public class Main {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        int strLength = str.length();
        String first = str.substring(0, strLength/2);
        String second = str.substring(strLength/2);
        
        System.out.print(first+" "+second);
    }
    
}