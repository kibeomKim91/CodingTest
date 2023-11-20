import java.util.Scanner;

public class Main {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.nextLine();
        String result = "";
        
        for(int i=0; i<n; i++) {
            String str = sc.nextLine();
            
            if(str.contains("S")) {
                result = str;
            }
        }
        
        System.out.print(result);
    }
    
}