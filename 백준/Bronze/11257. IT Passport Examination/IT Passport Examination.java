import java.util.Scanner;

public class Main {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        
        for(int i=0; i<n; i++) {
            int a = sc.nextInt();
            int b = sc.nextInt();
            int c = sc.nextInt();
            int d = sc.nextInt();
            
            if(b < 10.5 || c < 7.5 || d < 12 || b+c+d < 55) {
                System.out.println(a + " " + (b+c+d) + " FAIL");
            } else {
                System.out.println(a + " " + (b+c+d) + " PASS");
            }
        }
    }
    
}