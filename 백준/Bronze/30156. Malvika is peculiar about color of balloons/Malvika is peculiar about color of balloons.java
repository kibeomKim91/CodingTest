import java.util.Scanner;

public class Main {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        
        for(int i=0; i<n; i++) {
            String str = sc.next();
            int strLength = str.length();
            int a = 0;
            int b = 0;
            
            for(int j=0; j<strLength; j++) {
                if(str.charAt(j) == 'a') {
                    a++;
                } else {
                    b++;
                }
            }
            
            if(a == 0 || b == 0) {
                System.out.println(0);
            } else if(a > b) {
                System.out.println(b);
            } else {
                System.out.println(a);
            }
        }
    }
    
}