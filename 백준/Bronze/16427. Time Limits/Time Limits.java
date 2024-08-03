import java.util.Scanner;

public class Main {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int s = sc.nextInt();
        int sum = 0;
        int max = 0;
        
        for(int i=0; i<n; i++) {
            int num = sc.nextInt()*s;
            
            if(num%1000 > 0) {
                sum = num/1000+1;
            } else {
                sum = num/1000;
            }
            
            if(sum > max) {
                max = sum;
            }
        }
        
        System.out.print(max);
    }
    
}