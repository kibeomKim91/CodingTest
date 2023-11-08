import java.util.Scanner;

public class Main {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt()*3;
        int b = sc.nextInt()*2;
        int c = sc.nextInt();
        int d = sc.nextInt()*3;
        int e = sc.nextInt()*2;
        int f = sc.nextInt();
        
        if(a+b+c > d+e+f) {
            System.out.print('A');
        } else if(a+b+c < d+e+f) {
            System.out.print('B');
        } else {
            System.out.print('T');
        }
    }
    
}