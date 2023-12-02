import java.util.Scanner;

public class Main {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int soft = 0;
        int im = 0;
        int in = 0;
        int other = 0;
        
        for(int i=0; i<n; i++) {
            int a = sc.nextInt();
            int b = sc.nextInt();
            int c = sc.nextInt();
            
            if(a >= 2) {
                if(b == 1 || b == 2) {
                    soft++;
                } else if(b == 3) {
                    im++;
                } else if(b == 4) {
                    in++;
                } else {
                    other++;
                }
            } else {
                other++;
            }
        }
        
        System.out.println(soft);
        System.out.println(im);
        System.out.println(in);
        System.out.println(other);
    }
    
}