import java.util.Scanner;

public class Main {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int sum = 0;
        
        for(int i=0; i<3; i++) {
            int a = sc.nextInt();
            if(n <= a) {
                sum += n;
            } else {
                sum += a;
            }            
        }
        
        System.out.print(sum);        
    }
    
}