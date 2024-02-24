import java.util.Scanner;

public class Main {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int count = 0;
        int milk = 0;
        
        for(int i=0; i<n; i++) {
            int num = sc.nextInt();
            
            if(milk == num) {
                if(milk == 2) {
                    milk = 0;
                } else {
                    milk++;
                }
                
                count++;
            }
        }
        
        System.out.print(count);
    }
    
}