import java.util.Scanner;

public class Main {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int a = sc.nextInt();
        int num = 1;
        
        for(int i=0; i<n-1; i++) {
            int b = sc.nextInt();
            
            if(b > a) {
                num++;
            }
        }
        
        System.out.print(num);
    }
    
}