import java.util.Scanner;

public class Main {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        
        for(int i=0; i<n; i++) {
            int a = sc.nextInt();
            int b = sc.nextInt();
            int c = sc.nextInt();
            int sum = 0;
            
            for(int j=0; j<a; j++) {
                int x = sc.nextInt();
                int y = sc.nextInt();
                
                if(b*c >= x) {
                    sum += y;
                }
            }
            
            System.out.println("Data Set " + (i+1) + ":");
            System.out.println(sum);
            System.out.println();
        }
    }
    
}