import java.util.Scanner;

public class Main {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int copy = 0;
        
        for(int i=0; i<n; i++) {
            int num = sc.nextInt();
            
            if(copy == 0) {
                copy = num;
            } else {
                if(num%copy == 0) {
                    System.out.println(num);
                    copy = 0;
                }
            }
        }
    }
    
}