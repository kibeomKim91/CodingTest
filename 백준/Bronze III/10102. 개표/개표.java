import java.util.Scanner;

public class Main {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String str = sc.next();
        int a = 0;
        int b = 0;
        
        for(int i=0; i<n; i++) {
            if(str.charAt(i) == 'A') {
                a++;
            } else {
                b++;
            }
        }
        
        if(a>b) {
            System.out.print('A');
        } else if(b>a) {
            System.out.print('B');
        } else {
            System.out.print("Tie");
        }
    }
    
}