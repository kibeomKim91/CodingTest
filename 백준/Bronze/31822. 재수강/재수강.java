import java.util.Scanner;

public class Main {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String reCode = sc.next().substring(0, 5);
        int n = sc.nextInt();
        int count = 0;
        
        for(int i=0; i<n; i++) {
            String code = sc.next().substring(0, 5);
            if(reCode.equals(code)) {
                count++;
            }
        }
        
        System.out.print(count);
    }
    
}