import java.util.Scanner;

public class Main {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        
        for(int i=0; i<n; i++) {
            int zack = 0;
            int mack = 0;
            
            for(int j=0; j<10; j++) {
                int a = sc.nextInt();
                System.out.print(a + " ");
                
                if(a == 18) {
                    mack++;
                } else if(a == 17) {
                    zack++;
                }
            }
            
            System.out.println();
            if(mack == 1 && zack == 1) {
                System.out.println("both");
            } else if(mack == 1 && zack == 0) {
                System.out.println("mack");
            } else if(mack == 0 && zack == 1) {
                System.out.println("zack");
            } else if(mack == 0 && zack == 0) {
                System.out.println("none");
            }
            System.out.println();
        }
    }
    
}