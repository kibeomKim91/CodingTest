import java.util.Scanner;

public class Main {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int a = 0;
        int b = 0;
        int copy = 0;
        
        for(int i=0; i<n; i++) {
            int num = sc.nextInt();
            if(i==0) {
                copy = num;
                continue;
            }
            
            if(copy<num) {
                b += num-copy;
            } else if(num<copy) {
                a += copy-num;
            }
            
            copy = num;
        }
        
        System.out.print(a+" "+b);
    }
    
}