import java.util.Scanner;

public class Main {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int money = 0;
        
        for(int i=0; i<n; i++) {
            int a = sc.nextInt();
            int b = sc.nextInt();
            
            if(a == 136) {
                money += 1000;
            } else if(a == 142) {
                money += 5000;
            } else if(a == 148) {
                money += 10000;
            } else if(a == 154) {
                money += 50000;
            }
        }
        
        System.out.print(money);
    }
    
}