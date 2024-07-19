import java.util.Scanner;

public class Main {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char ch = sc.next().charAt(0);
        String str = "ILOVEYONSEI";
        int strLength = str.length();
        int sum = 0;
        
        for(int i=0; i<strLength; i++) {
            char c = str.charAt(i);
            sum += Math.abs(ch-c);
            ch = c;
        }
        
        System.out.print(sum);
    }
    
}