import java.util.Scanner;

public class Main {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.nextLine();
        
        for(int i=0; i<n; i++) {
            String pw = sc.next();
            int pwLength = pw.length();
            
            if(pwLength >= 6 && pwLength <= 9) {
                System.out.println("yes");
            } else {
                System.out.println("no");
            }
        }
    }
    
}