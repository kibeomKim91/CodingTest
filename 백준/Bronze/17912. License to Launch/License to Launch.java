import java.util.Scanner;

public class Main {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int min = 0;
        int result = 0;
        
        for(int i=0; i<n; i++) {
            int num = sc.nextInt();
            
            if(i > 0) {
                if(num < min) {
                    min = num;
                    result = i;
                }
            } else {
                min = num;
            }
        }
        
        System.out.print(result);
    }
    
}