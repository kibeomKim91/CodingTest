import java.util.Scanner;

public class Main {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.nextLine();
        String result = "뭐야?";
        
        for(int i=0; i<n; i++) {
            String name = sc.nextLine();
            
            if(name.equals("anj")) {
                result = "뭐야;";
            }
        }
        
        System.out.print(result);
    }
    
}