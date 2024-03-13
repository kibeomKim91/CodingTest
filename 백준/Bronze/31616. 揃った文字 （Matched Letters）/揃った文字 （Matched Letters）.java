import java.util.Scanner;

public class Main {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String str = sc.next();
        int strLength = str.length();
        char ch = str.charAt(0);
        String result = "Yes";
        
        for(int i=1; i<strLength; i++) {
            if(str.charAt(i) != ch) {
                result = "No";
            }
        }
        
        System.out.print(result);
    }
    
}