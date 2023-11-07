import java.util.Scanner;

public class Main {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.nextLine();
        String str = sc.nextLine();
        String result = "";
        
        if(str.charAt(n-1) == 'G') {
            for(int i=0; i<n-1; i++) {
                result += str.charAt(i);
            }
        } else {
            for(int i=0; i<n; i++) {
                result += str.charAt(i);
            }
            
            result += 'G';
        }
        
        System.out.print(result);
    }
    
}