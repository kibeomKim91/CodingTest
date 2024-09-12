import java.util.Scanner;

public class Main {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int sum = 0;
        
        for(int i=0; i<n; i++) {
            int a = sc.nextInt();
            int b = sc.nextInt();
            
            if(a==1) {
                sum += b;
            } else {
                sum -= b;
            }
            
            if(sum<0) {
                System.out.print("Adios");
                break;
            }
        }
        
        if(sum>=0) {
            System.out.print("See you next month");
        }
    }
    
}