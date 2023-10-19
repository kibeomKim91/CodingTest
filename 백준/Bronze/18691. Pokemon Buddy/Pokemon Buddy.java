import java.util.Scanner;

public class Main {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        
        for(int i=0; i<t; i++) {
            int g = sc.nextInt();
            int c = sc.nextInt();
            int e = sc.nextInt();
            
            if(c >= e) {
                System.out.println(0);
                continue;
            }
            
            if(g == 1) {
                System.out.println(e-c);
            } else if(g == 2) {
                System.out.println((e-c)*3);
            } else {
                System.out.println((e-c)*5);
            }
        }
        
        sc.close();
    }
    
}