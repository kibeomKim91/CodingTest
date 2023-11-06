import java.util.Scanner;

public class Main {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int n = sc.nextInt();
        
        for(int i=0; i<n; i++) {
            int x = sc.nextInt();
            
            if(x <= 1000) {
                System.out.println(x+" "+x*a);
            } else {
                System.out.println(x+" "+(1000*a+(x-1000)*b));
            }
        }
    }
    
}