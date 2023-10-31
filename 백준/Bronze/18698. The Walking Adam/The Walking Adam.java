import java.util.Scanner;

public class Main {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.nextLine();
        
        for(int i=0; i<n; i++) {
            String str = sc.nextLine();
            int u = 0;
            int d = 0;
            
            for(char ch : str.toCharArray()) {
                if(ch == 'U' && d == 0) {
                    u++;
                } else if(ch == 'D') {
                    d++;
                }
            }
            
            System.out.println(u);
        }
    }
    
}