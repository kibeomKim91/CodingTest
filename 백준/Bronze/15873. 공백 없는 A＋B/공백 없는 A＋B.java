import java.util.Scanner;

public class Main {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String str = Integer.toString(n);
        int strLength = str.length();
        int a = 0;
        int b = 0;
        
        if(str.charAt(1) == '0') {
            a = 10;
        } else {
            a = str.charAt(0) - '0';
        }
        
        if(strLength == 4 || (strLength == 3 && str.charAt(2) == '0')) {
            b = 10;
        } else if(strLength == 3 && str.charAt(1) == '0') {
            b = str.charAt(2) - '0';
        } else {
            b = str.charAt(1) - '0';
        }
        
        System.out.print(a+b);
    }
    
}