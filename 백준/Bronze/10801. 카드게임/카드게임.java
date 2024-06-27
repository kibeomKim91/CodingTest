import java.util.Scanner;

public class Main {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] a = new int[10];
        int[] b = new int[10];
        int aWin = 0;
        int bWin = 0;
        char result = 'D';
        
        for(int i=0; i<10; i++) {
            a[i] = sc.nextInt();
        }
        
        for(int i=0; i<10; i++) {
            b[i] = sc.nextInt();
            
            if(a[i]>b[i]) {
                aWin++;
            } else if(b[i]>a[i]) {
                bWin++;
            }
        }
        
        if(aWin>bWin) {
            result = 'A';
        } else if(bWin>aWin) {
            result = 'B';
        }
        
        System.out.print(result);
    }
    
}