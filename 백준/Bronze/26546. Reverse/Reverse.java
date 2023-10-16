import java.util.Scanner;

public class Main {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        
        for(int i=0; i<n; i++) {
            StringBuilder sb = new StringBuilder();
            sc.nextLine();
            String str = sc.next();
            int j = sc.nextInt();
            int k = sc.nextInt() - 1;
            int strLength = str.length();
            
            for(int l=0; l<strLength; l++) {
                if(l >= j && l <= k) {
                    continue;
                } else {
                    sb.append(str.charAt(l));
                }
            }
            
            System.out.println(sb.toString());
        }
    }
    
}