import java.util.Scanner;

public class Main {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int large = 0;
        int small = 0;
        
        for(int i=0; i<n; i++) {
            int a = sc.nextInt();
            int b = sc.nextInt();
            int c = sc.nextInt();
            
            if(a >= b) {
                large = a;
                small = b;
            } else {
                large = b;
                small = a;
            }
            
            for(int j=0; j<c; j++) {
                if(large >= small) {
                    large /= 2;
                } else {
                    small /= 2;
                }
            }
            
            System.out.println("Data set: " + a + " " + b + " " + c);
            
            if(large >= small) {                
                System.out.println(large + " " + small);
            } else {
                System.out.println(small + " " + large);
            }
            
            if(i+1 != n) {
                System.out.println();
            }            
        }
    }
        
}