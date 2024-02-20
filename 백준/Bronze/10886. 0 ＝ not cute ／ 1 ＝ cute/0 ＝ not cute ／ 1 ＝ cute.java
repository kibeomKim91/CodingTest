import java.util.Scanner;

public class Main {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int cute = 0;
        int notCute = 0;
        
        for(int i=0; i<n; i++) {
            int num = sc.nextInt();
            
            if(num == 1) {
                cute++;
            } else {
                notCute++;
            }
        }
        
        if(cute > notCute) {
            System.out.print("Junhee is cute!");
        } else {
            System.out.print("Junhee is not cute!");
        }
    }
    
}