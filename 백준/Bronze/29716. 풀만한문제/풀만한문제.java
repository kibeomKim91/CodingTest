import java.util.Scanner;

public class Main {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int j = sc.nextInt();
        int n = sc.nextInt();
        int result = 0;
        sc.nextLine();
        
        for(int i=0; i<n; i++) {
            String str = sc.nextLine();
            int strLength = str.length();
            int score = 0;
            
            for(int k=0; k<strLength; k++) {
                int num = (int) str.charAt(k);
                
                if(num>=65 && num<=90) {
                    score += 4;
                } else if(num>=97 && num<=122) {
                    score += 2;
                } else if(num>=48 && num<=57) {
                    score += 2;
                } else if(num==32) {
                    score += 1;
                }
            }
            
            if(j>=score) {
                result++;
            }
        }
        
        System.out.print(result);
    }
    
}