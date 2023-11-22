import java.util.Scanner;

public class Main {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        while(true) {
            int n = sc.nextInt();
            
            if(n == 0) {
                break;
            }
            
            int a = sc.nextInt();
            int b = sc.nextInt();
            
            for(int i=0; i<n; i++) {
                int x = sc.nextInt();
                int y = sc.nextInt();
                
                if(x>a && y>b) {
                    System.out.println("NE");
                } else if(x<a && y>b) {
                    System.out.println("NO");
                } else if(x<a && y<b) {
                    System.out.println("SO");
                } else if(x>a && y<b) {
                    System.out.println("SE");
                } else if(x == a || y == b) {
                    System.out.println("divisa");
                }
            }
        }
    }
    
}