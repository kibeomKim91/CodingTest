import java.util.Scanner;

public class Main {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int l = sc.nextInt();
        int d = sc.nextInt();
        int x = sc.nextInt();
        int min = 0;
        int max = 0;
        
        for(int i=l; i<=d; i++) {
            int sum = 0;
            int num = i;
            
            while(num>0) {
                sum += num%10;
                num /= 10;
            }
            
            if(sum == x) {
                min = i;
                break;
            }
        }
        
        for(int i=d; i>=l; i--) {
            int sum = 0;
            int num = i;
            
            while(num>0) {
                sum += num%10;
                num /= 10;
            }
            
            if(sum == x) {
                max = i;
                break;
            }
        }
        
        System.out.println(min);
        System.out.println(max);
    }
    
}