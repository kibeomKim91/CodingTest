import java.util.Scanner;

public class Main {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.nextLine();
        
        for(int i=0; i<n; i++) {
            int sum = 0;
            String str = sc.nextLine();
            int strLength = str.length();
            
            for(int j=0; j<strLength; j++) {
                char ch = str.charAt(j);
                
                if(ch == ' ') {
                    continue;
                }
                
                sum += ch-'A'+1;
            }
            
            if(sum != 100) {
                System.out.println(sum);
            } else {
                System.out.println("PERFECT LIFE");
            }
        }
    }
    
}