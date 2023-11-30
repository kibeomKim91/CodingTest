import java.util.Scanner;

public class Main {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        
        for(int i=0; i<t; i++) {
            int n = sc.nextInt();
            System.out.println("Case "+(i+1)+":");
            
            for(int j=0; j<n; j++) {
                int num = sc.nextInt();
                num++;
                
                if(num <= 6) {
                    System.out.println(num);
                }
            }
        }
    }
    
}