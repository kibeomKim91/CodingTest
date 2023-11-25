import java.util.Scanner;

public class Main {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        
        for(int i=0; i<n; i++) {
            int a = sc.nextInt();
            String x = sc.next();
            int b = sc.nextInt();
            String y = sc.next();
            int c = sc.nextInt();
            
            if(x.equals("+")) {
                if(a+b == c) {
                    System.out.println("Case "+(i+1)+": YES");
                } else {
                    System.out.println("Case "+(i+1)+": NO");
                }
            } else {
                if(a-b == c) {
                    System.out.println("Case "+(i+1)+": YES");
                } else {
                    System.out.println("Case "+(i+1)+": NO");
                }
            }
        }
    }
    
}