import java.util.Scanner;

public class Main {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        while(true) {
            int n = sc.nextInt();
            
            if(n == 0) {
                break;
            }
            
            int mary = 0;
            int john = 0;
            
            for(int i=0; i<n; i++) {
                int headOrTail = sc.nextInt();
                
                if(headOrTail == 0) {
                    mary++;
                } else {
                    john++;
                }
            }
            
            System.out.println("Mary won "+mary+" times and John won "+john+" times");
        }
    }
    
}