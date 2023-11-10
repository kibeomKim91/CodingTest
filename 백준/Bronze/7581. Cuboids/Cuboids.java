import java.util.Scanner;

public class Main {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        while(true) {
            int a = sc.nextInt();
            int b = sc.nextInt();
            int c = sc.nextInt();
            int d = sc.nextInt();
            
            if(a == 0 && b == 0 && c == 0 && d == 0) {
                break;
            }
            
            if(a == 0) {
                a = d/c/b;
            } else if(b == 0) {
                b = d/c/a;
            } else if(c == 0) {
                c = d/a/b;
            } else {
                d = a*b*c;
            }
            
            System.out.println(a+" "+b+" "+c+" "+d);
        }
    }
    
}