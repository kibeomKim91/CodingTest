import java.util.Scanner;

public class Main {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String str = sc.next();
        int coffee = 0;
        int result = 0;
        
        for(int i=0; i<n; i++) {
            if(str.charAt(i) == '1') {
                result++;
                coffee = 2;
            } else if(coffee > 0) {
                result++;
                coffee--;
            }
        }
        
        System.out.print(result);
    }
    
}