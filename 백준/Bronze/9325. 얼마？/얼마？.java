import java.util.Scanner;

public class Main {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        
        for(int i=0; i<t; i++) {
            int price = sc.nextInt();
            int n = sc.nextInt();
            int sum = 0;
            
            if(n > 0) {
                for(int j=0; j<n; j++) {
                    int num = sc.nextInt();
                    int optionPrice = sc.nextInt();
                    
                    sum += num * optionPrice;
                }
            }
            
            sum += price;
            
            System.out.println(sum);
        }
    }
    
}