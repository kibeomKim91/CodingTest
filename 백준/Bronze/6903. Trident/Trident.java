import java.util.Scanner;

public class Main {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        
        for(int i=0; i<a; i++) {
            System.out.print("*");
            
            for(int j=0; j<b; j++) {
                System.out.print(" ");
            }
            
            System.out.print("*");
            
            for(int j=0; j<b; j++) {
                System.out.print(" ");
            }
            
            System.out.println("*");
        }
        
        for(int i=0; i<2*b+3; i++) {
            System.out.print("*");
        }
        
        System.out.println("");
        
        for(int i=0; i<c; i++) {
            for(int j=0; j<b+1; j++) {
                System.out.print(" ");
            }
            
            System.out.println("*");
        }
    }
    
}