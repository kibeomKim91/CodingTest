import java.util.Scanner;

public class Main {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        int a = Integer.parseInt(str.substring(0, 2));
        int b = Integer.parseInt(str.substring(3, 5));
        String result = "";
        
        if(a>12) {
            result = "EU";
        } else if(b>12) {
            result = "US";
        } else {
            result = "either";
        }
        
        System.out.print(result);
    }
    
}