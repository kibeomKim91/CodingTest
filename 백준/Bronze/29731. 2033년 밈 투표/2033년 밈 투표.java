import java.util.Scanner;

public class Main {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.nextLine();
        int no = 0;
        int yes = 0;
        
        for(int i=0; i<n; i++) {
            String str = sc.nextLine();
            
            if(str.equals("Never gonna give you up") ||
              str.equals("Never gonna let you down") || 
              str.equals("Never gonna run around and desert you") || 
              str.equals("Never gonna make you cry") || 
              str.equals("Never gonna say goodbye") || 
              str.equals("Never gonna tell a lie and hurt you") || 
              str.equals("Never gonna stop")) {
                no++;
            } else {
                yes++;
            }
        }
        
        if(yes > 0) {
            System.out.print("Yes");
        } else {
            System.out.print("No");
        }
    }
    
}