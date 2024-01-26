import java.util.Scanner;

public class Main {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] today = sc.nextLine().split("-");
        int todayYear = Integer.parseInt(today[0]);
        int todayMonth = Integer.parseInt(today[1]);
        int todayDate = Integer.parseInt(today[2]);
        
        int n = sc.nextInt();
        int count = 0;
        sc.nextLine();
        
        for(int i=0; i<n; i++) {
            String[] expiry = sc.nextLine().split("-");
            int expiryYear = Integer.parseInt(expiry[0]);
            int expiryMonth = Integer.parseInt(expiry[1]);
            int expiryDate = Integer.parseInt(expiry[2]);
            
            if(expiryYear > todayYear) {
                count++;
            } else if(expiryYear == todayYear) {
                if(expiryMonth > todayMonth) {
                    count++;
                } else if(expiryMonth == todayMonth && expiryDate >= todayDate) {
                    count++;
                }
            }
        }
        
        System.out.print(count);
    }
    
}