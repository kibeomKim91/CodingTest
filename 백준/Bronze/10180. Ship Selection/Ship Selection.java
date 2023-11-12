import java.util.Scanner;

public class Main {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        
        for(int i=0; i<t; i++) {
            int a = sc.nextInt();
            int b = sc.nextInt();
            int count = 0;
            
            for(int j=0; j<a; j++) {
                int x = sc.nextInt();
                int y = sc.nextInt();
                int z = sc.nextInt();
                double d = (double) x/z;
                
                if(d*y >= b) {
                    count++;
                }
            }
            
            System.out.println(count);
        }
    }
    
}