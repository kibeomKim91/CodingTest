import java.util.Scanner;

public class Main {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int count = 0;
        
        for(int i=0; i<n; i++) {
            int a = sc.nextInt()*5;
            int b = sc.nextInt()*3;
            
            if(a-b > 40) {
                count++;
            }
        }
        
        if(count == n) {
            System.out.print(count+"+");
        } else {
            System.out.print(count);
        }
    }
    
}