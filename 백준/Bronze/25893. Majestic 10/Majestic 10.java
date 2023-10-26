import java.util.Scanner;

public class Main {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        
        for(int i=0; i<n; i++) {
            int a = sc.nextInt();
            int b = sc.nextInt();
            int c = sc.nextInt();
            int count = 0;
            
            System.out.println(a + " " + b + " " + c);
            
            if(a >= 10) count++;
            if(b >= 10) count++;
            if(c >= 10) count++;
            
            if(count == 0) {
                System.out.println("zilch");
                System.out.println();
            } else if(count == 1) {
                System.out.println("double");
                System.out.println();
            } else if(count == 2) {
                System.out.println("double-double");
                System.out.println();
            } else if(count == 3) {
                System.out.println("triple-double");
                System.out.println();
            } 
        }
    }
    
}