import java.util.Scanner;

public class Main {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String str = sc.next();
        int strLength = str.length();
        int sum = 0;
        
        if(n<strLength) {
            System.out.print("Impossible");
            return;
        }
        
        for(int i=0; i<strLength; i++) {
            sum += str.charAt(i)-'a'+1;
        }
        
        System.out.print(sum);
    }
    
}
