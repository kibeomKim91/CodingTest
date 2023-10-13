import java.util.Scanner;

public class Main {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int sum = 0;
        int sumCopy = 0;
        
        for(int i=0; i<n; i++) {
            int a = sc.nextInt();
            int d = sc.nextInt();
            int g = sc.nextInt();
            
            if(a == d + g) {
                sum = 2 * a * (d + g);
            } else {
                sum = a * (d + g);
            }
            
            if(sumCopy < sum) {
                sumCopy = sum;
            }
        }
        
        System.out.print(sumCopy);
    }
    
}