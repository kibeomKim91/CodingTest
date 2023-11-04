import java.util.Scanner;

public class Main {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.nextLine();
        int count = 0;
        
        for(int i=0; i<n; i++) {
            String str = sc.nextLine();
            
            if(str.contains("01") || str.contains("OI")) {
                count++;
            }
        }
        
        System.out.print(count);
    }
    
}