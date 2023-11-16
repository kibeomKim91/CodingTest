import java.util.Scanner;

public class Main {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        
        for(int i=0; i<c; i++) {
            int n = sc.nextInt();
            String str = "REMOVE";
            
            for(int j=0; j<n; j++) {
                int m = sc.nextInt();
                
                if(m == b) {
                    str = "KEEP";
                }
            }
            
            System.out.println(str);
        }        
    }
    
}