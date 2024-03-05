import java.util.Scanner;

public class Main {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int count = 0;
        
        for(int i=0; i<3; i++) {
            for(int j=0; j<n; j++) {
                int num = sc.nextInt();
                
                if(num == 7) {
                    count++;
                }
            }
        }
        
        if(count == 3) {
            System.out.print(777);
        } else {
            System.out.print(0);
        }
    }
    
}