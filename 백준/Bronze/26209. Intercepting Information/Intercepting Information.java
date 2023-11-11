import java.util.Scanner;

public class Main {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = 0;
        
        for(int i=0; i<8; i++) {
            int n = sc.nextInt();
            
            if(n > num) {
                num = n;
            }
        }
        
        if(num == 0 || num == 1) {
            System.out.print('S');
        } else {
            System.out.print('F');
        }
    }
    
}