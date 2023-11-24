import java.util.Scanner;

public class Main {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int large = 0;
        int min = 0;
        
        for(int i=1; i<=6; i++) {
            int num = sc.nextInt();
            int money = 0;
            
            if(i == 1) {
                money = num*1;
            } else if(i == 2) {
                money = num*5;
            } else if(i == 3) {
                money = num*10;
            } else if(i == 4) {
                money = num*20;
            } else if(i == 5) {
                money = num*50;
            } else if(i == 6) {
                money = num*100;
            } 
            
            if(money > large) {
                large = money;
                min = num;
            } else if(money == large && num < min) {
                min = num;
            }
        }
        
        System.out.print(large/min);
    }
    
}