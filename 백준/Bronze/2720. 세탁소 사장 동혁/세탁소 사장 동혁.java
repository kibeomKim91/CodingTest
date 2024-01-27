import java.util.Scanner;

public class Main {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        
        for(int i=0; i<n; i++) {
            int num = sc.nextInt();
            int quarter = 0;
            int dime = 0;
            int nickel = 0;
            int penny = 0;
            
            quarter = num/25;
            num %= 25;
            dime = num/10;
            num %= 10;
            nickel = num/5;
            num %= 5;
            penny = num;
            
            System.out.println(quarter+" "+dime+" "+nickel+" "+penny);
        }
    }
    
}