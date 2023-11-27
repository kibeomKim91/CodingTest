import java.util.Scanner;

public class Main {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        
        for(int i=0; i<n; i++) {
            int num = sc.nextInt();
            char ch = sc.next().charAt(0);
            
            for(int j=0; j<num; j++) {
                for(int k=0; k<=j; k++) {
                    System.out.print(ch);
                }
                
                if(ch == 'Z') {
                    ch = 'A';
                } else {
                    ch++;
                }
                
                System.out.println();
            }
            
            System.out.println();
        }
    }
    
}