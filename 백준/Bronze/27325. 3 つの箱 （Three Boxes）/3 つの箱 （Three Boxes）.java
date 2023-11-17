import java.util.Scanner;

public class Main {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.nextLine();
        String str = sc.nextLine();
        int count = 1;
        int result = 0;
        
        for(int i=0; i<n; i++) {
            if(str.charAt(i) == 'L') {
                if(count != 1) {
                    count--;
                }
            } else {
                if(count != 3) {
                    count++;
                }
            }
            
            if(count == 3) {
                result++;
            }
        }
        
        System.out.print(result);
    }
    
}