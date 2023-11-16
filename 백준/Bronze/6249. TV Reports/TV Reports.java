import java.util.Scanner;

public class Main {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int a = sc.nextInt();
        int b = sc.nextInt();
        
        for(int i=0; i<n; i++) {
            int x = sc.nextInt();
            
            if(a > x) {
                System.out.println("NTV: Dollar dropped by "+(a-x)+" Oshloobs");
                a = x;
            } else if(b < x) {
                System.out.println("BBTV: Dollar reached "+x+" Oshloobs, A record!");
                b = x;
                a = x;
            } else {
                a = x;
            }
        }
    }
    
}