import java.util.Scanner;

public class Main {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String str = sc.next();
        int result = 0;
        
        for(int i=0; i<n; i++) {
            char ch = str.charAt(i);
            
            if(ch == 'j' || ch == 'i') {
                result = result+2;
            } else {
                result++;
            }
        }
        
        System.out.print(result);
    }
    
}