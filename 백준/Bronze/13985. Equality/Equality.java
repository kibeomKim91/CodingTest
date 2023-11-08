import java.util.Scanner;

public class Main {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        
        int a = str.charAt(0) - '0';
        int b = str.charAt(4) - '0';
        int c = str.charAt(8) - '0';
        
        if(a+b == c) {
            System.out.print("YES");
        } else {
            System.out.print("NO");
        }
    }
    
}