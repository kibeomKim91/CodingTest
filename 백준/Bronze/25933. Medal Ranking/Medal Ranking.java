import java.util.Scanner;

public class Main {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        
        for(int i=0; i<n; i++) {
            int a = sc.nextInt();
            int b = sc.nextInt();
            int c = sc.nextInt();
            int x = sc.nextInt();
            int y = sc.nextInt();
            int z = sc.nextInt();
            int count = 0;
            int color = 0;
            
            if(a+b+c>x+y+z) {
                count++;
            }
            
            if(a>x) {
                color++;
            } else if(a==x && b>y) {
                color++;
            } else if(a==x && b==y && c>z) {
                color++;
            }
            
            System.out.println(a+" "+b+" "+c+" "+x+" "+y+" "+z);
            if(count==1 && color==1) {
                System.out.println("both");
            } else if(count==1) {
                System.out.println("count");
            } else if(color==1) {
                System.out.println("color");
            } else {
                System.out.println("none");
            }
            
            System.out.println();
        }
    }
    
}