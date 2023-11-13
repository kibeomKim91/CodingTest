import java.util.Scanner;

public class Main {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        
        for(int i=0; i<n; i++) {
            int a = sc.nextInt();
            int b = sc.nextInt();
            int c = sc.nextInt();
            int d = sc.nextInt();
            int e = sc.nextInt();
            int f = sc.nextInt();
            int sum = 0;
            
            if(a > d) {
                a -= d;
            } else if(d > a) {
                a = d - a; 
            } else {
                a = 0;
            }
            
            if(b > e) {
                b -= e;
            } else if(e > b) {
                b = e - b; 
            } else {
                b = 0;
            }
            
            System.out.println(a+b+c+f);
        }
    }
    
}