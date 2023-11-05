import java.util.Scanner;

public class Main {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        for(int i=0; i<3; i++) {
            int a = sc.nextInt();
            int b = sc.nextInt();
            int c = sc.nextInt();
            int x = sc.nextInt();
            int y = sc.nextInt();
            int z = sc.nextInt();
            
            if(c > z) {
                z += 60;
                y--;
            }
            
            if(b > y) {
                y += 60;
                x--;
            }
            
            System.out.println(x-a + " " + (y-b) + " " + (z-c));
        }
    }
    
}