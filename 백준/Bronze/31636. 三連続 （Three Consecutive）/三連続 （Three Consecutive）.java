import java.util.Scanner;

public class Main {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String str = sc.next();
        String result = "No";
        
        if(n < 3) {
            System.out.print("No");
            return;
        }
        
        for(int i=0; i<n-2; i++) {
            if(str.charAt(i) == 'o' && str.charAt(i+1) == 'o' && str.charAt(i+2) == 'o') {
                result = "Yes";
                break;
            }
        }
        
        System.out.print(result);
    }
    
}