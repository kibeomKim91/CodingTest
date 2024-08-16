import java.util.Scanner;

public class Main {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int carlos = sc.nextInt();
        int max = carlos;
        
        for(int i=0; i<n-1; i++) {
            int num = sc.nextInt();
            
            if(max<num) {
                max = num;
            }
        }
        
        if(carlos==max) {
            System.out.print('S');
        } else {
            System.out.print('N');
        }
    }
    
}