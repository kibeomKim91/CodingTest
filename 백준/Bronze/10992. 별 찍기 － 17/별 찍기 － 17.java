import java.util.Scanner;

public class Main {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int nUp = n+1;
        int nDown = n-1;
        
        for(int i=1; i<=n; i++) {
            if(i < n) {
                System.out.print(" ");
            } else {
                System.out.println("*");
            }
        }
        
        if(n >= 3) {
            for(int i=1; i<=n-2; i++) {
                for(int j=1; j<=nUp; j++) {
                    if(j < nUp && j != nDown) {
                        System.out.print(" ");
                    } else {
                        System.out.print("*");
                    }
                }
                
                nUp++;
                nDown--;
                System.out.println("");
            }
        }
        
        if(n >= 2) {
            for(int i=1; i<=nUp; i++) {
                System.out.print("*");
            }
        }
    }
    
}