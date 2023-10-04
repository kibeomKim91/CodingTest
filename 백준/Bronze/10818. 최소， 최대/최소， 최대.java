import java.util.Scanner;

public class Main {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int min = 1000000;
        int max = -1000000;
        int num;
        
        for(int i=0; i<N; i++) {
            num = sc.nextInt();
            
            if(num < min) {
                min = num;
            }
            if(num > max) {
                max = num;
            }
        }
        
        System.out.println(min);
        System.out.println(max);
    }
    
}