import java.util.Scanner;

public class Main {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.nextLine();
        
        for(int i=0; i<n; i++) {
            String str = sc.nextLine();
            StringBuilder sb = new StringBuilder();
            sb.append(str.charAt(0));
            int strLength = str.length();
            
            for(int j=1; j<strLength; j++) {
                if(str.charAt(j) == str.charAt(j-1)) {
                    continue;
                } else {
                    sb.append(str.charAt(j));
                }
            }
            
            System.out.println(sb.toString());
        }
    }
    
}