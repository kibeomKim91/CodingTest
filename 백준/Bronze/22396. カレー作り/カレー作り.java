import java.util.Scanner;

public class Main {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        while(true) {
            int r0 = sc.nextInt();
            int w = sc.nextInt();
            int c = sc.nextInt();
            int r = sc.nextInt();
            
            if(r0==0 && w==0 && c==0 && r==0) {
                break;
            }
            
            if(w*c<=r0) {
                System.out.println(0);
            } else if((w*c-r0)%r>0) {
                System.out.println((w*c-r0)/r+1);
            } else {
                System.out.println((w*c-r0)/r);
            }
        }
    }
    
}