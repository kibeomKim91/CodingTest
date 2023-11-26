import java.util.Scanner;

public class Main {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        
        for(int i=0; i<n; i++) {
            int max = 0;
            
            for(int j=0; j<5; j++) {
                int num = sc.nextInt();
                
                if(num > max) {
                    max = num;
                }
            }
            
            System.out.println("Case #"+(i+1)+": "+max);
        }
    }
    
}