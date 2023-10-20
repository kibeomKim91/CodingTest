import java.util.Scanner;

public class Main {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String jinho = sc.nextLine();
        int n = sc.nextInt();
        sc.nextLine();
        int count = 0;
        
        for(int i=0; i<n; i++) {
            String friend = sc.next();
            
            if(jinho.equals(friend)) {
                count++;
            }
        }
        
        System.out.print(count);
    }
    
}