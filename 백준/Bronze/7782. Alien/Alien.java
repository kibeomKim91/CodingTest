import java.util.Scanner;

public class Main {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int a = sc.nextInt();
        int b = sc.nextInt();
        String result = "No";
        
        for(int i=0; i<n; i++) {
            int w = sc.nextInt();
            int x = sc.nextInt();
            int y = sc.nextInt();
            int z = sc.nextInt();
            
            if(a >= w && a <= y && b >= x && b <= z) {
                result = "Yes";
            }
        }
        
        System.out.print(result);
    }
    
}