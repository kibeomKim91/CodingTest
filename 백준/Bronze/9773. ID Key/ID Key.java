import java.util.Scanner;

public class Main {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        
        for(int i=0; i<n; i++) {
            String str = sc.next();
            int sum = 0;
            
            for(int j=0; j<13; j++) {
                sum += str.charAt(j) - '0';
            }
            
            String sub = str.substring(10);
            sum += Integer.parseInt(sub) * 10;
            
            if(sum < 1000) {
                sum += 1000;
            }
            
            String key = Integer.toString(sum);
            if(key.length() == 4) {
                System.out.println(key);
            } else {
                System.out.println(key.substring(1));
            }
        }
    }
    
}