import java.util.Scanner;

public class Main {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String result = "";
        int maxMoney = 0;
        
        for(int i=0; i<n; i++) {
            int money = sc.nextInt();
            String name = sc.next();
            String country = sc.next();
            
            if(money > maxMoney && country.equals("Russia")) {
                result = name;
                maxMoney = money;
            }
        }
        
        System.out.print(result);
    }
    
}