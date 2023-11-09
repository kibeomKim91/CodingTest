import java.util.Scanner;

public class Main {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        sc.nextLine();
        int result = 0;
        
        for(int i=0; i<a; i++) {
            String str = sc.nextLine();
            int sum = 0;
            
            for(int j=0; j<b; j++) {
                if(str.charAt(j) == '+') {
                    sum++;
                }
            }
            
            if(sum >= 1) {
                result++;
            }
        }
        
        System.out.print(result);
    }
    
}